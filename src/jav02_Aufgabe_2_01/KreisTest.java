package jav02_Aufgabe_2_01;

public class KreisTest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis(100, 100, 50);
		System.out.println("vor Direktugriff: Flaeche = " + kreis.flaeche + ", Umfang = " + kreis.umfang);
		kreis.flaeche = 1000000;
		kreis.umfang = 0;
		System.out.println("nach Direktugriff: Flaeche = " + kreis.flaeche + ", Umfang = " + kreis.umfang);
	}
	
}