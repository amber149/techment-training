package assessment1;

public class Que2 {
public static void main(String[] args) {
for (int p = 1; p <= 5; p++) {
			if (p == 1 || p == 5) 
			{ 	for (int q = 1; q <= 5; q++)
				{System.out.print("*");
				}
			}
			else
			{		for(int s=1 ; s<=5 ; s++) {
					if(s==1 || s==5)
						System.out.print("*");
					else
						System.out.print(" ");
				}	
				
			}
			System.out.println();
	}
 }
}

