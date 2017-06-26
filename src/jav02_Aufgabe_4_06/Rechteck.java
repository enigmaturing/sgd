package jav02_Aufgabe_4_06;

public class Rechteck extends Figur{
	
	public double getUmfang(){
		return 2 * this.breite + 2 * this.hoehe;
	}
	
	public double getFlaeche(){
		return this.breite * this.hoehe;
	}
	
	public void skaliere(int delta){
		this.breite = delta * this.breite;
		this.hoehe = delta * this.hoehe;
	}
	
	public void zeichne(java.awt.Graphics g){
		g.drawRect(this.x, this.y, this.breite, this.hoehe);
	}

}
