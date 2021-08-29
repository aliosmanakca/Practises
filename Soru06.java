package Practises;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (ipucu: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir
     */
		
		Scanner scan = new Scanner(System.in);
	     System.out.println("Lutfen kenarlari girin");
	     int a = scan.nextInt();
	     int b = scan.nextInt();
	     int c = scan.nextInt();	    
	     
	     if ( (a*a+b*b==c*c) || (b*b+c*c==a*a)  ||  (a*a+c*c==b*b) )  {
	    	 System.out.println("dik ücgen");
	     }
	     else {
	    	 System.out.println("dik ucgen degil");
	     }
scan.close();
	}

}
