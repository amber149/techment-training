package assessment1;

public class Ques4 {
	public static void main(String args[]) {
		int a[]= {2,6,7,9,4};
		int sumeven=0,sumodd=0;

			for (int i=0;i<a.length;i++)
			{if (a[i]%2==0)
				sumeven=sumeven+a[i];
			 else
				sumodd=sumodd+a[i];
			 }
			
		System.out.println("sum of even elements is"+sumeven);
		System.out.println("sum of odd elements is"+sumodd);
	}
}