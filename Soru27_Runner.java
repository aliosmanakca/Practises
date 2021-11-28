package Practices;

import java.util.Scanner;

public class Soru27_Runner {

	// static Dikdortgen Soru27_Dikdortgen=new Soru27_Dikdortgen();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Soru27_Dikdortgen dikdortgen = new Soru27_Dikdortgen(5, 10);
		
		/*
		 * 2. yontem
		 *System.out.println("kısa kenar : ");
		 * Soru27_Dikdortgen.kk=scan.nextInt(); 
		 * System.out.println("uzun kenar : ");
		 * Soru27_Dikdortgen.uk=scan.nextInt();
		 */
		System.out.println("dikdortgenin cevresi: " + dikdortgen.cevre());
		System.out.println("dikdortgenin alani : " + dikdortgen.alan());

	}
}
