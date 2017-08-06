package tareaFinalJAV02;

public class HashDatenstruktur {

	public static void main(String[] args) {
	      // Erzeugung eines Hashtable mithilfe des parameterlosen Hashtable-Konstruktors.
		java.util.Hashtable hashtableKreise = new java.util.Hashtable();
	      
	      /* Erzeugung von sechs verschiedenen Objekte der Klasse "Kreis" mit Unterschchiedlichen Eigenschaften als anonyme Objekte
	         Die Kreis Objekte mappe ich in die Hashtable. Als Schl´ssel benutze ich Hüllklassen-Objekte für den einfachen Datentyp "int",
	         die ich fortlaufend ab "0" erzeuge */
		for (int i = 0; i<6; i++){
	      hashtableKreise.put((Integer) i, new Kreis(10*i + 10,10*i + 10,2*i + 10));
		}
	      
	      // Ich ermittle das vierte Element in der Hashtable.
	      Kreis kreis = (Kreis) hashtableKreise.get((Integer) 3);

	      // Ich gebe dessen x- und y-Koordinaten auf der Konsole aus.
	      System.out.println("X-Koordinate: " + kreis.getX());
	      System.out.println("Y-Koordinate: " + kreis.getY());
	}

}
