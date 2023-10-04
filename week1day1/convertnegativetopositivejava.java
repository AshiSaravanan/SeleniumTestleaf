package week1day1;

import java.util.Scanner;

public class convertnegativetopositivejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		if (num<0) {
			System.out.println(num*(-1));
		}
	}

}
