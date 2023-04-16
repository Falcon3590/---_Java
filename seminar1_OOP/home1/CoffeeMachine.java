package seminar1_OOP.home1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Coffee> cafes = new ArrayList<>(); // список с типом данных Coffee
    private double money = 0;

    public CoffeeMachine addCoffee(Coffee cafe) {  // Метод записывает новый кофе
        cafes.add(cafe);
        return this;
    }

    public Coffee searchCoffee(String name) { // Поиск напитка в автомате
        for (Coffee item : cafes) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Coffee sell(String name) throws Exception { // продажа кофе
        Coffee target = searchCoffee(name); // проверяем наличие
        try {
            if (!target.sellCounter()) { // если кофе закончился удалить из списка
                cafes.remove(target);

            }
            this.money += target.getPrice(); // у всего автомата увеличить счечик на стоимость напитка
        } catch (NullPointerException e) {
            throw new Exception("Товар не найден", e);
        }

        return target; // новое значение объекта класса
    }

    @Override // переопределить встроиный метод на написанный ниже
    public String toString() { // Ввывод статистики работы кофейного автомата
        StringBuilder res = new StringBuilder();
        for (Coffee item : cafes) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей", money));
        return res.toString();
    }
}
