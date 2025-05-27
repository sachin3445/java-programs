package LecturePractice;

import java.util.Scanner;

public class dayNumber {

	public static void main(String[] args) {
		
		String weekday;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Day: ");
			weekday=sc.nextLine();
		}
		switch(weekday)
		{
		case "Mon": System.out.println("01"); break;
		case "Tue": System.out.println("02"); break;
		case "Wed": System.out.println("03"); break;
		case "Thr": System.out.println("04"); break;
		case "Fri": System.out.println("05"); break;
		case "Sat": System.out.println("06"); break;
		case "Sun": System.out.println("07"); break;
		default: System.out.println("Invalid day");
		}

	}

}
