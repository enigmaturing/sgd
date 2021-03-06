package jav02_Wiederholung_4_01;

public abstract class Figur {
	protected int x, y, breite, hoehe;
	
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
