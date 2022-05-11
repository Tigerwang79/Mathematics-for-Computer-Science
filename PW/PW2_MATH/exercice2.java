import java.util.Scanner;
import java.util.ArrayList;


public class exercice2a
{

	private static Scanner sc;


    public void Initialize()
    {
        Scanner sc = new Scanner(System.in);
        this.sc = sc;
    }


    public int[][] getMatrix(int n)
    {
        int[][] mat = new int[n][n];
        this.Initialize();

        

        System.out.printf("Ecris %d chiffre entre 1 et 0.\n", n * n);
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                int tmp = this.sc.nextInt();

                if(tmp != 0 && tmp != 1)
                {
                    System.err.print("ERROR : you have to input either 0 or 1 !!!!");
                    break;
                }
                else
                {
                    mat[i - 1][j - 1] = tmp;
                }
            }
        }

        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print("| ");
            
            for(int j = 1 ; j <= n ; j++)
            {
                System.out.printf("%d ", mat[i - 1][j - 1]);
            }
            System.out.print(" |\n");
        }
        
        return mat;
    }
}