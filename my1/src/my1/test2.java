package my1;

public class test2 {

	public static void main(String[] args) {

		
		int a = 2;
		int b = 5;
		int c = 8;
		int d = 8;
		int e = 3;
		// int x;
		
	int z = 0;
		
		
	int x = (a <= b&&a <= c&&a <=d&& a <= e) ? a : (b <= a&&b <=c&&b <= d&&b <= e) ? b : (c <= a&&c <= b&&c <= d&&c <= e) ? c : (d <= a&&d <= b&&d <= c&&d <= e) ? d : (e <= a&&e <= b&&e <= c&&e <= d) ? e :0;
	System.out.println("Наименьшее: " + x);
	int y = (a >= b&&a >= c&&a >=d&& a >= e) ? a : (b >= a&&b >=c&&b >= d&&b >= e) ? b : (c >= a&&c >= b&&c >= d&&c >= e) ? c : (d >= a&&d >= b&&d >= c&&d >= e) ? d : (e >= a&&e >= b&&e >= c&&e >= d) ? e :0;
	System.out.println("Наибольшее: " + y);
	
//	z = (y == a) ? z++ : (y == b) ? z++ : (y == c) ? z++ : (y == d) ? z++ : (y == e) ? z++ :0;
	
	
	if (y == a) {
		 z++;
	
	} 
	if (y == b) {
		 z++;
	
	} if (y == c) {
		 z++;
	
	} if (y == d) {
		 z++;
	
	} if (y == e) {
		 z++;

	} 
	
	System.out.println("Количество наибольших чисел: " + z);
	
	/*		
		
  if (a <= b&&a <= c&&a <=d) {
	 int x = a;
	 System.out.println(x);
  } 
  if (b <= a&&b <=c&&b <= d) {
	 int x = b;
	 System.out.println(x);
  } 
  if (c <= a&&c <= b&&c <= d) {
	 int x = c;
	 System.out.println(x);
  } 
  if (d <= a&&d <= b&&d <= c)  {
	 int x = d;
	 System.out.println(x);
  } else {
	  System.out.println("НЕТУ");
  } */


		
		
		
		
	}
	}