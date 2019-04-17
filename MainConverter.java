package Converter;

import java.util.Scanner;

public class MainConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("             Converter               ");
		System.out.println("=====================================");
		System.out.println("Choose converter option:  ");
		int option = input.nextInt();
		System.out.println("\nEnter value to be converted:  ");
		int userInput = input.nextInt();
		
		input.close();

	}

}
