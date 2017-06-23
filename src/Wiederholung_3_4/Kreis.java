package Wiederholung_3_4;

public class Kreis {
	private int x, y, radius;
	private double flaeche, umfang;
	private final double PI = 3.14159;
	private static int kreisZaehler = 0;	//Klassenvariable para contar cuántos objetos de la clase Kreis se han instanciado.
											// kreisZahler se incrementa en el constructor y su valor se obtiene a traves del
											// método de clase (es decir, estático) getKreisZahler.
	public Kreis(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		kreisZaehler++;
	}
	
	public static int getKreisZaehler(){
		return kreisZaehler;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public String getInfoKreis(){
		return	"x=" + this.x +
				" y=" + this.y + 
				" radius=" + this.radius +
				" flaeche=" + getFlaeche() + 
				" umfang=" + getUmfang();
		
	}
	
	public double getFlaeche(){
		return PI * radius * radius;
	}
	
	public double getUmfang(){
		return 2 * PI * radius;
	}
	
	public void bewege(int deltaX, int deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public void skaliere(int scale){
		this.radius += scale;
	}
}
