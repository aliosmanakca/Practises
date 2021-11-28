package Practices;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Soru30 {

	static Scanner scan = new Scanner(System.in);
	static HashMap<Integer, String> kitap = new HashMap<>();

	public static void main(String[] args) {
		/*
		 * Bir kitapci icin program yapalim
		 *
		 * Kitap no 1000'den baslayarak sirali no olsun Her kitap icin kitapAdi,
		 * yazarAdi,yayinYili,fiyati bilgilerini girelim
		 *
		 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
		 * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
		 * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- Bitir
		 */

		topluKitapEkle();
		menu();

	}

	public static void menu() {

		System.out.println("1-Kitap ekle \n" + "2-Numara ile kitap görüntüle \n" + "3-Bilgi ile kitap görüntüle \n"
				+ "4-Numara ile kitap sil \n" + "5-Tüm kitapları listele \n" + "6-Çıkış");

		System.out.println("Hangi işlemi yapmak istiyorsunuz");
		int secim = scan.nextInt();
		switch (secim) {
		case 1:
			kitapEkle();
			break;
		case 2:
			noIleGoruntule();
			break;
		case 3:
			bilgiIleGoruntule();
			break;
		case 4:
			noIleSil();
			break;
		case 5:
			listele();
			break;
		case 6:
			cikis();
			break;
		default:
			break;
		}

	}

	private static void cikis() {
		// TODO Auto-generated method stub

	}

	private static void listele() {

		for (Entry<Integer, String> entry : kitap.entrySet()) {
			System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());

		}

	}

	private static void noIleSil() {
		// TODO Auto-generated method stub

	}

	private static void bilgiIleGoruntule() {

		scan.nextLine();
		System.out.println("Hangi bilgi ile goruntuleme yapmak istiyorsunuz");
		String bilgi = scan.nextLine();

		int flag = 0;

		for (Entry<Integer, String> entry : kitap.entrySet()) {
			if (entry.getValue().contains(bilgi)) {

				System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
				flag = 1;
			}

		}
		if (flag == 0) {

			System.out.println("aradığınız kritere uygun kitap bulunamadı");
		}

		menu();

	}

	private static void kitapEkle() {
		// TODO Auto-generated method stub

	}

	private static void noIleGoruntule() {

		System.out.println("listelemek istediğiniz kitap numarasını girin");
		int kitapNo = scan.nextInt();

		System.out.println(kitap.get(kitapNo));

	}

	public static void topluKitapEkle() {
		kitap.put(9999, "ali can evde, ali han, 2001, 11");
		kitap.put(9998, "ali can yolda, ali han, 2005, 10");
		kitap.put(9997, "yanlizlik, Veli Kul, 2005, 21");
		kitap.put(9996, "Sen, Ayse Unal, 2005, 30");

	}

}
