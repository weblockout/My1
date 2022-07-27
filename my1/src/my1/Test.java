package my1;

public class Test {

	public static void main(String[] args) {
        

		int a = 3;
		int b = 5;
		int c = 1;
		int d = 8;
		int e = 9;
		//int x;
		
			
		
/*		if (a > b) {
			 x = b;
		} else {
			 x = a;
		}  */
		
		int x = (a > b) ? b : a;
		if (x > c) {
			x = c;
		} 		
		 if (x > d) {
			 x = d;
		 }
		 if (x > e) {
			 x = e;
		 }		
		System.out.println("Min: " + x);
		
		
		int y = (a < b) ? b : a;
		if (y < c) {
			y = c;
		} 		
		 if (y < d) {
			 y = d;
		 }
		 if (y < e) {
			 y = e;
		 }		
		System.out.println("Max: " + y);
		
        }



}
