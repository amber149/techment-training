package assessment1;
import java.util.Scanner;
public class Que3 {

  public static void main(String args[])
  {
    int m, n, c, d;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns of matrix");
    m = sc.nextInt();
    n = sc.nextInt();

    int a[][] = new int[m][n];
    int b[][] = new int[m][n];
    int sum[][] = new int[m][n];

    System.out.println("Enter the elements of first matrix");

    for (c = 0; c < m; c++)
      for (d = 0; d < n; d++)
        a[c][d] = sc.nextInt();

    System.out.println("Enter the elements of second matrix");

    for (c = 0 ; c < m; c++)
      for (d = 0 ; d < n; d++)
        b[c][d] = sc.nextInt();

    for (c = 0; c < m; c++)
      for (d = 0; d < n; d++)
        sum[c][d] = a[c][d] + b[c][d]; 

    System.out.println("Sum of the matrices:");

    for (c = 0; c < m; c++)
    {
      for (d = 0; d < n; d++)
        System.out.print(sum[c][d] + "\t");

      System.out.println();
    }
  }
}