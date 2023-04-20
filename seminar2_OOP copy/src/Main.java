package seminar2_OOP.src;
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());

        zoo.addList(new Wolf("Wolf"))
                .addList(new Hare("Hare"))
                .addList(new Duck("DonaldDuck"))
                .addList(new Bat("Batman"))
                .addList(new Fish("Sunfish"));
        for (var item: zoo.getListAnimal()) {
            System.out.println(item);
        }
        for(var item: zoo.getSayble()){
            System.out.println(item.say());
        }
        System.out.println("------------------");
        for (var item: zoo.walkables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForWalk());
        }
        System.out.println("-----------------");
        for (var item: zoo.flyables()) {
            System.out.printf("%s - %d\n", item.toString(), item.speedForFly());
        }
        System.out.println("-----------------");
        System.out.println("Быстрее всех бегает:");
        System.out.println("Winner " + zoo.winnerWalk());
        System.out.println("-----------------");
        System.out.println("Быстрее всех летает:");
        System.out.println("Winner " + zoo.winnerFly());
        System.out.println("-----------------");
        System.out.println("Быстрее всех плавает:");
        System.out.println("Winner " + zoo.winnerFloat());
    }
}