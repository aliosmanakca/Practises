package Practices;

import java.util.Scanner;
 
public class Soru28_Musteri {

	Soru28_AnaAbstract anaabstarct; 
	Scanner scan = new Scanner(System.in);

	public void alisveris() {    
		
		System.out.println("Ekmek Hesaplaması");
		System.out.println("kaç adet ekmek almak istiyorsunuz");
		int x=scan.nextInt();
		
		System.out.println("Ekmek fiyatı : " + anaabstarct.ekmekAl(x)/x+"TL" );
		System.out.println("Odeyeceğiniz miktar : "+anaabstarct.ekmekAl(x) + " TL");

}
}
