package Wiederholung_3_5_a;

public class KreisTest {

	public static void main(String[] args) {
		int mengeAnKreisen = 10;
		Kreis[] kreisArray = new Kreis[mengeAnKreisen];
		
		for (int i=0; i<mengeAnKreisen; i++){
			kreisArray[i] = new Kreis(100, 100, 50);
		}
		
		System.out.println(Kreis.getKreisZaehler() + " Kreis Objekte erzeugt.");
		
		System.out.println("Info von Kreis im 1. Position: " + kreisArray[0].getInfoKreis());
		
		System.out.println("Info von Kreis im 3. Position: " + kreisArray[2].getInfoKreis());
		
		kreisArray[2].setRadius(2);
		
		System.out.println("Info von Kreis im 1. Position: " + kreisArray[0].getInfoKreis());
		
		System.out.println("Info von Kreis im 3. Position: " + kreisArray[2].getInfoKreis());
	}
	
}