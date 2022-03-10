
public class BirouClient {

	public static void main(String[] args) {
		Sertar s1 = new Sertar(10, 5, 3);
		System.out.println("Sertar 1: " + s1);
		Sertar s2 = new Sertar(12, 10, 4);
		System.out.println("Sertar 2: " + s2);
		Birou b1 = new Birou(50, 60, 100);
		System.out.println(b1 + " cu sertarele:");
		System.out.println(b1.sertar1);
		System.out.println(b1.sertar2);
		
	}

}
