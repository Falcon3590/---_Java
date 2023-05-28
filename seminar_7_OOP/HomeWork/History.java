package seminar_7_OOP.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class History implements Observer{
    private List<String> entries;

    public History() {
        this.entries = new ArrayList<>();
    }

    public void log(Operation operation, ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        String entry = operation.getClass().getSimpleName() + ": " + num1.toString() + ", " + num2.toString() + " = " + result.toString();
        this.entries.add(entry);
    }

    public List<String> getEntries() {
        return this.entries;
    }

    @Override
    public void update(Operation operation, ComplexNumber num1, ComplexNumber num2) {
        String entry = "Пользователь выполнил операцию " + operation.getClass().getSimpleName() + " с числами " + num1.toString() + " и " + num2.toString();
        this.entries.add(entry);
    }
}
