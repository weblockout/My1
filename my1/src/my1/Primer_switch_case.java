package my1;

public class Primer_switch_case {

	public static void main(String[] args) {
		
		 int day = 6;
		    String dayString;
		    switch (day) {
		        case 1:  dayString = "Понедельник";
		                 break;
		        case 2:  dayString = "Вторник";
		                 break;
		        case 3:  dayString = "Среда";
		                 break;
		        case 4:  dayString = "Четверг";
		                 break;
		        case 5:  dayString = "Пятница";
		                 break;
		        case 6:  dayString = "Суббота";
		                 break;
		        case 7:  dayString = "Воскресенье";
		                 break;
		        default: dayString = "Ошибка";
		                 break;
		    }
		    System.out.print(dayString);


	}

}
