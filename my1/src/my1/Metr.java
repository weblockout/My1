package my1;

public class Metr {

	public static void main(String[] args) {
		int dume;
		double  metrs;
		int counter;
		
		counter = 0;
		for( dume = 1; dume <= 144; dume++) {
			metrs = dume * 39.37;
			System.out.println(dume + " дьюймам соответсвует " + metrs + " метр.");
			
			counter++;
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
		
	}

}
