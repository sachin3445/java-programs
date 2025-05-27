package swapingnumber;

public class logic02 {

	public static void main(String[] args) {

		int a=30, b=50;
		System.out.println("Before swaping a: " +a+" and b: "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swaping a: " +a+" and b: "+b);

	}

}
