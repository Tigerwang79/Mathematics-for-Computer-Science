

public class Timestamp
{
	private int nbrMax;

	public Timestamp() // Constructeur timestamp
	{
		this.nbrMax=0;
	}

	public int time() // Méthode time
	{
		nbrMax = nbrMax + 1;
		return nbrMax;
	}

	public static void main(String[] args)
	{
		Timestamp t = new Timestamp();
		int n = Integer.parseInt(args[0]);
		int i;
		for (i = 0; i < n ; i++)
		{
			System.out.println(t.time());
		}
	}
}