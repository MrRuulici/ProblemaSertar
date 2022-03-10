
public class Birou {
	private int l, L, H;
	Sertar sertar1 = new Sertar(10, 12, 5);
	Sertar sertar2 = new Sertar(8, 10, 5);
	
	public Birou(int l, int l2, int h) {
		
		this.l = l;
		L = l2;
		H = h;
	}

	@Override
	public String toString() {
		return "Birou: [" + l + ", " + L + ", " + H + "]";
	}
	
	
	
}
