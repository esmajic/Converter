package Converter;

public class MethodsConverter {

	MethodsConverter() {

	}

	public void poundsToKgs() {
		System.out.println("Conversion from kgs into pounds: ");
		System.out.println("Enter value to be converted:  ");
		System.out.println();
		double userInput = MainConverter.input.nextDouble();
		double pound = userInput * 0.4535923;
		System.out.println(userInput + " kilograms is " + pound + " pounds.");

	}

	public void kgsToPounds() {
		System.out.println("Conversion from pounds into kgs: ");
		System.out.println("Enter value to be converted:  ");
		System.out.println();
		double userInput = MainConverter.input.nextDouble();
		double kg = userInput / 0.4535923;
		System.out.println(userInput + " pounds is " + kg + " kgs.");

	}

	public void inchesToCms() {
		System.out.println("Conversion from inches into cms: ");
		System.out.println("Enter value to be converted:  ");
		System.out.println();
		double userInput = MainConverter.input.nextDouble();
		double cm = userInput / 0.39370;
		System.out.println(userInput + " inches is " + cm + " centimeters.");

	}

	public void cmsToInches() {
		System.out.println("Conversion from cms into inches: ");
		System.out.println("Enter value to be converted:  ");
		System.out.println();
		double userInput = MainConverter.input.nextDouble();
		double inch = userInput * 0.39370;
		System.out.println(userInput + " centimeters is " + inch + " inches.");

	}

	public void fahrenheitToCelsius() {
		System.out.println("Conversion from fahrenheits into celsius: ");
		System.out.println("Enter value to be converted:  ");
		System.out.println();
		double userInput = MainConverter.input.nextDouble();
		double celsius = userInput * 1.8000 + 32;
		System.out.println(userInput + " fahrenheits is " + celsius
				+ " celsius.");
	}

	public void celsiusToFahrenheit() {
		System.out.println("Conversion from celsius into fahrenheits: ");
		System.out.println("Enter value to be converted:  ");
		System.out.println();
		double userInput = MainConverter.input.nextDouble();
		double fahrenheit = (userInput - 32) / 1.8000;
		System.out.println(userInput + " celsius is " + fahrenheit
				+ " fahrenheit.");
	}

}
