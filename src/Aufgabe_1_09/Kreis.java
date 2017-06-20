package Aufgabe_1_09;

public class Kreis {
	int x, y, radius;
	double flaeche, umfang;
	final double PI = 3.14159;
	
	public Kreis(int xParam, int yParam, int radiusParam){
		x = xParam;
		y = yParam;
		radius = radiusParam;
		flaeche = PI * radius * radius;
		umfang = 2 * PI * radius;
	}
	
	public void bewege(int deltaX, int deltaY){
		x += deltaX;
		y += deltaY;
	}
}
