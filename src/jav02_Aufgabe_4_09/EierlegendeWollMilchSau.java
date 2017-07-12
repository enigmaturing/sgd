package jav02_Aufgabe_4_09;

public class EierlegendeWollMilchSau  implements Schaf, Huhn{
	
	public void picken(Geteide koerner){}
	
	public void weiden(Grass grass){};
	
	public Ei legen(){return new Ei();};
	
	public Wolle scheren(){return new Wolle();};
	
	public Milch melken(){return new Milch();};
	
	public static void main(String args[]){System.out.println("Hecho!");};

	
}
