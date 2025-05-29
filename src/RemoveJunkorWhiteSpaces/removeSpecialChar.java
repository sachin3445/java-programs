package RemoveJunkorWhiteSpaces;

public class removeSpecialChar {

	public static void main(String[] args) {

		String s= "W@elc@o#me";
		System.out.println("Orignal String: "+s); 
		String s1=s.replace("@","");
		System.out.println("New String: "+s1.replace("#", ""));

	}

}
