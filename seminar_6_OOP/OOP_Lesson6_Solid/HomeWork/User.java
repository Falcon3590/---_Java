package HomeWork;

public class User implements Saveable, Reportable{

	//Приватное поле имя
	private String name;

	//Коснтруктор
	public User(String name){
		this.name = name;
	}

	//получение имени
	public String getName(){
		return name;
	}

	@Override
	//ф-ция реализованная из интерфейса Reportable
	public void report(){
		System.out.println("Report for user: " + getName());
	}

	//ф-ция реализованная из интерфейса Saveable
	@Override
	public void save() {
		System.out.println("Save user: " + getName());
	}
}
