package Wiederholung_1_2;

public class KreisTest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis(10, 10, 10);
		System.out.println("flaeche = " + kreis.flaeche + " umfang = " + kreis.umfang);
		kreis.skaliere(55);
		System.out.println("flaeche = " + kreis.flaeche + " umfang = " + kreis.umfang);
	}
	
}