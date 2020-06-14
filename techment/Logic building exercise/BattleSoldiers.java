package LogicBuildingExercise;
import java.util.Scanner;

public class BattleSoldiers {
	public static void main(String []args)
	{
		int fsol, lsol;
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter first soldier number : ");
		 fsol=sc.nextInt();
		 System.out.print("Enter last soldier number : ");
		 lsol=sc.nextInt();
		 
		 if (lsol>fsol)
		 {
		 for(int i=fsol;i<=lsol;i++)
		 	{
			 System.out.print("the soldier numbers going for battle are "+i);
			 System.out.print("\n");
		 	}
		 }
		 else
			  System.out.print("invalid entry");
		 }
	}

