import java.util.Iterator;

public class DoublyLinkedList implements Iterable { // создание класса с интерфейсом

    private Element head;
    private Element tail;
    private int count = 0;

    @Override
    public Iterator iterator() { // переопределение методов класса iterator
        return new Iterator<Object>() { // создание класса со своим набором методов
            Element element0 = new Element("0"); // обявление 0 элемента

            {
                element0.setNext(head); // установка объявленного элементиа в начало списка. Перезапись Null на 0.
            }

            Element currentElement = element0; // ссылка на первый элемент для установления середины

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            } // булевая проверка наличия элемента

            @Override
            public Object next() {  // презаписывает следующий элемент
                currentElement = currentElement.getNext();
                return currentElement.getData(); // возврат значения элемента
            }
        };
    }

    private Element getElement(int index) { // проверка на наличие элемента в списке
        if (index >= count) {
            throw new IndexOutOfBoundsException();
        }

        Element result = head;
        for (int i = 1; i <= index; i++) {
            result = result.getNext();
        }
        return result; // возвращает элемент стоящий на конкретном индексе
    }

    public Object get(int index) {

        Element element = getElement(index);

        return element.getData();
    }

    public void remove(int index) { // Удаление

        Element currentElement = getElement(index);
        Element nextElement = currentElement.getNext();
        Element previousElement = currentElement.getPrevious();

        if (index == 0) {
            head = nextElement;
            if (tail == currentElement) {
                tail = null;
            }
        }

        if (index == count - 1) {
            tail = previousElement;
            if (head == currentElement) {
                head = null;
            }
        }

        count--;

        if (nextElement != null) {
            nextElement.setPrevious(previousElement);
        }

        if (previousElement != null) {
            previousElement.setNext(nextElement);
        }

    }

    public void add(int index, Object data) {  // добавление элемента в индекс
        if (count == index) { // проверка на существование нужного индекса
            add(data);
            return;
        }
        count++;

        Element currentElement = new Element(data); // значение которое будет вставленно в linkedList

//        if (index == 0) {
//            head = currentElement;
//        } // как то нужно решить вопрос с добавлением элемента в начало. Этот if дает бесконечный цикл. както нужно внедрить addFirst

        Element nextElement = getElement(index); // берем элемент по указанному индексу, чтобы сдвинуть список правее вставляемого элемента
        Element previousElement = nextElement.getPrevious(); // берем элемент до указанного индекса, чтобы вставить левую часть списка до вставляемого элемента

        currentElement.setNext(nextElement); // связываем вставляемый элемент с правой стороной списка
        currentElement.setPrevious(previousElement); // связываем вставляемый элемент с левой стороной списка

        if (previousElement != null) { // в случае добавления на место 0 индекса не привязывает левую сторону
            previousElement.setNext(currentElement); // привязка предыдущего элемента к вставленному
        }

        }

        public void add (Object data){ // Добавление в конец (функция перегрузки)
            count++;
            Element element = new Element(data);
            if (head == null) {
                head = element;
                tail = element;
                return;
            } else if (tail == null) {
                tail = element;
                return;
            }

            tail.setNext(element);
            element.setPrevious(tail);
            tail = element;
        }

    }