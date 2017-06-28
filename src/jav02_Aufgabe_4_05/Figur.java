package jav02_Aufgabe_4_05;

public abstract class Figur {
	protected int x, y;               // since the methods getX, getY and bewege were verlagert, this two Instanz-Variablen will be declared as protected, in order for the child classes to heritage them, but to avoid not-child-classes to access to them.
	
	public int getX() { return x; }   // the method "getX" was verlagert because its declaration and implementation is the same for all of the child-classes.
	
	public int getY() { return y; }   // the method "getY" was verlagert because its declaration and implementation is the same for all of the child-classes.
	
	public void bewege(int deltaX, int deltaY){  // the method "bewege" was verlagert because its declaration and implementation is the same for all of the child-classes.
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public abstract void skaliere(int delta);  // the method "skaliere" was delcared as abstract in the superclass because its declaration is the same for all of the child-classes but not its implementation.
	
	public abstract void zeichne(java.awt.Graphics g);   // the method "zeichne" was delcared as abstract in the superclass because its declaration is the same for all of the child-classes but not its implementation.
	
	public abstract double getFlaeche();  // the method "getFlaeche" was declared as abstract in the superclass because its declaration is the same for all of the child-classes, but not its implementation.
	
	public abstract double getUmfang();   // the method "getUmfang" was declared as abstract in the superclass because its declaration is the same for all of the child-classes, but not its implementation.
}
