package tareaFinalJAV02;

public class Kreis {
	private int x, y, radius;
	private double flaeche, umfang;
	private final double PI = 3.14159;
	
	public Kreis(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX(){
		return x;
	}	
	
	public double getY(){
		return y;
	}	
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public double getFlaeche(){
		return PI * radius * radius;
	}
	
	public double getUmfang(){
		return 2 * PI * radius;
	}
	
	public void bewege(int deltaX, int deltaY){
		x += deltaX;
		y += deltaY;
	}
	
	public void skaliere(int scale){
		radius += scale;
	}
}
