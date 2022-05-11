import java.util.Scanner;
import java.util.ArrayList;



public class exercice1b
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
        System.out.println("Entrez une valeur pour la taille de la matrice : ");
        int x = scn.nextInt();
        x += 1;
        int matrice[][] = new int [x][x];

        int i, j;

        for(i = 1;i <= x; i++)
        {
            for(j = 1; j <= x; j++)
            {
                System.out.println("Entrez une valeur pour la colone j :" + j + " de la ligne i :" + i);
                matrice[i-1][j-1] = scn.nextInt();
            }
        }

        for(i =0; i < x;i++)
        {
            for(j = 0; j < x; j++)
            {
                System.out.print( matrice[i][j] + " " );
            }
            System.out.println();
        }
    }
}
