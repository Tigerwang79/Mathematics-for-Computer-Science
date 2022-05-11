

public class exercice1d
{
	public static void main(String [] args)
	{
		int i;
		int total = 0;

		for (i = 0; i < args.length; i++)
		{
			total += Integer.parseInt(args[i]);
		}		
		System.out.println(args[i]);
	}
}