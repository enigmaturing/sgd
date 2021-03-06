package jav02_Aufgabe_4_05;

public class Kreis extends Figur {
	private int radius;
	private double flaeche, umfang;
	private final double PI = 3.14159;
	private static int kreisZaehler = 0;	//Klassenvariable para contar cu�ntos objetos de la clase Kreis se han instanciado.
											// kreisZahler se incrementa en el constructor y su valor se obtiene a traves del
											// m�todo de clase (es decir, est�tico) getKreisZahler.
	public Kreis(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		kreisZaehler++;
	}
	
	public void skaliere(int scale){
		this.radius += scale;
	}
	
	public void zeichne(java.awt.Graphics g){
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	}
	
	public double getFlaeche(){
		return PI * radius * radius;
	}
	
	public double getUmfang(){
		return 2 * PI * radius;
	}
	
	public static int getKreisZaehler(){
		return kreisZaehler;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
}

