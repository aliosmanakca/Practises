package Practices;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
	    // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
		Scanner scan=new Scanner(System.in);
		System.out.println("ad soyad girin");
		String adSoyad=scan.nextLine();
		
		System.out.println("adiniz : "+ adSoyad.substring(0,adSoyad.indexOf(" ")) + "\nsoyadiniz : "+ adSoyad.substring(adSoyad.indexOf(" ")+1));
	scan.close();	

	}

}
