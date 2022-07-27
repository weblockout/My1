package my1;

public class Rabota_so_strokami {

	public static void main(String[] args) {
		
/*		String[] auto = {"Волга", "Чайка", "Жигули"}; //задан массив строк
		String result = "В гараже стоят машины: "; //задана строка

		//прибавляем к строке элементы массива
		for(int i = 0; i < auto.length; i++){
		   //если элемент не последний, разделяем запятой
		   if(i != auto.length-1 )
		      result += auto[i] + ", ";
		   //если последний, ставим после него точку
		   else
		      result += auto[i] + ".";
		}
		//выводим результат
		System.out.print(result);  */
		
		
		
		
		// String concat(String str) — производит ту же конкатенацию, 
		// (String result1 = animals[0] + " ест " + food[0];
		// String result2 = animals[1] + " ест " + food[1]; ), 
		//но использование этого метода из класса String положительно влияет на производительность и скорость программы
		
	/*	String[] animals = {"Хаски","Морж"};// массив строк 1
		String[] food = {"колбаски","корж"}; // массив строк 2

		//составляем строки из элементов массивов и связующего слова
		String result1 = animals[0].concat(" ест ").concat(food[0]);
		String result2 = animals[1].concat(" ест ").concat(food[1]);

		//выводим на консоль
		System.out.println(result1);
		System.out.println(result2);  */
	
		
	
		
		
		//Извлечение символов из строки
		//Если нам требуется узнать, какой символ находиться в строке на конкретной позиции, можем использовать метод charAt.
		
	/*	String str = "Последний символ в этой строке - о";
		int last = str.length()-1;//длина строки - 1, так как отсчет начинается с 0
		char ch = str.charAt(last);
		System.out.println("Последний символ строки: " + ch); 
		System.out.println("Длина строки: " + str.length());  */
	
		
		
		
		
		
	//поменять в строке символы пробела на точки при помощи преобразования в массив символов
	//	(для этой задачи есть более простое решение, нежели преобразование в массив, но об этом чуть позже).
		
	//char[]  toCharArray()  — преобразует строку в новый массив символов.	
		
	/*	String str = "1 000 000 000";
		//преобразовываем строку в массив
		char[] chArray = str.toCharArray();
		//перебираем все элементы массива
		for(int i = 0; i<chArray.length; i++){
		        //находим пробел	
			if(chArray[i] == ' '){
		                //заменяем на точку
				chArray[i] = '.';
			
		        }	
		}
		//выводим результат
		System.out.println(chArray);  */


		
		
		
		//Извлечение подстроки из строки
		//String substring(int beginIndex, int endIndex) или  substring(int beginIndex) 
				
	/*	String s = "www.mysite.com";
		String name = s.substring(4, s.length()-4);
		System.out.println(name); // на консоль выведет "mysite"

		String domain = s.substring(4);
		System.out.println(domain); // на консоль выведет "mysite.com"  */
		
		
		
		
		
		//Разбиение строк
		//Для разбиения строк на части используется метод String[] split(String regex),
		//который разбивает строку на основании заданного регулярного выражения.
		
/*		String isbn = "978-3-16-148410-0";
		String[] isbnParts = isbn.split("-");

		System.out.println("префикс EAN.UCC: " + isbnParts[0]);
		System.out.println("номер регистрационной группы: " + isbnParts[1]);
		System.out.println("номер регистранта: " + isbnParts[2]);
		System.out.println("номер издания: " + isbnParts[3]);
		System.out.println("контрольная цифра: " + isbnParts[4]);  */
		
		
		
		
		
		
		//Поиск в строке
		//boolean contains(CharSequence s) — проверяет, содержит ли строка заданную последовательность символов и возвращает true или false.
		
	/*	String s = "www.mysite.com";
		boolean isContain1 = s.contains("mysite");
		System.out.println(isContain1);// нашел - выведет true

		boolean isContain2 = s.contains("mysite.ru");
		System.out.println(isContain2);// не нашел - выведет false  */
		
		
		
		
		
		
		//boolean endsWith(String suffix) — проверяет завершается ли строка определенными символами и возвращает true или false.
		
	/*	String s = "www.mysite.com";

		//проверяем заканчивается ли строка суффиксом "com" 
		boolean isComEnding = s.endsWith("com"); 
		System.out.println(isComEnding);//выведет true 

		//проверяем заканчивается ли строка суффиксом "ru" 
		boolean isRuEnding = s.contains("ru"); 
		System.out.println(isRuEnding);//выведет false  */
		
		
		
		
		//boolean  startsWith(String prefix) или  startsWith(String prefix, int toffset) — проверяет, начинается ли строка с определенных символов. 
		//Во втором случае можно указать позицию с которой необходимо  начать поиск префикса.
		
	/*	String s = "www.mysite.com";

		//Проверяем, начинается ли адрес с www
		boolean isWWW = s.startsWith("www");

		if(isWWW){
		// Eсли да, проверяем начинается ли имя сайта
		//с "my". Поскольку адрес начинается с www
		//проверку начинаем с 4 символа
		boolean isNameStarts = s.startsWith("my", 4);
		System.out.print(isNameStarts);
		}else{
		// Eсли нет, проверяем начинается ли имя сайта
		//с "my". Поскольку адрес не начинается с www
		//проверку производим с начала строки
		boolean isNameStarts = s.startsWith("my");
		System.out.print(isNameStarts);
		}  */
		
		
		
		
		
		//int indexOf(int ch),  indexOf(int ch, int fromIndex), indexOf(String str),  indexOf(String str, int fromIndex) — метод indexOf применяется для поиска 
		//первого вхождения указанного символа в строке или первого вхождения указанной подстроки.
		//Поиск также можно произвести с указанием позиции в строке от которой нужно начинать искать. 
		//Для поиска нужно указать соответствующие параметры. Метод возвращает число соответствующее индексу первого вхождения символа или подстроки.  
		//В случае отсутствия указанного символа или подстроки в строке, будет возвращена -1.
		
	/*	String data = "name:Igor\nsurname:Kolashnikov\nage:14\ntime:14:55";
		//разбиваем строку на несколько подстрок на основании
		// встречаемого символа новой строки
		String[]lines=data.split("\n");

		//проходим каждую подстроку
		for (String line : lines){
		     //находим индекс первого вхождения символа ":" в подстроке
		     int pos = line.indexOf(":");
		     //вычленяем имя атрибута из подстроки
		     String attributeName= line.substring(0,pos);
		     //вычленяем значение атрибута
		     String value = line.substring(pos+1,line.length());
		     //вывод на экран вычлененных значений в нужном нам формате.
		     System.out.println(attributeName + " - " + value);
		}  */
		
		//int lastIndexOf(int ch), lastIndexOf(int ch, int fromIndex),  lastIndexOf(String str), lastIndexOf(String str, int fromIndex) — аналогично предыдущему случаю,
		//только ищется последнее вхождение символа или подстроки в строке.
		
		
		
		
		
		
		
		//Модификация строк
		
		//Модификация строк не является модификацией как таковой. Дело в том, что объекты класса  String
		//после создания уже нельзя изменять. Но можно создать копию строки с изменениями. Именно это и делают следующие методы.
		//toLowerCase() — преобразовать строку в нижний регистр;
		//toUpperCase() — преобразовать строку в верхний регистр;
		//trim() — отсечь на концах строки пустые символы;
		
	/*	String str = " Я помню ЧУДНОЕ мгновенье ";

		//убрали символы пробела в начале и конце строки
		str = str.trim();

		//я помню чудное мгновенье
		System.out.println(str.toLowerCase());

		//Я ПОМНЮ ЧУДНОЕ МГНОВЕНЬЕ
		System.out.println(str.toUpperCase());  */
		
		
		
		//String replace(char oldChar, char newChar), replace(CharSequence target, CharSequence replacement)  — 
		//замена в строке одного символа или подстроки на другой символ или подстроку.
		
	/*	String str = "1 000 000 000";
		String newStr = str.replace(" ", ".");
		System.out.println(newStr);  */
		
		
		
		
		//Сравнение строк
		
		//boolean equals(Object anObject) — проверяет идентичность строк.  
		//Возвращает true только в том случае, если в строках представлена одинаковая последовательность символов одной величены.
		
	/*	String str = "Я помню ЧУДНОЕ мгновенье";
		String str2 = "я помню чудное мгновенье";
		//строки не идентичны
		System.out.println(str.equals(str2)); //false

		//строки идентичны после перевода первой строки 
		//в нижний регистр
		System.out.println(str.toLowerCase().equals(str2)); // true  */

		
		
		
	//int compareTo(String anotherString) — так же проверяет идентичность строк, однако, в отличии от метода equals возвращает:
		//нулевое значение, если строки равны,
		//целое отрицательное число, если первая строка предшествует второй
		//целое положительное число, если  первая строка следует за второй	
		
		
	/*	String name1 = "Маша";
		String name2 = "Миша";
		System.out.println(name1.compareTo(name2)); //-8 
		System.out.println(name2.compareTo(name1)); //8  */
		
		//Для сравнения строк без учета регистра символов используется функция int compareToIgnoreCase(String str)
		
	/*	System.out.println("маша".compareToIgnoreCase("Миша"));  */
		
	}

}
