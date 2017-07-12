package jav02_Aufgabe_5_14;

public class BuchstabenMap extends java.util.TreeMap{
	String str = "Dies ist en etwas langerer Text, der von...";
	private Zeichen zeichenObj;
	
	public static void main(String [] args){
		BuchstabenMap miMapa = new BuchstabenMap();
		miMapa.count();
		miMapa.print();
	}
	
	public void count(){
		int textLength = str.length();
		int index = 0;
		while(index < textLength){
			char c = str.charAt(index);
			Character charObj = new Character(c);
			zeichenObj = (Zeichen)get(charObj);
			if (zeichenObj == null){
				zeichenObj = new Zeichen(charObj);
				put(charObj, zeichenObj);
			}else{
				zeichenObj.increment();
			}
			index++;
		}
	}
	
	public void print(){
		java.util.Collection coll = this.values();
		java.util.Iterator iterator = coll.iterator();
		
		while(iterator.hasNext()){
			zeichenObj = (Zeichen)iterator.next();
			System.out.println(zeichenObj.toString());
		}
		System.out.println(zeichenObj.toString());
		System.out.println("Die Map umfasst " + this.size() + " Zeichen-Objekte, "
				+ "der Text enthält " + str.length() + " Zeichen.");
	}
}

