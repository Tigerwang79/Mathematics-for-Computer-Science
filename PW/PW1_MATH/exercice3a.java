import java.util.Scanner;

public class exercice3a
{
	public static void main(String args[])
	{
		int cmpt = 0;
		int summ = 0;
		Scanner scn = new Scanner(System.in);

		while(scn.hasNextInt())
		{
			int nbr = scn.nextInt();
			summ += nbr;
			cmpt ++;
		}

		int moy = summ / cmpt;
		System.out.println("La somme est : " + summ);
		System.out.println("La moyenne est : " + moy);
	}
}