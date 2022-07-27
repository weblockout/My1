package my1;



/*
public class File_My {
	static String [] m = new String [4];
	static String [] n = new String [3];
	static String [] l = new String [3];
	static Scanner scn;
	static Scanner findd;
	static Scanner res;


	
	public static void main(String[] args) throws IOException{
		
		openFile();
		readFile();
		findFile();


	}

	private static void openFile() {
		try {  // Отлавливаем ошибки, если файл не найден то - срабатывает catch
			
			scn = new Scanner(new File ("E://1.txt"));
			findd = new Scanner(new File ("E://2.txt"));

			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Файл не найден!");	
			
		}

	
		
	}

	private static void readFile() {
		
		while(scn.hasNextLine()) { //условие работы scn.hasNext - пока сканер не дойдет до конца файла
			//hasNext() -	Там есть еще одно слово?      hasNextLine() - Там есть еще одна строка?
			
			// Цикл для массива m
			for(int i = 0; i < m.length; i++) {
	 
				m[i] = scn.nextLine();  // каждый элемент массива равен следующему слову из файла

				
			}
		}
		while(findd.hasNextLine()) { //условие работы scn.hasNext - пока сканер не дойдет до конца файла
			//hasNext() -	Там есть еще одно слово?      hasNextLine() - Там есть еще одна строка?
			
			// Цикл для массива m
			for(int j = 0; j < n.length; j++) {
	 
				n[j] = findd.nextLine();  // каждый элемент массива равен следующему слову из файла

				
			}
		}
		


		
	}

	private static void findFile() throws IOException {
		FileWriter f = new FileWriter("E://res.txt", true);
 try {

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < n.length;j++) {


			if (m[i].equals(n[j])) {  // Почему то не пашет не найденные строки через  - m[i].intern() != n[j].intern()
				int str = i + 1;
				System.out.println(n[j] + " - НАЙДЕНА!!! в " + str + " строке.");

				
				f.write(n[j] + "\n");
				
				}// else  System.out.println(n[j] + " - Строка не найдена");

				//System.out.println(x);
			
			}

		
		}
 } catch(Exception e) {}
 f.close();
	}

	
} 
*/


//без Массива  с буффером


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class File_My {

	  public static void main(String[] args) throws IOException {
		  
		  
		  	Scanner allput = new Scanner(System.in);
		  	System.out.println("Введите путь до основной базы");
		  	String put1 = allput.nextLine();  //  E://1.txt
	        String first = put1;
	        System.out.println("Введите путь до файла для проверки");
	        String put2 = allput.nextLine(); 
	        String second = put2;   //  E://2.txt
	        BufferedReader fBr = new BufferedReader(new FileReader(first));
	        BufferedReader sBr = new BufferedReader(new FileReader(second));
	        FileWriter f = new FileWriter("E://3.txt", true); //добавляем для записи туда потом
	        FileWriter old = new FileWriter(put1, true);
		  

	        ArrayList<String> strings = new ArrayList<String>();

	        while ((first = fBr.readLine()) != null) {
	            strings.add(first);
	        }
	        fBr.close();
	       // old.write("\n");
	        while ((second = sBr.readLine()) != null) {
	            if (!strings.contains(second)) {
	                System.out.println(second);
	                f.write(second + "\n");
	               
	                old.write(second + "\n"); // дописываем в файл 1.txt не найденые строки
	            }
	        }
	        sBr.close();
	        f.close();
	        old.close();
	    }




}  


