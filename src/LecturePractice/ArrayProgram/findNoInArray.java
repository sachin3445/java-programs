package LecturePractice.ArrayProgram;

import java.util.Arrays;

public class findNoInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,10,40,50,80};
		int searchno=40;
		System.out.println("List of all numbers in aaray: "+Arrays.toString(a));
		boolean status=false;
		for (int x:a)
		{
			if(x==searchno)
			{
				System.out.println("Search number is found: "+searchno);
				status =true;
				break;
			}

		}
		if (status==false)
		{
		System.out.println("Search number not found: "+searchno);
		}
	}

}
