package jav02_Aufgabe_2_05;

public class KreisTest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis(100, 100, 50);
		System.out.println("vor Indirektugriff: Flaeche = " + kreis.getFlaeche() + ", Umfang = " + kreis.getUmfang());
		kreis.setRadius(1);
		System.out.println("nach Indirektugriff: Flaeche = " + kreis.getFlaeche() + ", Umfang = " + kreis.getUmfang());
	}
	
}