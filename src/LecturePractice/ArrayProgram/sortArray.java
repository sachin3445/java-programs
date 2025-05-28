package LecturePractice.ArrayProgram;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		int a[]= {10,50,30,40,90,70};
		System.out.println("Array before sort: " +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sort: " +Arrays.toString(a));
		
		
	}

}
