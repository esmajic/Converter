package Converter;

public class MethodsConverter {

	MethodsConverter() {

	}

	public void poundsToKgs(double userInput) {
		System.out.println("Conversion from kgs into pounds: ");
		double pound = userInput * 0.4535923;
		System.out.println(userInput + " kilograms is " + pound + " pounds.");
		
	}

	public void kgsToPounds(double userInput) {
		System.out.println("Conversion from pounds into kgs: ");
		double kg = userInput / 0.4535923;
		System.out.println(userInput + " pounds is " + kg + " kgs.");
		
	}

	public void inchesToCms(double userInput) {
		System.out.println("Conversion from inches into cms: ");
		double cm = userInput / 0.39370;
		System.out.println(userInput + " inches is " + cm  + " centimeters.");
		
	}

	public void cmsToInches(double userInput) {
		System.out.println("Conversion from cms into inches: ");
		double inch = userInput * 0.39370;
		System.out.println(userInput + " centimeters is " + inch + " inches.");
		
	}

	public void fahrenheitToCelsius(double userInput) {
		System.out.println("Conversion from fahrenheits into celsius: ");
		double celsius = userInput * 1.8000 + 32;
		System.out.println(userInput + " fahrenheits is " + celsius + " celsius.");
	}

	public void celsiusToFahrenheit(double userInput) {
		System.out.println("Conversion from celsius into fahrenheits: ");
		double fahrenheit = (userInput - 32) / 1.8000;
		System.out.println(userInput + " celsius is " + fahrenheit + " fahrenheit.");
	}

}
