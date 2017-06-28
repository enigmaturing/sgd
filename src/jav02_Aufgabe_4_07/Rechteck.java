package jav02_Aufgabe_4_07;

public class Rechteck extends Figur{
	
	public Rechteck(int x, int y, int breite, int hoehe){
		this.x = x;
		this.y = y;
		this.breite = breite;
		this.hoehe = hoehe;
	}

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
