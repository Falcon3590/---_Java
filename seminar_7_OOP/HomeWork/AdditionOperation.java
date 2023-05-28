package seminar_7_OOP.HomeWork;

public class AdditionOperation implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.add(num2);
        System.out.println("Выполнено сложение " + num1 + " и " + num2 + ", результат: " + result);
        return result;
    }
}
