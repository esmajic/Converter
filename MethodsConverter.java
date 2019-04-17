package Converter;

public class MethodsConverter {

	MethodsConverter() {

	}

	public void kgsToPounds(double userInput) {
		System.out.println("Conversion from kgs into pounds: ");
		double pound = userInput * 0.4535923;
		System.out.println(userInput + " kilograms is " + pound + " pounds.");
		
	}

	public void poundsToKgs(double userInput) {
		System.out.println("Conversion from pounds into kgs: ");
		double kg = userInput / 0.4535923;
		System.out.println(userInput + " pounds is " + kg + " kgs.");
		
	}

	public void multiplication(int a, int b) {
		System.out.println("Koliko je " + a + " * " + b + " ?");
		int rezultat = MainQuiz.input.nextInt();
		System.out.println(rezultat == (a * b) ? "Odgovor je tacan."
				: "Odgovor je netacan.");
	}

	public void division(int a, int b) {
		System.out.println("Koliko je " + a + " / " + b + " ?");
		int rezultat = MainQuiz.input.nextInt();
		System.out.println(rezultat == (a / b) ? "Odgovor je tacan."
				: "Odgovor je netacan.");
	}

	public void sqrt(int a) {
		System.out.println("Koliko je korijen iz " + a + " ?");
		int rezultat = MainQuiz.input.nextInt();
		System.out.println(rezultat == (Math.sqrt(a)) ? "Odgovor je tacan."
				: "Odgovor je netacan.");
	}

	public void square(int a) {
		System.out.println("Koliko je " + a + " na kvadrat?");
		int rezultat = MainQuiz.input.nextInt();
		System.out.println(rezultat == (Math.pow(a, 2)) ? "Odgovor je tacan."
				: "Odgovor je netacan.");
	}

}
