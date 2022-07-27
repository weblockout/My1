package my1;

import java.util.*;

public class Matrix_Dvumer_massiv {

	public static void main(String[] args) {

// Задается матрица и ее вывод 	Очередность - i - строки  j - столбцы	
	/*	int[][] matrixB = {
				{-9,1,0},
				{4,1,1},
				{-2,2,-1}
			};		

			for (int i = 0; i < 3; i++) {
	                    for (int j = 0; j < 3; j++) {
	            	        System.out.print(matrixB[i][j] + "\t");
	                    }
	                    System.out.println();
	                } */
	
		
// Рассмотрим инициализацию в цикле для двумерного массива на примере таблицы умножения.
// Здесь инициализация элементов значениями таблицы умножения совмещена с их выводом на консоль в одном цикле.
/*	
        // создаем двумерный массив 10 на 10
int[][] multiplyTab  = new int[10][10];
        
        // цикл по первой размерности
for (int i = 0; i < 10; i++) {
            // цикл по второй размерности
            for (int j = 0; j < 10; j++) {
                //инициализация элементов массива
    	        multiplyTab[i][j] = (i+1)*(j+1); 
                //вывод элементов массива 
 	        System.out.print(multiplyTab[i][j] + "\t");
            }
            System.out.println();
        } */
		
		
		// В данном случае, пока неизвестно сколько будет элементов в каждой строке, это можно определить позже, 
//		причем, массив может содержать в каждой строке разное количество элементов, то есть быть несимметричным
		
/*		int[][] a1 = new int[5][];// двумерный массив с 5 строками
		//Определим количество элементов в каждой строке для массива a1
		a1[0] = new int [1];
		a1[1] = new int [2];
		a1[2] = new int [3];
		a1[3] = new int [4];
		a1[4] = new int [5];  
		
		for(int i = 0; i<a1.length; i++){
			for(int j = 0; j<a1[i].length; j++){			
			    System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}  */  
		
		
		// ПЕРВОЕ ЗАДАНИЕ. Создайте массив размерностью 5 на 6 и заполните его случайными числами (в диапазоне от 0 до 99 ).
		// Выведите на консоль третью строку
/*		int i,j;
		int[][] a1 = new int[5][6];
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 6; j++) {
				a1[i][j] =  (int)(Math.random() * 100);
				if (i ==3)
					System.out.print(a1[i][j] + "\t");
			}
		}		*/
		
		
		
		// ВТОРОЕ ЗАДАНИЕ. Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 0 до 99. 
		//Выполните по отдельности сначала сложение, потом умножения матриц друг на друга. 
		//Выведете исходные матрицы и результат вычислений на консоль.
		
/*		
		int[][]c = new int[3][3];
		int[][]d = new int[3][3];
		int[][]slog = new int [3][3];
		int[][]umn = new int [3][3];
		
		System.out.print("Исходная матрица с:\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] =  (int)(Math.random() * 100);
				d[i][j] =  (int)(Math.random() * 100);
				slog [i][j] = c[i][j] + d[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("\n");
		System.out.print("Исходная матрица d:\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("\n");
		System.out.print("Результат сложения матриц c и d:\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(slog[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.print("\n");
		System.out.print("Результат умножения матриц c и d:\n");  //Умножение матриц происходит строка на столбец и потом все складывается
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					umn[i][j] += c[i][k] * d[k][j];
				}
				System.out.print(umn[i][j] + "\t");
			}
			System.out.println();
		}  */
		
		// ТРЕТЬЕ ЗАДАНИЕ. Просуммируйте все элементы двумерного массива.
		
/*		int i,j;
		int sum = 0;
		int[][] a1 = new int[3][3];
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				a1[i][j] =  (int)(Math.random() * 10);
				sum += a1[i][j];
				System.out.print(a1[i][j] + "\t");
			}
			System.out.println();
			
		}
		System.out.print(sum); */
		
		
		// ЧЕТВЕРТОЕ ЗАДАНИЕ. Дан двумерный массив, содержащий отрицательные и положительные числа.
		//Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа.
		
/*		int a1[][] = {
				{-9,3,0},
				{4,5,-7},
				{-2,2,-1}
			};	
		for(int i = 0; i < a1.length; i++) {
			for(int j =0; j < a1[i].length; j++) {
				if (a1[i][j] < 0) {
					System.out.print("строка " + i + " столбец " + j + " " + "число" + a1[i][j] + "\n");
				}
			}
		}  */
		
		
		// ПЯТОЕ ЗАДАНИЕ. Отсортируйте элементы в строках двумерного массива по возрастанию
/*		int a1[][] = {
				{-9,3,0},
				{4,5,-7},
				{-2,2,-1}
			};	

		for(int i = 0; i < a1.length; i++) {
			Arrays.sort(a1[i]);
			for(int j =0; j < a1[i].length; j++) {
				 Arrays.sort(a1[j]);
				
				System.out.print(a1[i][j] + "\t");
			}
			System.out.println();
		}  */
		
		
		
		
		
	}

}
