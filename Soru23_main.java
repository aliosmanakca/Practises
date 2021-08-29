package Practises;

import java.util.Scanner;

public class Soru23_main extends Soru23 {

	static Scanner scan = new Scanner(System.in);
	static int secim =0;

	public static void main(String[] args) {
		
		Soru23 kitapInfo = new Soru23();

		   do {
			   menu();

		switch (secim) {
		case 1:
            kitapInfo.kitapEkle();
			break;

		case 2:
            kitapInfo.noIleGoruntule();
			break;

		case 3:
            kitapInfo.bilgiIleGoruntule();
			break;

		case 4:
            kitapInfo.silme();
			break;

		case 5:

			break;

		case 6:
            System.out.println("hayirli gunler");    
			break;

		default:
			break;
		}
		
		} while(secim != 6);
		

	}

	private static void menu() {
		System.out.println("======ANA MENU======");
		System.out
				.println("1- kitap ekle\r\n" + "2- numara ile kitap goruntule\r\n" + "3- bilgi ile kitap goruntule\r\n"
						+ "4- numara ile kitap sil\r\n" + "5- Tum kitaplari listele\r\n" + "6- cikis");

		System.out.println("seciminizi giriniz");
		   secim = scan.nextInt();
		
	}

}
