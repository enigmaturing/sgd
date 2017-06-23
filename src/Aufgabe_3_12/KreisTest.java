package Aufgabe_3_12;

public class KreisTest {

	public static void main(String[] args) {
		Kreis kreis;
		
		for (int i=0; i<5; i++){
			kreis = new Kreis(100, 100, 50);
		}
		System.out.println(Kreis.getKreisZaehler() + " Kreis Objekte erzeugt.");
		
	}
	
}