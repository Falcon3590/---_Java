package seminar_7_OOP.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Log {
    private List<String> messages = new ArrayList<>();

    public void update(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
