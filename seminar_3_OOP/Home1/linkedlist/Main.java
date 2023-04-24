// Создать список по аналогии linkedlist реализовать в нем iterable интерфейс

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList(); // лист
        list.add("coupon1"); // записываю элементы списка
        list.add("coupon2");
        list.add("coupon3");
        list.add("coupon4");
        list.add(2, "coupon2_2"); // Добавление элемента в середину списка


        Iterator<String> iterator = list.iterator(); // счетчик (iterable интерфейс)
        while (iterator.hasNext()) { // булевое значение о наличии элемента
            System.out.println(iterator.next());
        }

    }
}
