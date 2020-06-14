package LogicBuildingExercise;

import java.util.Scanner;

	public class Divby8n6 {
		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);		
			System.out.print("Enter the amount : ");
			 n=sc.nextInt();
			
			 if(n%8==0 && n%3==0)
			 {
				 System.out.print("Amount is divisible by 8 and 3 ");
				 System.out.print(" \n ");
			 	 System.out.print("The amount is "+n);
			 }
			 else
				 System.out.print("Amount is not divisible by 8 and 3 ");

		}
	}
