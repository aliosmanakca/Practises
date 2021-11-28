package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru24_Main {
	/*
	 * 1- 10 tane kutu olsun ve farkli miktarlarda para icersinler
	 * 
	 * 2- kutu adindaki classda kutunumarasi ve paramiktari adinda iki int tipinde
	 * variable olsun
	 * 
	 * 3-kutular ismindeki classda kullanacagimiz methodlar olsun
	 * 
	 * 4- kullanicidan secmek istedigi kutu numarasini aldiktan sonra onu var olan
	 * kutularin arasindan kaldirmamiz gerek
	 * 
	 * public void kutuEkle(Soru24_Kutu kutu) public void kutuActir(int
	 * kutuNumarasi) public int kalanKutuSayisi() public int
	 * kutulardakiToplamParaMiktari() public void secilenKutuyuKaldir() public int
	 * yapimcininTeklifiniAl() public String acilmamisKutulariGoster() public void
	 * kaybedilenTutarlar()
	 * 
	 * 5-
	 * 
	 */
	static Scanner scan = new Scanner(System.in);
	@SuppressWarnings({ "unchecked", "rawtypes" })
	static List<Integer> paraListesi = new ArrayList();
	static Soru24_Kutular kutular = new Soru24_Kutular();
	static int kutuNumaram;
	static int paraMiktarim;

	public static void main(String[] args) {

		paraListesi.addAll(Arrays.asList(1, 10, 500, 1000, 5000, 10000, 50000, 100000, 250000, 500000));
		Collections.shuffle(paraListesi); // code her run edildiginde listedeki elemanlarin yerini rastgele degistirir

		for (int i = 0; i < paraListesi.size(); i++) {
			int kutuNo = i + 1;
			Soru24_Kutu kutu = new Soru24_Kutu(kutuNo, paraListesi.get(i));
			kutular.kutuEkle(kutu);

		}

		System.out.println("oyunumuza hosgeldiniz\nLutfen bir kutu secin");
		kutuNumaram = scan.nextInt();
		paraMiktarim = paraListesi.get(kutuNumaram - 1);

		kutular.secilenKutuyuKaldir(kutuNumaram);
		kutuSecmeActirma();

	}

	static public void kutuSecmeActirma() {
		System.out.println("kalan kutular : " + kutular.acilmamisKutulariGoster());
		System.out.println("hangi kutuyu acmak istersiniz");
		int secim = scan.nextInt();
		kutular.kutuActir(secim);

		if (kutular.kalanKutuSayisi() == 7 || kutular.kalanKutuSayisi() == 4 || kutular.kalanKutuSayisi() == 1) {
			System.out.println("Teklifimiz : " + kutular.yapimcininTeklifiniAl(paraMiktarim));
			System.out.println("teklifi kabul ediyormusunuz (1-evet 2-hayir)");
			int yanit = scan.nextInt();
			if (yanit == 1) {
				System.out.println("oyun bitti");
				System.out.println("kazanilan miktar : " + kutular.yapimcininTeklifiniAl(paraMiktarim));
				System.out.println("kendi kutunuzdakimiktar : " + paraMiktarim);
			} else {
				kutuSecmeActirma();
			}

		} else {
			if (kutular.kalanKutuSayisi() > 0) {
				kutuSecmeActirma();
			} else {
				System.out.println("oyun bitti");
				System.out.println("kutunuzdaki miktar : " + paraMiktarim);
			}

		}

	}
}
