package LecturePractice;

public class reverseString {

	public static void main(String[] args) {
		String s="Nivan", rev=" ";
		System.out.println("Orignal String: " +s);
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String: "+rev);
	}

}
