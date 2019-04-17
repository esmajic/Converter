package Converter;

import java.util.Scanner;

public class MainConverter {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int option;

		do {
			System.out.println();
			System.out
					.println("================================================");
			System.out.println("                    Converter               ");
			System.out
					.println("================================================");
			System.out.println();
			System.out.println("Choose 1 for pounds to kilograms conversion");
			System.out.println("Choose 2 for kilograms to pounds conversion");
			System.out.println("Choose 3 for inches to centimeters conversion");
			System.out.println("Choose 4 for centimetres to inches conversion");
			System.out.println("Choose 5 for fahrenheit to celsius conversion");
			System.out.println("Choose 6 for celsius to fahrenheit conversion");
			System.out.println("Choose 0 for Exit");
			System.out.println();

			System.out.println("Choose converter option:  ");
			option = input.nextInt();
			System.out.println();

			MethodsConverter convert = new MethodsConverter();

			if (option == 1) {
				convert.poundsToKgs();
			} else if (option == 2) {
				convert.kgsToPounds();
			} else if (option == 3) {
				convert.inchesToCms();
			} else if (option == 4) {
				convert.cmsToInches();
			} else if (option == 5) {
				convert.fahrenheitToCelsius();
			} else if (option == 6) {
				convert.celsiusToFahrenheit();
			}
		} while (option != 0);

		System.out.println();
		System.out.println("\nThank you for using our converter. Bye bye.");

		input.close();

	}

}
