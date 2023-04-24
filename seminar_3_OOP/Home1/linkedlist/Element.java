
public class Element {

    Object data;
    private Element next;
    private Element previous;

    public Element(Object data) { // замена текущего объекта data
        this.data = data;
    }

    public Object getData() { // возвращает data
        return data;
    }

    public Element getNext() {
        return next;
    } // возвращает следующий элемент

    void setNext(Element element) { // устанавливается следующий элемент
        next = element;
    }

    void setPrevious(Element element) { // устанавливается предыдущий элемент
        previous = element;
    }

    public Element getPrevious() {
        return previous;
    } // возвращает предыдущий элемент
}