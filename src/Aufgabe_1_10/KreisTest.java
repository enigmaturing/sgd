package Aufgabe_1_10;

public class KreisTest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis(10, 10, 10);
		System.out.println("x = " + kreis.x + ", y = " + kreis.y);
		kreis.bewege(3, 5);
		System.out.println("x = " + kreis.x + ", y = " + kreis.y);
	}
	
}