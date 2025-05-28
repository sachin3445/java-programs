package FabnacciSeries;
//0 1 2 3 5 8 13
public class FabnacciSeriesprogram {

	public static void main(String[] args) 
	{
		int a=0, b=1, sum=0;
		System.out.print("Fabnacci Series: " +a+" "+b);
		for (int i=0; i<9;i++)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
	}

}
