package personal.model;

public class UserMapper {
    public String map(User user) {
        return String.format("%s, %s, %s, %s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
    
    public String mapNew(User user, String razdelit) { // преобразование с новым разделителем
        return String.format("%s%s %s%s %s%s %s", user.getId(), razdelit, user.getFirstName(), razdelit, user.getLastName(), razdelit, user.getPhone());
    }
}
