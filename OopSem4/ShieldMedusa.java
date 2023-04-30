package OopSem4;

public class ShieldMedusa implements Shield{
	private int protect = 20;
	
    @Override
    public int protection() {
        return protect;
    }
    @Override
    public String toString() {
        return String.format("Shield Medusa, max protection %d", protection());
    }
    
    @Override
	public void setProtection(int value) {
		// TODO Auto-generated method stub
		protect = value;
		
	}
}
