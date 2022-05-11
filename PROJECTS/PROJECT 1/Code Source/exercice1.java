import java.util.ArrayList;
import java.awt.Color;
import java.util.Scanner;

public class exercice1
{

    private ArrayList<Color> color;
    private ArrayList<Integer> parent;
    private  ArrayList<Integer> distance;


    public exercice1(int n)
    {
        this.color = new ArrayList<>(n);
        this.parent = new ArrayList<>(n);
        this.distance = new ArrayList<>(n);
    }


    public Color getColor(int index)
    {
        return this.color.get(index);
    }


    public void setColor(int index, Color c)
    {
        this.color.add(index, c);
    }


    public int getParent(int index)
    {
        return this.parent.get(index);
    }


    public void setParent(int p, int index)
    {
        this.parent.add(index, p);
    }


    public int getDistance(int index)
    {
        return this.distance.get(index);
    }


    public void setDistance(int d, int index)
    {
        this.distance.add( index, d);
    }


    public void parcourLargeur(int r, GraphSimple gs)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] adjacents = new int[this.parent.size()];


        list.add(r);
        setDistance(r,0);
        setColor(r,Color.ORANGE);
        setParent(r,0);
        int x;

        for(int j=r ; j < this.parent.size() ; j++)
        {
            if(color.get( j )== Color.GREEN)
            {
                list.add(j);
                while (!list.isEmpty())
                {
                    x = list.get(0);
                    list.remove(0);
                    adjacents = gs.getAdjacencyList(x);

                    for(int i=1 ; i < adjacents.length ; i++)
                    {
                        if(adjacents[i] == 1 && color.get( i )== Color.GREEN)
                        {
                            setColor(i,Color.ORANGE);
                            setDistance(i,getDistance(x)+1);
                            list.add(i);
                            setParent(i,x);
                        }
                    }
                    setColor(x,Color.RED);
                }
            }
        }
    }


    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;

        int[][] matrice = new int[n+1][n+1];
        Exercice1 ex = new exercice1(n+1);
        GraphSimple gs = new GraphSimple(n+1);

        for (i=1; i <= n ; i++)
        {
            for( j = 1 ; j <= n;j++)
            {
                matrice[i][j]= sc.nextInt();
            }
            gs.setAdjacencyList(i,matrice[i]);
        }
        ex.parcourLargeur(0, g);
    }
}