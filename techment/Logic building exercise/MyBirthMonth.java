package LogicBuildingExercise;

import java.util.Scanner;

public class MyBirthMonth {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Enter your birth month as number: ");
		int month =sc.nextInt();
		
	switch(month) {
		case 1:
			System.out.println(" Birth month is JANUARY");
			break;
		case 2:
			System.out.println(" Birth month is FEBRUARY");
			break;
		case 3:
			System.out.println(" Birth month is MARCH");
			break;
		case 4:
			System.out.println(" Birth month is APRIL");
			break;
		case 5:
			System.out.println(" Birth month is MAY");
			break;
		case 6:
			System.out.println(" Birth month is JUNE");
			break;
		case 7:
			System.out.println(" Birth month is JULY");
			break;
		case 8:
			System.out.println(" Birth month is AUGUST");
			break;
		case 9:
			System.out.println(" Birth month is SEPTEMBER");
			break;
		case 10:
			System.out.println(" Birth month is OCTOBER");
			break;
		case 11:
			System.out.println(" Birth month is NOVEMBER");
			break;
		case 12:
			System.out.println(" Birth month is DECEMBER");
			break;
		default:
			System.out.println(" invalid entry");
}
}
}