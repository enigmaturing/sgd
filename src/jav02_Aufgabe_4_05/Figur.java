package jav02_Aufgabe_4_05;

public abstract class Figur {
	protected int x, y;
	
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	public void bewege(int deltaX, int deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public abstract double getFlaeche();
	
	public abstract double getUmfang();
	
	public abstract void skaliere(int delta);
	
	public abstract void zeichne(java.awt.Graphics g);
}
