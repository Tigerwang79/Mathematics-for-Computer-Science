package exercice1;

import java.util.Scanner;

public class matriceAdj
{
    public static int[][] readMat()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please give me a number > 0.\n");

        int n = scan.nextInt();

        int[][] tab = new int [n][n];

        System.out.printf("Please give me %d 1 and 0s.\n", n * n);
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                int tmp = scan.nextInt();

                if(tmp != 0 && tmp != 1)
                {
                    System.err.print("ERROR : you have to input either 0 or 1 !!!!");
                    break;
                }
                else
                    tab[i-1][j-1] = tmp;
            }
        }
        System.out.print("=== RESULTING TAB ===\n");

        for(int i = 1; i <= n; i++)
        {
            System.out.print("| ");
            
            for(int j = 1 ; j <= n ; j++)
            {
                System.out.printf("%d ", tab[i - 1][j - 1]);
            }
            System.out.print(" |\n");
        }
        System.out.print("=== RESULTING TAB ===\n");

        scan.close();
        return tab;
    }


    public static void printLine(int x, int[][] mat)
    {
        int n = mat.length;
        assert(x > 0 && x <= n);

        System.out.printf("Line n.%3d = [", x);
        
        for(int i = 0 ; i < x ; i++)
        {
            System.out.printf("%3d ", mat[x][i]);
        }
        System.out.print("]\n");
    }


    public static void main(String[] s)
    {
        int[][] mat = readMat();

        Scanner scan = new Scanner(System.in);

        boolean stop = false;
        
        while(!stop)
        {
            System.out.printf("Please give me a number between 1 and %d.\n", mat.length);
            System.out.print("=== Input 0 to stop me ===\n");
            int curr = scan.nextInt();

            if(curr == 0)
                stop = true;
            else printLine(curr, mat);
        }
        System.out.print("=== FIN EXERCICE 1 ===\n");
    }
}
