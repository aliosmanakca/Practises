package Practices;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13    
       kök almak için Math.sqrt(sayi) metodunu kullanınız 
         */
		Scanner scan=new Scanner (System.in);
		System.out.println("a dik kenarini giriniz");
		int a=scan.nextInt();
		
		System.out.println("b dik kenarini giriniz");
		int b=scan.nextInt();
		
		double h=Math.sqrt((a*a)+(b*b));
		System.out.println("hipotenus : "+h);
scan.close();
	}

}
