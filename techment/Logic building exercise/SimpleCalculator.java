package LogicBuildingExercise;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String []args) {
	    	int num1, num2;
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter first number:");

		        num1 = sc.nextInt();
		        System.out.print("Enter second number:");
		        num2 = sc.nextInt();

		        System.out.print("Enter an operator (+, -, *, /): ");
		        char operator = sc.next().charAt(0);

		        sc.close();
		        int output;

		        switch(operator)
		        {
		            case '+':
		            	output = num1 + num2;
		                break;

		            case '-':
		            	output = num1 - num2;
		                break;

		            case '*':
		            	output = num1 * num2;
		                break;

		            case '/':
		            	output = num1 / num2;
		                break;

		           
		            default:
		                System.out.printf("You have entered wrong operator");
		                return;
		        }

		        System.out.println(num1+" "+operator+" "+num2+": "+output);
		    }
		
	}

