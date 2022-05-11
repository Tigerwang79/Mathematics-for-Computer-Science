import java.util.Scanner;
import java.util.ArrayList;



public class exercice1a
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        
        int matrice[][] = new int[x][x];
        matrice = lireMatrice(args, x); 

    }


    public static int[][] lireMatrice(String[] args, int x)
    {
    int matrix[][] = new int[x][x];  

        int i = 1;
        
        while(i < (x*x)+1){
            for(int j = 0; j< x; j++)
            {
                for(int k = 0; k<x ; k++)
                {
                    matrix[j][k] = Integer.parseInt(args[i]);
                    i++;
                }

            }
        }
        return matrix;        
    }

}