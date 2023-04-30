package OopSem4;

public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
        
    }
    public Warrior fight() {
        while(one.getHealthPoint() > 0 && two.getHealthPoint() > 0){
        	System.out.println();
            int hitOne = one.hit(); // сила удара первого героя
            System.out.printf("One warrior hit damge %s. \n", hitOne);
            double veroytnost_shedule = Math.random(); // генерируем случайное число, чтобы узнать вероятность срабатывания щита
            if (veroytnost_shedule < 0.5) { // если число меньше 0.5, то есть 50% - значит щит срабатывает 
            	 // выводим сообщение, что щит сработал
            	System.out.println("Attak one warrior is missing, warrior tow have a shield!");
            	// узнаем какой счит у героя, получаем значение щита и потом уменьшаем его на силу удара
            	if (two.getMyshield().protection() <= 0) { // если броня щита меньше 0, то щит неактивен
            		two.setHealthPoint(two.getHealthPoint() - hitOne); // уменьшение здоровья второго героя  
            	}
            	else {
            		// если у щита есть еще броня, то уменьшаем ее
            		two.getMyshield().setProtection(two.getMyshield().protection() - hitOne);
            	}
            	// выводим количество оставшейся брони щита
            	System.out.printf("Shield protection %d \n", two.getMyshield().protection());
        	}
            else {
            	// если щит не сработал уменьшаем здоровье героя 
            	two.setHealthPoint(two.getHealthPoint() - hitOne); // уменьшение здоровья второго героя
            }
            // выводим сообщение о состоянии героя
            System.out.printf("Two warrior have healthPoint %s. \n", two.getHealthPoint());
            if(two.getHealthPoint() <= 0){
                return one;
            }
            System.out.println();
            int hitTwo = two.hit();
            System.out.printf("Two warrior hit damge %s. \n", hitTwo);
            veroytnost_shedule = Math.random(); // генерируем случайное число, чтобы узнать вероятность срабатывания щита
            if (veroytnost_shedule < 0.5) { // если число меньше 0.5, то есть 50% - значит щит срабатывает 
           	    // выводим сообщение, что щит сработал
            	System.out.println("Attak two warrior is missing, warrior one have a shield!");
            	if (one.getMyshield().protection() <= 0) { // если броня щита меньше 0, то щит неактивен
            		one.setHealthPoint(one.getHealthPoint() - hitTwo); // уменьшение здоровья первого героя  
            	}
            	else {
            		// если у щита есть еще броня, то уменьшаем ее
            		one.getMyshield().setProtection(one.getMyshield().protection() - hitTwo);
            	}
            	// выводим количество оставшейся брони щита
            	System.out.printf("Shield protection %d \n", one.getMyshield().protection());
            }
            else {
            	// если щит не сработал уменьшаем здоровье героя             	
            	one.setHealthPoint(one.getHealthPoint() - hitTwo); // уменьшение здоровья первого героя
            }
            // выводим сообщение о состоянии героя
            System.out.printf("One warrior have healthPoint %s. \n", one.getHealthPoint());
        }
        return two;
    }
}
