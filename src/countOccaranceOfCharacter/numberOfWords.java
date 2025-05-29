package countOccaranceOfCharacter;

public class numberOfWords {

	public static void main(String[] args) {
		String s="Sachit Sachin Mehetre"; int count=1;
		System.out.println("Given String is: "+s);
		
		 
		
		for(int i=0; i<s.length()-1;i++)
		{
			if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
			
		}
			
		System.out.print("Total number of Words:"+count);
	
	}

}
