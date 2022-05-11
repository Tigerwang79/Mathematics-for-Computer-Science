import java.util.Scanner;
import java.util.ArrayList;

public class exercice5a
{
	public static void main(String...args)
	{
		int n;
		int k;
		ArrayList<Integer> tab = new ArrayList<>();
		Scanner scn = new Scanner(System.in);

		System.out.println("Veuillez entrer un entier : ");

		n = Integer.parseInt(scn.nextLine());

		for (k = 0; k < (n * n); k++)
		{
			System.out.println("Veuillez entrer un nombre : ");
			tab.add(Integer.parseInt(scn.nextLine()));
		}
		k = 0;

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.println(tab.get(k) + " ");
				k++;
			}
			System.out.println();
		}
	}
}