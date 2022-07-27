package my1;

import  java.lang.Math.*;

public class Matemstic {

	public static void main(String[] args) {
		
		// АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ И МАТЕМАТИКА В JAVA.
		
		/*
		sqrt(a) — извлекает квадратный корень из числа а.
		pow(a, n) —  a возводится в степень n.
		sin(a), cos(a), tan(a) — тригонометрические функции sin, cos и tg угла a указанного в радианах.
		 asin(n), acos(n), atan(n) — обратные тригонометрические функции, возвращают угол в радианах.
		exp(a) — возвращает значение экспоненты, возведенной в степень a.
		log(a) — возвращает значение натурального логарифма числа a.
		log10(a) — возвращает значение десятичного логарифма числа a.
		abs(a) — возвращает модуль числа a.
		round(a) — округляет вещественное число до ближайшего целого.	

		PI — число «пи», с точностью в 15 десятичных знаков.
		E — число «e»(основание экспоненциальной функции), с точностью в 15 десятичных знаков.


				System.out.println(sqrt(81));// выведет 9.0 
				System.out.println(pow(2,10));// выведет 1024.0 
				System.out.println(sin(PI/2));// выведет 1.0 
				System.out.println(cos(PI));// выведет -1.0
				System.out.println(acos(-1));// выведет 3.141592653589793
				System.out.println(round(E));// выведет 3
				System.out.println(abs(-6.7));// выведет 6.7		
			*/
		
		
		//Выодит 11 и 9 .Почему?
/*		int i = 1;
		i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
		System.out.println(i);  
		//if (i > 2){
	//	i=i++ +i++;}
	//else i=i++ +(i++ * i++) + i++;
	//условие не выполняется, тогда i=1+(2*3)+4=11
				
		i = 2;
		i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
		System.out.println(i);
		// i=i++ +i++ +i++=2+3+4=9   */
		
		
	// ПЕРВОЕ ЗАДАНИЕ 	Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
/*		int[] mass = new int[6];
		for(int i = 0; i <  mass.length; i++) {
			mass[i] =  (int)(Math.random() * 40);
			System.out.print(mass[i] + "  ");				
		}
		System.out.print("\nЧисла, делящиеся на 3 и 6: \n");
		for(int i = 0; i <  mass.length; i++) {

			if(mass[i] != 0) {				
				if (mass[i] % 3 == 0 && mass[i] % 6 == 0) {
					System.out.print(mass[i] + "  ");
				}
			}
			
		}  */
		
		
		//ВТОРОЕ ЗАДАНИЕ. Посчитать среднее арифметическое (даже если дробное) чисел в массиве
		
/*		int[] mass = new int[6];
		int sum = 0;
		for(int i = 0; i <  mass.length; i++) {
			mass[i] =  (int)(Math.random() * 40);
			System.out.print(mass[i] + "  ");				
		}
		for(int i = 0; i <  mass.length; i++) {
			sum = (sum + mass[i]);	
		}
		int sred = sum / mass.length;
		int ost =  sum % mass.length;
		int kon = (ost*10) / mass.length;
		System.out.print("\nСреднее арифметическое равно:  " + sred + "." + kon);  */
		

	//ТРЕТЬЕ ЗАДАНИЕ.  	Известны катеты прямоугольного треугольника, найти его площадь и периметр
		
/*		int kat0 = 3;
		int kat1 = 7;
		double s = (double) (kat0 * kat1)/2;
		double p = (double) sqrt(pow (kat0, 2) + pow (kat1, 2)) + kat0 + kat1;
		System.out.print("Площадь треугольника равна :  " + s + "\n");
		System.out.print("Периметр треугольника равна :  " + p + "\n");   */
		
		
	//ЧЕТВЕРТОЕ ЗАДАНИЕ. Даны два целых числа, найти их наибольший общий делитель и наименьшее общее кратное
		
	/*	 int n1 = 12;
	        int n2 = 8;
	        System.out.println("Даны 2 целых числа: " + n1 + " и " + n2);
	        int nod;
	        int nok = 0;
	        int j;
	        if(n1>n2){ 
	            nod = n1%n2; 
	            System.out.println("Их наибольший общий делитель: " + nod);
	            for(int i=1; i<n2; i++){
	            j =n1 * i;          
	            if(j%n2==0){
	                nok=j;
	                break;
	            }
	        }
	        System.out.println("Их наименьшее общее кратное: " + nok);
	        }
	        if(n2>n1){ 
	            nod = n2 % n1; 
	            System.out.println("Их наибольший общий делитель: " + nod);
	            for(int i=1; i<n1; i++){
	            j =n2 * i;
	            if(j%n1==0){
	                nok=j;
	                break;
	            }
	        }
	        System.out.println("Их наименьшее общее кратное: " + nok);
	        }  */
		
		
		
		//ПЯТОЕ ЗАДАНИЕ. Даны радиус вращения и высота конуса, вычислить объем конуса.
		
/*		 int r = 3;
	        int h = 5;
	        System.out.println("Даны радиус вращения и высота конуса: " + r + " и " + h);
	        double v = (double) 1/3*PI*pow(r,2)*h;
	        System.out.println("Обьем конуса равен " + v);  */
	}

}
