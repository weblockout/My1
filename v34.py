### Скрипт: "The Final Truth" (v34)

```python
import hashlib
import hmac
from bip32 import BIP32

# ТВОИ ДАННЫЕ
LOGIN = "buginot"
PASSWORD = "ScvDbn70@"
TARGET = "d8c286459e9ed882a868c195672c2bce117bf0455dd9765c6d05a54272b4b420"

def get_keys():
    print(f"[*] Цель: {TARGET[:15]}...")
    
    # 1. Вычисляем ПРАВИЛЬНЫЙ Hash2 (как в accounts.json)
    # Сначала SHA256 от байтов, потом SHA256 от полученных байтов
    auth_bytes = (LOGIN + PASSWORD).encode('utf-8')
    h1 = hashlib.sha256(auth_bytes).digest()
    h2_bin = hashlib.sha256(h1).digest()
    h2_hex = h2_bin.hex()
    
    print(f"[*] Шаг 1: Hash2 (из accounts.json) = {h2_hex}")
    # Должно быть: e4c3ea79682cc507ebc53a76e01916564cd859e9f7f128749288534ce3c725e0

    # 2. Используем эту HEX-СТРОКУ как Seed для BIP32
    # В JS: HDKey.fromMasterSeed(Buffer.from("e4c3..."))
    seed = h2_hex.encode('ascii')
    
    # 3. Имитируем JS hdkey (HMAC-SHA512 с "Bitcoin seed")
    I = hmac.new(b"Bitcoin seed", seed, hashlib.sha512).digest()
    master_priv = I[:32]
    master_chain = I[32:]
    bip = BIP32(master_priv, master_chain)
    
    print("\n[ ПРОВЕРКА ИНДЕКСОВ ]:")
    for i in range(5):
        child = bip.get_privkey_from_path([i]).hex()
        print(f"Индекс {i}: {child}")
        
        if child == TARGET:
            print(f"\n[!!!] ПОЛНАЯ ПОБЕДА! НАЙДЕНО НА ИНДЕКСЕ {i}!")
            return

    print("\n[-] Не совпало. Проверяю вариант, где Seed - это сами БАЙТЫ Hash2...")
    bip_bin = BIP32.from_seed(h2_bin)
    for i in range(5):
        if bip_bin.get_privkey_from_path([i]).hex() == TARGET:
            print(f"[!!!] НАЙДЕНО! Seed = Hash2_Bytes, Индекс {i}")
            return

if __name__ == "__main__":
    get_keys()


Ответ:
[*] Цель: d8c286459e9ed88...
[*] Шаг 1: Hash2 (из accounts.json) = 70f8c17d21ebfecb241585fc4aa68837e03cb7c17007be6914f3844ddae9400d

[ ПРОВЕРКА ИНДЕКСОВ ]:
Индекс 0: e72fba5bac70e0dc08270176324081bf4cb1c38d4d2241f3056ff6354ac255e7
Индекс 1: 4ef0b123a9cfb1069dbfc3804bf4268071b5e29b6791eeaa1ae0c8926bf0e407
Индекс 2: d8c27f84ac39066a2d8239833c88da1cf0e30771ec66b4c3c293afa85c778a84
Индекс 3: 751ff0818d474973799484d4b615ff7f16e454163d8d0bb588de5c8ab81e67cd
Индекс 4: 4c1e431ecc88498ddfa51144fd6f795932d2fe0b4126d5c40125a7f0d0bfaac9

[-] Не совпало. Проверяю вариант, где Seed - это сами БАЙТЫ Hash2...
