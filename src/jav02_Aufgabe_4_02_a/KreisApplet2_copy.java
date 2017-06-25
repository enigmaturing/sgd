package jav02_Aufgabe_4_02_a;

public class KreisApplet2_copy extends java.applet.Applet {
	int anzahlAnKreise = 200;
	Kreis[] kreis = new Kreis[anzahlAnKreise];  // declare an array of kreis-objects
	public void init(){
		for (int i=0; i<kreis.length; i++){
			kreis[i] = new Kreis(130 + 2 * i, 130, 100);  // initialize each kreis-object in the kreis-aray
		}
	}
	public void paint(java.awt.Graphics g){
		for (int i=0; i<kreis.length; i++){
			kreis[i].zeichne(g);
		}
	}
}
