package jav02_Aufgabe_2_08;

public class KreisTest {

	public static void main(String[] args) {
		Kreis kreis = new Kreis(100, 100, 50);
		String str = kreis.toString();
		System.out.println("Das Kreisobjekt als String: " + str);
	}
	
}