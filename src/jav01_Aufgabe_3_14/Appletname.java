package jav01_Aufgabe_3_14;

public class Appletname extends java.applet.Applet{
	int zahl;
	public void init(){
		zahl = 1000;
	}
	public void paint(java.awt.Graphics g){
		g.drawString("zahl = " + zahl, 30, 30);
	}
}
