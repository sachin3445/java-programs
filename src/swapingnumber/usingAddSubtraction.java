package swapingnumber;

public class usingAddSubtraction {

	public static void main(String[] args) {
		int a=40, b=20;
		System.out.println("Before swaping a: " +a+" and b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping a: " +a+" and b: "+b);
	}

}
