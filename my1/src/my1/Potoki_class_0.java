package my1;

import java.util.*;

public class Potoki_class_0 implements Runnable { // implements Runnable - чтобы поток получил доступ к классу Potoki_class_0
	
	int time; //время которое будет спать наш поток
	String name; //имя нашего потока
	Random r = new Random(); // Наш рандом
	
	
	// нам понадобиться конструктор для нашего класса Potoki_class_0
	public  Potoki_class_0(String name) {
		
		this.name = name; // Присваиваем имя переменной выше (String name; //имя нашего потока) к (Potoki_class_0(String name))
		time = r.nextInt(999); // Создаем рандомное время от 0 до 999 . Т.е столько потомв милисек. будет спать поток
	}
	

	public void run() {  // Дополнительный поток всегда начинается с метода run
		
		System.out.printf("Поток %s спит %d\n", name, time); // Выведем сведение о потоке
		try {
			Thread.sleep(time);  // Отправляем поток в спячку
		}catch(Exception e) {}
		System.out.printf("Поток %s проснулся и закончился\n", name); //
	}

}
