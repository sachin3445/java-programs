package palindroneString;

public class givenpalindroneString {

	public static void main(String[] args) {
		String s="madam";
		String rev="";
		System.out.println("Orignal String: "+s);
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String: " +rev);
		if(s.equals(rev))
		{
			System.out.println("Given String is Palindrone: "+rev);
		}
		else
		{
		System.out.println("Given String not is Palindrone: "+rev);
		}
	}

}
