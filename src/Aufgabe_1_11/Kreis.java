package Aufgabe_1_11;

public class Kreis {
	int x, y, radius;
	double flaeche, umfang;
	final double PI = 3.14159;
	
	public Kreis(int x, int y, int radius){
		x = x; //The assignment ot variable x has no effect, because with x we are referring always to the local variable of the method Kreis, not to the instance Variable. We need to use this.x to refer to the instance variable
		y = y;
		radius = radius;
		flaeche = PI * radius * radius;
		umfang = 2 * PI * radius;
	}
	
	public void bewege(int deltaX, int deltaY){
		x += deltaX;
		y += deltaY;
	}
}
