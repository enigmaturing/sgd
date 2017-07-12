package jav02_Wiederholung_4_01;

public class FigurenTest extends java.applet.Applet {
	
	Rechteck rechteck;
	
	public void init(){
		rechteck = new Rechteck(30, 30, 200, 100);
	}
	
	public void paint(java.awt.Graphics g){
		rechteck.zeichne(g);
		rechteck.skaliere(2);
		rechteck.zeichne(g);
	}
	
}
