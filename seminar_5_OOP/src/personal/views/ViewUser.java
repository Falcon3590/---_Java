package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;
    private ValidateData validate = new ValidateData();
    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        printAllUsers();
                        break;
                    case UPDATE:
                        updateUser();
                    case DELETE:
                    	deleteUser();
                    case SAVENEW:
                    	saveNew();

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void createUser() {
        userController.saveUser(inputUser());
    }
    private User inputUser(){
        String firstName;
        String lastName;
        String phone;
        do {
            firstName = prompt("Имя: ");
        } while(validate.checkFirstName(firstName));
        do {
            lastName = prompt("Фамилия: ");
        } while( validate.checkLastName(lastName));
        do { // проверка номера телефона
            phone = prompt("Номер телефона: ");
        } while( validate.checkPhone(phone));
        return  new User(firstName, lastName, phone);
    }
    
    // удаление пользователя по id
    private String deleteUser(){
    	String id = prompt("Идентификатор пользователя: "); // считывание id
        try {
            userController.deleteUser(id); // удаление пользователя с помощтью функции в файле UserController 
        } catch (Exception e) {
            throw new RuntimeException(e); // если пользователь не найден
        }
        
    	return "Пользователь удален!";
    }
    
    private String readUser() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    private void updateUser() {
        String id = readUser();
        User updatedUser = inputUser();
        updatedUser.setId(id);
        userController.updateUser(updatedUser);
    }

    private void printAllUsers() {
        List<User> users = userController.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
    
    private void saveNew() { // созранение с новым разделителем
    	String razdel = prompt("Введите разделитель"); // считывание нового разделителя
    	userController.saveNew(razdel); // вызов функции для сохранения с новым разделителем
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
