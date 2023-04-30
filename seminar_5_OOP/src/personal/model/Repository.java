package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);

    void updateUser(User user);
    void deleteUser(String userId); // определение метода удаления
    void saveNew(String razdelit); // определение метода для сохранения с новыс разделителем
    
}
