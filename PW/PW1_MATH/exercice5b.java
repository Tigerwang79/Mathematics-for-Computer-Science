import java.util.Scanner;
import java.util.ArrayList;


public class exercice5b
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Entrez une valeur pour la taille de la matrice : ");
		int x = scn.nextInt();
		int matrice[][] = new int [x][x]; //S'initalise de base à 0

		int x1;
		int x2;

		for (int i = 0; i < x; i++) 
		{
			System.out.println("Entrer la ligne : ");
			x1 = scn.nextInt();
			System.out.println("Entrer les colonnes et terminer par 0 ");
			x2 = scn.nextInt();
			while(x2 != 0)
			{
				matrice[x1-1][x2-1] = 1;
				x2 = scn.nextInt();
			}				
		}

		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < x; j++)
			{
				System.out.printf("%3d", matrice[i][j]);
			}
			System.out.printf("\n");
		} // affiche la matrice
	}
}