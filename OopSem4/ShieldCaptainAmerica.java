package OopSem4;

public class ShieldCaptainAmerica implements Shield{
    private int protect = 30;
	
	@Override
    public int protection() {
        return protect;
    }
    @Override
    public String toString() {
        return String.format("Shield Captain America, max protection %d", protection());
    }
	@Override
	public void setProtection(int value) {
		// TODO Auto-generated method stub
		protect = value;
		
	}
}
