package my1;

public class Potoki_thread_0 {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Potoki_class_0("1")); //создаем дополнительный поток и отправляем из конструктора String name - 1
		// Создаем еще два потока
		Thread t2 = new Thread(new Potoki_class_0("2"));
		Thread t3 = new Thread(new Potoki_class_0("3"));
		
		// Запускаем потоки
		t1.start();
		t2.start();
		t3.start();
		
	}

}
