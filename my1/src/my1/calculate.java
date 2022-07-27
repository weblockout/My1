package my1;

import java.util.Scanner;

public class calculate {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		   while(true) {
			   System.out.println("1. Сложение");
			   System.out.println("2. Вычитание");
			   System.out.println("3. Умножение");
			   System.out.println("4. Деление");
			   System.out.println("5. Выход");
			   int personal = sca.nextInt();
			//   int result;
			   if (personal == 5) {
				   System.out.println("Вы вышли!");
				   break;
			   }
			   else {
				   if (personal == 1) {
				   System.out.println("Введите первое число: ");
				  
			   		 
			   			double a = sca.nextDouble();
						   System.out.println("Введите второе число: ");
						   double b = sca.nextDouble();
						   double c = a + b;
						   System.out.println("Первое число: " + a);
						   System.out.println("Второе число: " + b);
						   System.out.println("Ответ: " + c);
			   		
			   	}
				
				   if (personal == 2) {
					   System.out.println("Введите первое число: ");
					 
				   			double a = sca.nextDouble();
				   			System.out.println("Введите второе число: ");
							   double b = sca.nextDouble();
							   double c = a - b;
							   System.out.println("Первое число: " + a);
							   System.out.println("Второе число: " + b);
							   System.out.println("Ответ: " + c);
				   		
				   	}
				   if (personal == 3) {
					   System.out.println("Введите первое число: ");
					  
				   			double a = sca.nextDouble();
				   			System.out.println("Введите второе число: ");
							   double b = sca.nextDouble();
							   double c = a * b;
							   System.out.println("Первое число: " + a);
							   System.out.println("Второе число: " + b);
							   System.out.println("Ответ: " + c);
				   		
				   	}
				   
				   if (personal == 4) {
					   System.out.println("Введите первое число: ");
					   double a = sca.nextDouble();
					   System.out.println("Введите второе число: ");
					   double b = sca.nextDouble();
					   if (b == 0) {
						   System.out.println("Delit na nol nelzya"); 
						   System.out.println(" "); 
					   } else {
					   
					   double c = a / b;
					   System.out.println("Первое число: " + a);
					   System.out.println("Второе число: " + b);
					   System.out.println("Ответ: " + c);
					   }
				   }
			   }
		   }
		   sca.close();
	   }

}
