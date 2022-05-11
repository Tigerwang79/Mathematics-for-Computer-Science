import java.util.ArrayList;
import java.awt.Color;
import java.util.Scanner;

public class exercice3
{

    private ArrayList<Color> color;
    private ArrayList<Integer> parent;
    private  ArrayList<Integer> distance;
    private  ArrayList<Integer> cc;

    public exercice3(int n)
    {
        this.color = new ArrayList<>(n);
        this.parent = new ArrayList<>(n);
        this.distance = new ArrayList<>(n);
        this.cc = new ArrayList<>(n);
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
        this.distance.add(index, d);
    }


    public int getCC(int index)
    {
        return this.cc.get(index);
    }


    public void setCC(int cc, int index)
    {
        this.cc.add(index, cc);
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

        for(int j = r; j < this.parent.size(); j++)
        {
            if(color.get(j) == Color.GREEN)
            {
                list.add(j);
                while (!list.isEmpty())
                {
                    x = list.get(0);
                    list.remove(0);
                    adjacents = gs.getAdjacencyList(x);

                    for(int i=1 ; i < adjacents.length ; i++)
                    {
                        if(parent.get(i) == x && color.get(i) == Color.GREEN)
                        {
                            this.setCC(j, i);
                            setColor(i,Color.ORANGE);
                            setDistance(i,x);
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
        Exercice3 ex = new exercice3(n+1);
        GraphSimple gs = new GraphSimple(n+1);

        for (i=1; i <= n ; i++ )
        {
            for(j = 1 ; j <= n;j++)
            {
                matrice[i][j]= sc.nextInt();
            }
            gs.setAdjacencyList(i,matrice[i]);
        }
        ex.parcourLargeur(0, gs);
    }
}