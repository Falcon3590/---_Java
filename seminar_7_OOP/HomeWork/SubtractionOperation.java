package seminar_7_OOP.HomeWork;

public class SubtractionOperation implements Operation {

    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.subtract(num2);
        System.out.println("Выполнено вычитание " + num1 + " и " + num2 + ", результат: " + result);
        return result;
    }
}
