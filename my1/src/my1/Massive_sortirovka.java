package my1;
import java.util.*;

public class Massive_sortirovka {

	public static void main(String[] args) {

// Сортировка выбором (Selection sort)
		
		
/*		int arr[] = {4, -5, 0, 6, 10};
		
//		По очереди будем просматривать все подмножества
//	      элементов массива (0 - последний, 1-последний, 
//	      2-последний,...)
		
		for(int i = 0; i < arr.length; i++) {
			
//			Предполагаем, что первый элемент (в каждом
//	           подмножестве элементов) является минимальным 		
			int min = arr[i];
			int min_i = i;
//			 В оставшейся части подмножества ищем элемент,
//	           который меньше предположенного минимума		
			 for (int j = i+1; j < arr.length; j++) {
				//Если находим, запоминаем его индекс
		            if (arr[j] < min) {
		                min = arr[j];
		                min_i = j;
		            }
		        }			 
//			 Если нашелся элемент, меньший, чем на текущей позиции,
//	          меняем их местами
			
			 if (i != min_i) {
		            int tmp = arr[i];
		            arr[i] = arr[min_i];
		            arr[min_i] = tmp;
		        }
			
			 System.out.print(arr[i] + ", ");
		}  */
		
		
//	Сортировка пузырьком (Bubble sort)
		
		
/*		int arr[] = {4, -5, 0, 6, 10, 2};
		
//	    Внешний цикл каждый раз сокращает фрагмент массива, 
//	      так как внутренний цикл каждый раз ставит в конец
//	      фрагмента максимальный элемент  
	    for(int i = arr.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
//	            Сравниваем элементы попарно, 
//	              если они имеют неправильный порядок, 
//	              то меняем местами 
	            if( arr[j] > arr[j+1] ){
	                int tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	        
	    }
	    
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.print(arr[i] + ", ");
	    }  */
		
		
// Сортировка массива при помощи метода sort() из класса Arrays.
		
	/*
		//Сортировка массива целых чисел по возрастанию:
		
		//Создаем массив случайных чисел
		int arr[] = new int[10];
		for(int i = 0; i <  arr.length; i++) {
			arr[i] =  (int)(Math.random() * 100);
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\nSorted: \n");
		//Сортируем массив
		Arrays.sort(arr);
		//Выводим отсортированный массив на консоль.
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}  */
	
	/*	
		//Сортировка массива целых чисел по убыванию:
		
		//Создаем массив случайных чисел
		Integer arr[] = new Integer[10];
		for(int i = 0; i <  arr.length; i++) {
			arr[i] =  (int)(Math.random() * 100);
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\nSorted: \n");
		//Сортируем массив
		Arrays.sort(arr, Collections.reverseOrder());
		//Выводим отсортированный массив на консоль.
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}  */
		
		
	/*	//Сортировка массива строк в Java:
		
		String[] names = new String[] {"Roman","Anna", "Petr", "Maria"}; 

		Arrays.sort(names);
		for(int i = 0; i <  names.length; i++) {
			System.out.print(names[i] + "  ");
		}  */
		
		
		
		
		// ЗАДАНИЕ ОДИН!!! Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000) и 
		// отсортируйте массив по убыванию при помощи сортировки пузырьком.

/*		int arr[] = new int[20];
		for(int i = 0; i <  arr.length; i++) {
			arr[i] =  (int)(Math.random() * 1000);
			System.out.print(arr[i] + "  ");
		}
		
		System.out.print("\n");
	    for(int i = arr.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){

	            if( arr[j] < arr[j+1] ){
	                int tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	        
	    }
	    System.out.print("После сортировки: \n");
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.print(arr[i] + "  ");
	    }  */
		
	
		// ЗАДАНИЕ ДВА Создайте массив содержащий марки автомобилей, отсортируйте его сначала по возрастанию, потом по убыванию.
		
/*		String[] car = new String[] {"Мерседес","БМВ","Ауди","Порше","Додж","Вольво"};
		int i;
		Arrays.sort(car);
		for(i = 0; i <  car.length; i++) {
			System.out.print(car[i] + "  ");
		}  
		System.out.print("\n");
		Arrays.sort(car, Collections.reverseOrder());
		for(i = 0; i <  car.length; i++) {
			System.out.print(car[i] + "  "); 
		
		
		} */
	    
	    
	}

}
