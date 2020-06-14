package LogicBuildingExercise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of nth term : ");
			 n=sc.nextInt();
		 int i =0;
	       int num =0;
	       String  primeNumbers = "";
	       for (i = 1; i <= n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers series to n terms are :");
	       System.out.println(primeNumbers);
	}
}
