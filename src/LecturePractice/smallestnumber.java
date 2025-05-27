package LecturePractice;

import java.util.Scanner;

public class smallestnumber {

	public static void main(String[] args) {
	 int a,b,c;
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the value of a: ");
		 a=sc.nextInt();
		 System.out.println("Enter the value of b: ");
		 b=sc.nextInt();
		 System.out.println("Enter the value of c: ");
		 c=sc.nextInt();
	}
	 if((a<b) && (a<c))
	 {
		 System.out.println("a is the smllest number: "+a);
	 }
	 else if((b<a) && (b<c))
	 {
		 System.out.println("b is the smallest number: "+b);
	 }
	 else
	 {
		 System.out.println("c is the smallest number: "+c);
	 }

	}

}
