package Converter;

public class Converter {

	private int userInput;

	Converter(int userInput) {
		this.userInput = userInput;
	}

	public int getUserInput() {
		return userInput;
	}

	public void setUserInput(int userInput) {
		this.userInput = userInput;
	}

	@Override
	public String toString() {
		return "Converter [userInput=" + userInput + "]";
	}

}
