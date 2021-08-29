package Practises;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		//Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
		Scanner scan=new Scanner(System.in);
        System.out.println("adınızı soyadınız giriniz : ");
        String adSoyad=scan.nextLine();//hakan tetik javacı
        
       String name1=adSoyad.substring(0,adSoyad.indexOf(" "));
       String name2=adSoyad.substring(adSoyad.indexOf(" ")+1,adSoyad.lastIndexOf(" "));
       String soyadString=adSoyad.substring(adSoyad.lastIndexOf(" ")+1);
        
       char n1=name1.charAt(0);
       char n2=name2.charAt(0);
       char n3=soyadString.charAt(0);
       
   System.out.println("adınız : "+name1+ " ikinci adınz : "+name2+" soyadınız : "+soyadString); 
   System.out.println(n1+". "+n2+". "+n3+".");
		
scan.close();
	}

}
