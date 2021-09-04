package Practises;

import java.util.Scanner;

public class Soru28_Runner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Soru28_Musteri musteri=new Soru28_Musteri();
		System.out.println("nereden alisveris yapacaksiniz (1-Market/ 2-Halk ekmek)");
		int secim=scan.nextInt();
		
		if (secim==1) {
			musteri.anaabstarct=new Soru28_Market();	
			
		}else {
			musteri.anaabstarct=new Soru28_HalkEkmek();	
		}
			
		musteri.alisveris(); 
scan.close();
	}

}
