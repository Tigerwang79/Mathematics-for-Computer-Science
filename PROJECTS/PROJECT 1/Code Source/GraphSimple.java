import java.util.Scanner;


public class GraphSimple
{

    private int[][] tab;


    GraphSimple(int n)
    {
        this.tab = new int[n][n];
    }


    public int order()
    {
        return this.tab.length;
    }


    public boolean isVertex(int x)
    {
        if (x >= 1 && x <= this.order())
        {
            return true;
        }else 
        return false;
    }


    public boolean isEdge(int x, int y)
    {
        boolean res = false;
        for(int i = 0; i < this.tab[x].length; i++)
        {
            if(this.tab[x-1][i] == y)
            {
                res = true;
            }
        }
        return res;
    }


    public int degree(int x)
    {
        return this.tab[x-1].length;
    }


    public void setAdjacencyList(int x, int[] neighborhood)
    {
        for (int i = 0; i < neighborhood.length; i++)
        {
            this.tab[x-1][i] = neighborhood[i];
        }
    }


    public int[] getAdjacencyList(int x)
    {
        return this.tab[x-1];       
    }


    /*
    public void setAdjacencyMatrix(int [][] matrix)
    {

    }


    public int[][] getAdjacencyMatrix()
    {

    }
    

    public int[][] toMatrix()
    {

    }


    public fromMatrix(int [][] matrix)
    {

    }
    */


    public static int[][] getMatrix(int n)
    {
        Scanner scan = new Scanner(System.in);
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
}