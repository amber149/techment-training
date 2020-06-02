package assessment1;

public class Que4ii {
public static void main(String args[])
{	
	int a[]= {2,5,1,6,3,4};
	for(int p=0;p<a.length-1;p++)
		for( int q=0;q<a.length;q++)
			if(a[p]+a[q]==8)
				System.out.println("the pairs are " + (a[p]) +  (a[q]));
	
}
}
