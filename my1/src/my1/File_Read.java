package my1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.File;


public class File_Read {
	static String [][] m = new String [5][3];
	static Scanner scn;
	
	public static void main(String[] args) {
		openFile();
		readFile();
		out();
		
		

		
	}
   // 1. Открывать файл (openFile())
	private static void openFile() {
		try {  // Отлавливаем ошибки, если файл не найден то - срабатывает catch
			
			scn = new Scanner(new File ("test//1.txt"));
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Файл не найден!");	
			
		}

	}
   // 2. В котром будем заносить значения в массив (readFile()
	private static void readFile() {
		while(scn.hasNext()) { //условие работы scn.hasNext - пока сканер не дойдет до конца файла
			//hasNext() -	Там есть еще одно слово?      hasNextLine() - Там есть еще одна строка?
			
			// Цикл для массива m
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m[i].length; j++) {
					m[i][j] = scn.next();  // каждый элемент массива равен следующему слову из файла
				}
				
			}
			
		}

		
	}
	//3. В котором будем выводить значения на экран (out())
	private static void out() {
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "   ");
			}
			System.out.println();
		}

		
	}



}
