package LecturePractice.ArrayProgram;

import java.util.Arrays;

public class printArrayInReverse {

	public static void main(String[] args) {
		int a[]= {20,30,70,40,22,78,63};
		System.out.println("Array before reverse: "+Arrays.toString(a));
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
