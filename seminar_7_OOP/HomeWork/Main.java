package seminar_7_OOP.HomeWork;

import java.util.List;

public class Main{
	public static void main(String[] args){
		ComplexNumber num1 = new ComplexNumber(3.2, -8);
		ComplexNumber num2 = new ComplexNumber(6, 3.3);


		Operation addition = new AdditionOperation();
		Operation subtraction = new SubtractionOperation();



		Calculator calculator = new Calculator();
		calculator.addOperation(addition);
		calculator.addOperation(subtraction);


		calculator.executeOperation(addition, num1, num2);
		calculator.executeOperation(subtraction, num1, num2);


		History history = calculator.getHistory();
		List<String> entries = history.getEntries();
		for (String entry : entries) {
			System.out.println(entry);
		}
	}
}