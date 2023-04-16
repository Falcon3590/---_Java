// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
// На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п., можно добавить несколько классов), они должны наследоваться от класса Product, надо переопределить метод toString и попробовать включить эти классы в VendingMachine, вывести список товаров из VendingMachine

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("cheese", 300))
                .addProduct(new Product("water", 10))
                .addProduct(new Product("wine", 330))
                .addProduct(new Yogurt("Danone", 300, "sweet"))
                .addProduct(new Perfume("Si", 6500, "Dior"))
                .addProduct(new Milk("milk", 80, "Merry Milkman"));

        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        Product found = vendingMachine.findProduct("water");
        System.out.println(found);
        System.out.println("Покупаем товар");
        Product sold = vendingMachine.sellProduct(found);
        System.out.println(sold);
        System.out.println("В автомате столько денег:");
        System.out.println(vendingMachine.getAmount());
        System.out.println("---------------------");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Покупаем товар");
        Product perfume = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));
        System.out.println(perfume);
        Product milk = vendingMachine.sellProduct(vendingMachine.findProduct("milk"));
        System.out.println(milk);
        System.out.println("Осталось товаров: ");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Денег в автомате: ");
        System.out.println(vendingMachine.getAmount());
        try {
            Product perf = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));
            System.out.println(perf);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
