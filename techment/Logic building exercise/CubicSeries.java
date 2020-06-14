package LogicBuildingExercise;

import java.util.Scanner;

public class CubicSeries {
	 public static void main(String[] args) {
		  int nterms;
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter the value of nth term : ");
				 nterms=sc.nextInt();
			}
			 for(int i=1;i<=nterms;i++)
			 {
				 System.out.print("the value of "+i +"  term is : " +i*i*i); 
				 System.out.print("\n");
			 }
		}
}
