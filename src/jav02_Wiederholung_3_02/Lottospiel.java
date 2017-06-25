package jav02_Wiederholung_3_02;

public class Lottospiel {

	public static void main(String[] args) {
		int[] richtigenVersion1 = {0, 1, 2, 3, 4, 5};
		int[] richtigenVersion2 = new int[6];
		
		for (int i=0; i<6; i++){
			richtigenVersion2[i] = i;
		}
		
		System.out.print("richtigenVersion1 = ");
		
		for (int i=0; i<richtigenVersion2.length; i++){
			System.out.print(richtigenVersion1[i] + " ");
		}
		
		System.out.println("");
		
		System.out.print("richtigenVersion2 = ");
		
		for (int i=0; i<richtigenVersion1.length; i++){
			System.out.print(richtigenVersion2[i] + " ");
		}
		

	}

}
