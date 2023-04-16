// 2. Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: наименование, объем, температура, цена. Проинициализировать несколько напитков в классе main и торговый автомат, воспроизвести логику продажи напитков. Сделать на основе ООП

package seminar1_OOP.home1;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeAutomate = new CoffeeMachine();
        coffeeAutomate.addCoffee(new Coffee("Americano", 80, 100, 70, 10))
                .addCoffee(new Coffee("Capuchino", 100, 200, 75, 5))
                .addCoffee(new Coffee("Latte", 110, 200, 80, 10))
                .addCoffee(new Coffee("Hot chocolate", 150, 200, 90, 5));

        System.out.println("До продажи: ");
        System.out.println(coffeeAutomate);
        System.out.println();
        System.out.println("Продажа:");
        PrintSell(coffeeAutomate, "Americano");
        PrintSell(coffeeAutomate, "Capuchino");
        PrintSell(coffeeAutomate, "Latte");
        PrintSell(coffeeAutomate, "Hot chocolate");

        System.out.println();
        System.out.println("После продажи");
        System.out.println(coffeeAutomate);
        System.out.println();
        System.out.println("Продажа:");
        PrintSell(coffeeAutomate, "Hot chocolate");
        PrintSell(coffeeAutomate, "Hot chocolate");

        System.out.println();
        System.out.println("После продажи");
        System.out.println(coffeeAutomate);

        System.out.println();
        System.out.println("Продажа:");
        PrintSell(coffeeAutomate, "Цикорий");
        System.out.println(coffeeAutomate);
    }

    public static void PrintSell(CoffeeMachine machine, String nameCafe) { // Вывод информации и продажа
        try {
            System.out.println(machine.sell(nameCafe));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}