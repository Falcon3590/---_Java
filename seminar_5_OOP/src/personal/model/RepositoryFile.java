package personal.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveAllUsers(users);
        return id;
    }

    @Override
    public void updateUser(User updatedUser) {
        List<User> users = this.getAllUsers();
        for (User user : users) {
            if(user.getId().equals(updatedUser.getId())){
                user.setFirstName(updatedUser.getFirstName());
                user.setLastName(updatedUser.getLastName());
                user.setPhone(updatedUser.getPhone());
            }
        }
        saveAllUsers(users);
    }
    
    
    

    private void saveAllUsers(List<User> users){
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);

    }

	@Override
	public void deleteUser(String userId) { // удаление по id
		// TODO Auto-generated method stub
		List<User> users = getAllUsers();  // получение информации о всез пользователях
		for (User user : users) {  // переборка всех пользователей по очереди
			if (user.getId().equals(userId)) {  // если найден нужный пользователь, то удаляем и выходим из цикла
				users.remove(user); // удаление пользователя
				break; // выход из цикла
			}
		}
		saveAllUsers(users);
	}

	@Override
	public void saveNew(String razdelit) { // сохранение с указанным разделителем
		List<User> users = getAllUsers();  // получение информации о всез пользователях
		List<String> lines = new ArrayList<>(); // создание списка, где будут хранится строки о пользователе
		for (User item: users) { // переборка всех пользователей
            lines.add(mapper.mapNew(item, razdelit)); // преобразование экземпляра пользователя в строку с информацией
        }
		FileOperation file = new FileOperationImpl("usersNewSave.txt"); // создание(открытие нового файла для сохранения)
        file.saveAllLines(lines); // созранение всех строк в указанный файл
        
	}

}

