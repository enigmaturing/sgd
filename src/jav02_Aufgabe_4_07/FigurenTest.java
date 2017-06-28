package jav02_Aufgabe_4_07;

public class FigurenTest extends java.applet.Applet {
	
	Kreis kreis;
	Rechteck rechteck;
	
	public void init(){
		kreis = new Kreis(30, 30, 20);
		rechteck = new Rechteck (80, 80, 100, 180);
	}
	
	public void paint(java.awt.Graphics g){
		kreis.zeichne(g);
		rechteck.zeichne(g);
	}
	
}
