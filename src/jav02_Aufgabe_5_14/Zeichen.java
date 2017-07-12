package jav02_Aufgabe_5_14;

public class Zeichen {
	private Character charObj;
	private int anzahl;
	
	public Zeichen(Character charObj){
		this.charObj = charObj;
		anzahl = 1;
	}
	
	public void increment(){
		anzahl++;
	}
	
	//this method overwrites the method toString of the class Object
	public String toString(){
		return charObj.toString() + "\t" + anzahl;
	}
}
