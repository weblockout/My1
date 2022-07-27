package my1;
import java.util.Scanner;
public class R {

	public static void main(String[] args) {
	
		// ОПЕРАТОРЫ ЦИКЛА (FOR, WHILE, DO-WHILE)
	// Первое задание сделано	Вывести нечетные числа с 1 до 99
		
	/*for (int x = 1; x <= 99; x++) {
		int y = x % 2;
		if (y == 1) {
			System.out.println(x);
		}
	}   */
		
		
		
		
		//Второе задание вычислить факториал 5
		
	/*	int n = 1;
		for (int i = 1; i <= 5; i++) {
			n = n*i;
		
				 
					
		}
		System.out.println(n);  */
		
		
		//Третье задание  -сделать первое и второе через while	
/*	int x =1;	
	while(x <= 99) {
		int y = x % 2;
		if (y == 1) {
			System.out.println(x);
		}
		x++;
	} */

		
	/*	int n = 1, i =1;		
		while(i <= 5) {
			n = n*i;
			i++;
		}
		System.out.println(n);  */
		
		
// Четвертое задание возведение в степень 	
	/*	Scanner chislo = new Scanner(System.in); 
		System.out.println("Введите число для возведение в степень");
		int  a = chislo.nextInt();
		System.out.println("Введите степень");
		int  c = chislo.nextInt();
		int n = 1;
		for (int b = 1; b <= c; b++) {
			n = a*n;
		}
		
		System.out.println("Результат: " + n);  
		chislo.close();  */
		
		
		
	// Задание пять Вывести 10 первых чисел последовательности 0, -5,-10,-15..	    
		/*  int i;
				int n =0;
			
				for (i = 0; i < 10; i++) {
					System.out.print(" " + n); 	
			  n = n - 5;
			 
				}  */
		
		
		
		// Шестое задание Необходимо, чтобы заданный символ встречался в строке хотя бы 2 раза. 	
/*		   
	      //строка для поиска
        String searchMe = "Ура рыба разная";
        //количество символов в строке
        int max = searchMe.length();
        //символ, который нужно найти в строке
        char symb = 'р';
        int z = 0;


        for (int i = 0; i < max; i++) {
            // если символ на позиции i в строке равен искомому символу
            if (searchMe.charAt(i) == symb) {
            	z++;
            	
            }
            if (z == 2) {
            	System.out.println("Символ встречается 2 раза");
            	break;
            }
        
        }

       if(z<2) {
        	System.out.println("Символ не встречается 2 раза");
        	
        }  */



		    
		    
		    
		    
	}

}
