package seminar1_OOP.home1;

public class Coffee { // Свойства объекта
    private String name;
    private double price;
    private int temperature;
    private int volume;
    private int counter;

    public Coffee(String name, double price, int volume, int temperature, int value) { // конструктор
        this.name = name;
        this.price = price;
        this.temperature = temperature;
        this.volume = volume;
        counter = value;
    }

    public String getName() {  // для получения названия напитка 
        return name;
    }

    public void setName(String name) { // настройка наименования
        this.name = name;
    }

    public boolean sellCounter() { // счечик наличия
        this.counter--;
        return counter > 0;
    }

    public double getPrice() { // получение цены 
        return price;
    }

    public void setPrice(double price) { // настройка цены
        this.price = price;
    }

    public int getTemperature() { // получение температуры
        return temperature;
    }

    public void setTemperature(int temperature) { // настройка температуры
        this.temperature = temperature;
    }

    public int getVolume() { // получение количества
        return volume;
    }

    public void setVolume(int volume) { // настройка количества
        this.volume = volume;
    }

    @Override // переопределить встроиный метод на написанный ниже
    public String toString() {
        return String.format("%s : %.2f р.", name, price); // выводит наименование и цену
    }
}