package my1;

public class Massive {

	public static void main(String[] args) {
		
		
		

// Первое задание Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
		
 /*       int[] teenArray = new int[10];
        int x = 1;
        for(int i = 0; i < 10; i++){
        	teenArray[i] = x; 
           x = x + 2; 
        System.out.print(teenArray[i]+","); 
    }   */
		
		
	
// Второе задание  Дан массив размерности N,
//		найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).		

/*		int small = 0;
		int i;
		int[] mass = {1, -2, -4, 6, 10, 8, 9, 10, 1, -4};
		int dl = mass.length;
		for (i = 0; i < dl; i++) {
			if (small > mass[i]) {
				small = mass[i];

			}

		}
		for (i = 0; i < dl; i++) {
			if (small == mass[i]){
				System.out.print(small + " ");	
			}
		}   */
		
		
		
// Третье задание В массиве из задания 2. найти наибольший элемент.
		
	/*	int big = 0;
		int i;
		int[] mass = {1, -2, -4, -4, 10, 8, 9, 10, 1, -4};
		int dl = mass.length;
		for (i = 0; i < dl; i++) {
			if (big < mass[i]) {
				big = mass[i];

			}

		}
		for (i = 0; i < dl; i++) {
			if (big == mass[i]){
				System.out.print(big + " ");	
			}
		} */
		
		
		
		
	
// Четвертое задание Поменять наибольший и наименьший элементы массива местами. 
//		Пример: дан массив {4, -5, 0, 6, 8}.  После замены будет выглядеть {4, 8, 0, 6, -5}.		
		

/*        int [] array = {4, -5, 0, 6, 8};
        int max = array[0];
        int min = array[0];
        
        for (int i=0; i<array.length; i++)
        {
            if (max<=array[i])
                max = array[i];
            if (min>=array[i])
                min = array[i];
        }
        
        for (int i=0; i<array.length; i++)
        {
            if (max==array[i])
                array[i]=min;
            else if (min==array[i])
                array[i]=max;
        }
        
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }   */
		
		

// Пятое задание Найти среднее арифметическое всех элементов массива.		
// (4 + (-5) + 0 + 6 + 8) / 5		
/*		int [] array = {4, -5, 0, 6, 8};
		int i;
		double sum = array[0];
		for(i = 1; i < array.length; i++) {
			sum = sum + array[i];
		}
		double sred = sum / array.length;
		System.out.println(sred);*/
		
		
		
		
	}

}
