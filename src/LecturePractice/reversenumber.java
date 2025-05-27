package LecturePractice;

public class reversenumber {

	public static void main(String[] args) {
		int a=78656, rev=0;
		
		while(a!=0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);
	}

}
