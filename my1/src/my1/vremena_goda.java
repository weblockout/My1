package my1;

import java.util.Scanner;

public class vremena_goda {

	public static void main(String[] args) {
		Scanner now = new Scanner(System.in);
		System.out.print("Введите число для определения времени года \n" );
		int x = now.nextInt();
	
			System.out.println ( (x == 12 || x == 1 || x == 2) ? "Зима" : (x >= 3 && x <= 5) ? "Весна" : (x >= 6 && x <= 8) ? "Лето" : (x >= 9 && x <= 11) ? "Осень" : "Нет такого месяца");
	now.close();

	}

}
