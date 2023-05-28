package seminar_7_OOP.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Operation> operations;
    private History history;

    public Calculator() {
        this.operations = new ArrayList<>();
        this.history = new History();
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public ComplexNumber executeOperation(Operation operation, ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = operation.execute(num1, num2);
        this.history.log(operation, num1, num2, result);
        return result;
    }
}
