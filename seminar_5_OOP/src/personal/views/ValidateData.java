package personal.views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {

    String patternName = "^\\S+$";
    String patternPhone = "^((\\+7|7|8)+([0-9]){10})$"; // регулярное выражение для проверки номера телефона
    
    Pattern pattern = Pattern.compile(patternName, Pattern.MULTILINE);
    Pattern patternphone = Pattern.compile(patternPhone, Pattern.MULTILINE); // создание шаблона для проверки с использованием регулярного выражения
    
    public boolean checkFirstName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkLastName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkPhone(String phone) { // проверка номера телефона с использованием шаблона
    	Matcher matcher = patternphone.matcher(phone);
        return !matcher.find();
    }

}
