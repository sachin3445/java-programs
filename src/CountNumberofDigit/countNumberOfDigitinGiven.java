package CountNumberofDigit;

public class countNumberOfDigitinGiven {

	public static void main(String[] args) {
	
		int a = 148652, count=0;
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}
