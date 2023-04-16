public class Product {
    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    private String name;

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    private Integer cost;


    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%s, %d",name, cost);

    }
}
