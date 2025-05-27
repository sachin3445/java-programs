package CountNumberofDigit;

public class countOddEvennum {

	public static void main(String[] args) {
		int a=12479,even=0, odd=0;
		
		String num=String.valueOf(a);
		for (int i=0; i<num.length();i++)
		{
			int digit = Character.getNumericValue(num.charAt(i));
			if (digit%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}

		System.out.println("Total number of count Even number: " + even);
		System.out.println("Total number of count odd number: " + odd);
	}

}
