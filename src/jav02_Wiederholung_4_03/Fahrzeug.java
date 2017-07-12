package jav02_Wiederholung_4_03;

public class Fahrzeug {
	public void rollen(double geschwindigkeit){};
	public void bremsen(double kraft){};
	public void lenken(double winkel){};
	public Abgas emittieren(){return new Abgas();};
}
