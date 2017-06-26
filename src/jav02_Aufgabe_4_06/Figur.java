package jav02_Aufgabe_4_06;

public abstract class Figur {
	protected int x, y;
	protected int breite, hoehe;
	
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	public int getBreite() { return breite; }
	
	public int getHoehe() { return hoehe; }
	
	public void bewege(int deltaX, int deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public abstract double getFlaeche();
	
	public abstract double getUmfang();
	
	public abstract void skaliere(int delta);
	
	public abstract void zeichne(java.awt.Graphics g);
}
