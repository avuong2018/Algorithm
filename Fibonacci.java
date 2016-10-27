public class Fibonacci
{
	public static int fb(int n)
	{
		if(n <= 1) return n;
		else return fb(n-1) + fb(n-2);
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i < n; i++)
		{
			System.out.println(i + ": " + fb(i));
		}
	}
}
