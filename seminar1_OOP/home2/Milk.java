public class Milk extends Product {
    
    private final String brand;
    
    public Milk(String name, Integer cost, String brand) {
        super(name, cost);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format("%s, %s",super.toString(), brand);
    }
}
