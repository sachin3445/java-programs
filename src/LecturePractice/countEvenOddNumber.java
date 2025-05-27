package LecturePractice;

public class countEvenOddNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6};
		int even=0, odd=0;
		
		for(int x:a)
		{
			if(x%2==0) 
			{
				even++;
			}else
			{ }
		}
		
		
		System.out.println("Total number of Even number: "+even);
		System.out.println("Total number of Odd number: "+odd);
	}

}
