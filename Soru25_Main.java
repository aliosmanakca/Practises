package Practises;

import java.util.Scanner;

public class Soru25_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Soru25 obj1 = new Soru25();
		System.out.println(obj1.getAd());
		System.out.println(obj1.adres);
		
		/*System.out.println("isim girin");
		obj1.setAd(scan.nextLine());
		
		System.out.println(obj1.getAd());
		*/
		
		obj1.setAd("said");
		
		Soru25 obj2 = new Soru25("ali",25);
		
		System.out.println(obj2.getAd());
		System.out.println(obj2.getYas());
		
		System.out.println(obj1.toString()); 
		
scan.close();
	}



}
