package swapingnumber;

public class logic04 {
	public static void main(String args[])
	{
		int a=25, b=35;
		System.out.println("Before swaping a: " +a+" and b: "+b);
		b=a+b-(a=b); //calculation are done from Right to left
		System.out.println("After swaping a: " +a+" and b: "+b);
	}

}
