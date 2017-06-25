package jav02_Aufgabe_2_01;

public class Kreis {
	int x, y, radius;
	double flaeche, umfang;
	final double PI = 3.14159;
	
	public Kreis(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		flaeche = PI * radius * radius;
		umfang = 2 * PI * radius;
	}
	
	public void bewege(int deltaX, int deltaY){
		x += deltaX;
		y += deltaY;
	}
	
	public void skaliere(int scale){
		this.radius += scale;
		flaeche = PI * radius * radius;
		umfang = 2 * PI * radius;
	}
}
