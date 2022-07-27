package my1;

import java.util.Formatter;
import java.util.Scanner;

public class File_formatted {
	static Formatter x;
	static Scanner scn;

	public static void main(String[] args) {

		try {
			
			x = new Formatter("test//2.txt"); //Форматируем файл, Если форматер не найдет файл в папке, то он его создаст
			
			scn = new Scanner(System.in); // Вводим с клавы
			
			System.out.println("Сколько вам лет ?");
			
			int a = (int)Double.parseDouble(scn.next()); // Переводим число с дробью в целочисленное  
			
			System.out.println("Как вас зовут ?");
			
			String b = scn.next();
			
			System.out.println("Где вы живете ?");
			
			String c = scn.next();
			
			x.format("Меня зовут %s, мне %d лет, я живу в городе %s", b, a, c); // Берем форматер,к которуму привязан файл и будем засовывать в него строку 
			x.close();
		}catch(Exception e) {};
		

	}

}
