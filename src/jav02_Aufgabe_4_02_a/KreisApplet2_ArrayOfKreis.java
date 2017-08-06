package jav02_Aufgabe_4_02_a;

public class KreisApplet2_ArrayOfKreis extends java.applet.Applet {
	int anzahlAnKreise = 50;
	Kreis[] kreis = new Kreis[anzahlAnKreise]; 				// declare an array of kreis-objects
	public void init(){
		for (int i=0; i<kreis.length; i++){
			kreis[i] = new Kreis(50 + 3*i, 50 + 3*i, 40 + i);  	// initialize each kreis-object in the kreis-aray
		}
	}
	public void paint(java.awt.Graphics g){
		for (int i=0; i<kreis.length; i++){					//display each kreis-object present in the kreis-array
			kreis[i].zeichne(g);
		}
	}
}
