package HomeWork;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Report report = new Report();
		Save save = new Save();
		report.report(user);
		save.save(user);
	}
}
