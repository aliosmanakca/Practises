package Practices;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		//kullanicidan alinan sayinin mutlak degerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<0)  {
			System.out.println(sayi*=(-1));	
		}
		else {
			System.out.println(sayi);
		}
		
scan.close();
	}

}
