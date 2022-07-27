package my1;

import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		Scanner imya = new Scanner(System.in);
		
		System.out.println("Введите первое имя");
		String imya1 = imya.nextLine();
		System.out.println("Введите второе имя");
		String imya2 = imya.nextLine();

 
		
	boolean result;
	
	if(result = imya1.equals(imya2)) {
		System.out.println("Люди являются тезками");	
	}else {
		System.out.println("Люди НЕ являются тезками");
	}


  imya.close();
	}

}
