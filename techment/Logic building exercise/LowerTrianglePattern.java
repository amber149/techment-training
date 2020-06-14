package LogicBuildingExercise;

import java.util.Scanner;

public class LowerTrianglePattern{
		public static void main(String []args) 
			{int n;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the value of nth term : ");
				 n=sc.nextInt();
		 
			for(int i=0;i<n;i++)
			{	
				for(int j=1;j<i;j++)
				{System.out.println(+j);  
				}
				System.out.print("\n");
			}
		//System.out.print("\n");
		}
}
