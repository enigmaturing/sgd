package jav02_Aufgabe_4_02_a;

public class KreisApplet extends java.applet.Applet {
	Kreis kreis;
	public void init(){
		kreis = new Kreis(130, 130, 100);
	}
	public void paint(java.awt.Graphics g){
		kreis.zeichne(g);
	}
}
