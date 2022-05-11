import java.util.Scanner;

public class exercice4
{

	public static void main(String [] args)
	{
		int n = Integer.parseInt(args[0]);
		int m[][] = new int [n][n];
		int i, j, x;
		Scanner scn = new Scanner(System.in);
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; i <= n ; j++)
			{
				m[i-1][j-1] = i * j;
			}
		}
		for (int i = 0; i < n ; i++) 
		{
			for (int j = 0; i < n ; j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		while(true)
		{
			x = scn.nextInt();
			for (i = 0; i < n; i++)
			{
				System.out.print(m[i][x-1]+" ");
			}
			System.out.println();
		}
	}
}