package week1day1;

import java.util.Scanner;



public class checkpositiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
			int num=scanner.nextInt();
			if (num<0) {
				System.out.println("Number is a negative number");
			}
			else if (num>0) {
				System.out.println("Number is a positive number");
			}
			else  {
				System.out.println("The number is neither positive nor negative");
			}
		
		
	}

}
