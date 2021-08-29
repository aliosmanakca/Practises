package Practises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
     * Bir kitapci icin program yapalim
	 * Kitap no 1000'den baslayarak sirali no olsun
	 * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
	 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun
	 * 1- kitap ekle
	 * 2- numara ile kitap goruntule
	 * 3- bilgi ile kitap goruntule
	 * 4- numara ile kitap sil
	 * 5- Tum kitaplari listele
	 * 6- çıkış
 */

public class Soru23 {

	static Scanner scan = new Scanner(System.in);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	List<Integer> kitapNo = new ArrayList();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	List<String> kitapAdi = new ArrayList();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	List<String> yazarAdi = new ArrayList();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	List<Double> kitapFiyati = new ArrayList();

	int count = 1000;
	String cevap = "";

	public void kitapEkle() {
		System.out.println("kitap adini girin");
		String kitap = scan.nextLine();

		System.out.println("yazar adini girin");
		String yazar = scan.nextLine();

		System.out.println("kitap fiyatini girin");
		double fiyat = scan.nextDouble();

		System.out.println("kitap no: " + count + " kitap adi: " + kitap + "\n" + "yazar adi: " + yazar
				+ " kitap fiyati: " + fiyat);

		kitapAdi.add(kitap);
		yazarAdi.add(yazar);
		kitapFiyati.add(fiyat);
		kitapNo.add(count++);

		System.out.println("basariyla kaydettiniz");
		System.out.println("baska kitap eklemek istermisiniz (e/h)");
		cevap = scan.next().toLowerCase();

		if (cevap.equals("e")) {

			do {
				System.out.println("kitap adini girin");
				scan.nextLine(); // birincisinden farkli olan kisim
				kitap = scan.nextLine();

				System.out.println("yazar adini girin");
				yazar = scan.nextLine();

				System.out.println("kitap fiyatini girin");
				fiyat = scan.nextDouble();

				System.out.println("kitap no: " + count + " kitap adi: " + kitap + "\n" + "yazar adi: " + yazar
						+ " kitap fiyati: " + fiyat);

				kitapAdi.add(kitap);
				yazarAdi.add(yazar);
				kitapFiyati.add(fiyat);
				kitapNo.add(count++);

				System.out.println("basariyla kaydettiniz");
				System.out.println("baska kitap eklemek istermisiniz (e/h)");
				cevap = scan.next().toLowerCase();
			} while (cevap.equals("e"));
		}

	}
	
	public void noIleGoruntule() {
		do {
		System.out.println("goruntulemek istediginiz kitabin numarasini girin");
		int numara =scan.nextInt();
		for (int i = 0; i < kitapNo.size(); i++) {
			if (numara==kitapNo.get(i)) {
				System.out.println(kitapAdi.get(i)+" "+yazarAdi.get(i)+" "+kitapFiyati.get(i)); 
			} 
		}
		System.out.println("goruntulemeye devam etmek istiyormusunuz (e/h)");
		cevap = scan.next();
		} while(cevap.equals("e"));
	}
	
	public void bilgiIleGoruntule() {
		do {
		System.out.println("hangi kelimeyi iceren kayitlari gormek istiyorsunuz");
		scan.nextLine();
		String ifade = scan.nextLine();
		for (int i = 0; i < kitapNo.size(); i++) {
			if(kitapAdi.get(i).contains(ifade) || yazarAdi.get(i).contains(ifade)) {
				System.out.println(kitapNo.get(i)+" "+kitapAdi.get(i)+" "+yazarAdi.get(i)+" "+kitapFiyati.get(i));
			}else {
				System.out.println("arama kriterlerine uygun kelime yoktur");
			}
		}
		System.out.println("goruntulemeye devam etmek istiyormusunuz (e/h)");
		cevap = scan.next();
	} while (cevap.equals("e"));
		
	}
	
	public void silme() {
		do {
		System.out.println("silmek istediginiz kayit no girin");
		int kayit = scan.nextInt();
		for (int i = 0; i < kitapNo.size(); i++) {
			if(kayit==kitapNo.get(i)) {
				kitapNo.remove(i);
				kitapAdi.remove(i);
				yazarAdi.remove(i);
				kitapFiyati.remove(i);
			}
		}
		System.out.println("kaydiniz silinmistir");
		System.out.println("baska silmek istermisiniz (e/h)");
		cevap = scan.next();
	} while (cevap.equals("e"));
		
	}

	
	
}
