package LecturePractice.ArrayProgram;

import java.util.Arrays;

public class sortArrayusingForLoop {

	public static void main(String[] args) {

		int a[]= {10,40,70,50,60,20};
		System.out.println("Array before sort: "+Arrays.toString(a));
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
							a[i]=a[j];
							a[j]=temp;
				}
			}
			
		}
		System.out.println("Array after sort: "+Arrays.toString(a));
	}

}
