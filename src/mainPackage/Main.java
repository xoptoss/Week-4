package mainPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;

		System.out.println("Enter a number.");
		Scanner tKeyboard = new Scanner(System.in);
		num1=tKeyboard.nextInt();
		System.out.println("Enter another number.");
		num2=tKeyboard.nextInt();
		System.out.println("Hello, you entered "+num1+" "+num2+".");
	}

}
