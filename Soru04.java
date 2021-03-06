package Practices;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
		 * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
		 * durumunu da kontrol edniz
		 * 
		 * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi
		 * iki kenar farkı diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c b+c>a>b-c
		 * a=b=c ise es kenar ucgen
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("a  kenarini  giriniz : ");
		int a = scan.nextInt();

		System.out.print("b kenarini  giriniz : ");
		int b = scan.nextInt();

		System.out.print("c  kenarini  giriniz : ");
		int c = scan.nextInt();

		if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {// ücgen olayı kontrol eder

			if (a == b && b == c) {// ücgenin eskenarlığını kontrol eder
				System.out.println("ucgeniniz eskenar");

			} else
				System.out.println("ucgeniniz eskenar degil");// ucgen ama eskear olamama durumu

		} else
			System.out.println("girdiginiz kenarlar bir ucgen belirtmez");// ucgen olmama durumu

		scan.close();

	}

}
