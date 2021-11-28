package Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Basrili Market alış-veriş programı.
*
* 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
*          No     Ürün         Fiyat
          ====  =======        =========
           00   Domates         2.10 TL
           01   Patates         3.20 TL
           02   Biber           1.50 TL
           03   Soğan          2.30 TL
           04   Havuç              3.10 TL
           05   Elma            1.20 TL
           06   Muz             1.90 TL
           07   Çilek              6.10 TL
           08   Kavun           4.30 TL
           09   Üzüm              2.70 TL
           10   Limon           0.50 TL
* 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
* 3. Adım: Kaç kg satın almak istediğini sorunuz.
* 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
* 5. Başka bir ürün alıp almak istemediğini sorunuz.
* 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
* 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödem sonrasında programı bitirinzi.
*/

public class Soru20_BasariliMarket {
	
	/* 1: Urunler (String) ve fiyatlari (double) iceren ayri ayri list olusturulmali.
       listler class levelda olmali cunku main method harici methodlarda kullanilacak.
       Listelenen urunler bir method() ile kullaniciya gosterilmeli.Yani sadece yazdiran bir method.
       bu method sadece print yapacagi icin return type void
       method==> public static void urunListele() {for, println(i+urun+fiyat)}
       
       2: scanner classindan obje olusturulmali. urunListele() method u cagrilarak kullanici
       ekranina urun listesi gosterilmeli. kullanicidan urun kodu ve urun miktari istenmeli
       int urunNo = kullanicinin girdigi urun kodu atanmali
       
       3: double kg = kullanicinin girdigi urun miktari atanmali
          
       4: alisveris sepeti olusturulmali==> sepetUrunler List(String) , sepetKg List(double) ,
       sepetFiyat List(double)
       public static void sepeteEkle(int urunKodu, double kg) {sepetFiyat=urunFiyat*kg__list(double)  
       her sepet alisverisinden sonra olusan sepet fiyatini toplayan bir double toplamFiyat olusturulmali.
       toplamFiyat+=sepetFiyati
       
       sepetin son durumu yazdirilmali ki kullaniciya devam edip etmeyecegini sorabilelim.
       public static double(toplamFiyat) sepetYazdir(){println(urunler+fiyat+kg)}
       
       5: devam edip etmeyecegi sorulmali. cevap boolean(true/false)
       
       6:cevap evet is do while, yoksa odeme kismina gecilmeli 
       
       7: public static void odeme(println(double toplamFiyat){printLn}
       	
     */
	
	static List<String> urunler = new ArrayList<>(); 
	static List<Double> fiyatlar = new ArrayList<>();
	static double toplamFiyat=0;
	static Scanner scan = new Scanner (System.in);
	

   public static void main(String[] args) {
	   
	   urunler.add("domates");
	   urunler.add("patates");
	   urunler.add("biber");
	   urunler.add("sogan");
	   urunler.add("havuc");
	   urunler.add("elma");
	   urunler.add("muz");
	   urunler.add("cilek");
	   urunler.add("kavun");
	   urunler.add("uzum");
	   urunler.add("limon");
	   
	   fiyatlar.add(2.10);
	   fiyatlar.add(3.20);
	   fiyatlar.add(1.5);
	   fiyatlar.add(2.30);
	   fiyatlar.add(3.10);
	   fiyatlar.add(1.20);
	   fiyatlar.add(1.90);
	   fiyatlar.add(6.10);
	   fiyatlar.add(4.30);
	   fiyatlar.add(2.70);
	   fiyatlar.add(0.50);
	   
	   List<String> sepetUrunler = new ArrayList<>();
	   List<Double> sepetKg = new ArrayList<>();
	   List<Double> sepetFiyat = new ArrayList<>();
	   
	   do {
	   urunListele();
	   
	   System.out.println("almak istediginiz urunun numarasini girin");
	   int urunNo = scan.nextInt();
	   System.out.println("kac kg aliyorsunuz");
	   double kg = scan.nextDouble();
	   double ucret = kg*fiyatlar.get(urunNo);
	   
	   sepetUrunler.add(urunler.get(urunNo));
	   
	   sepetKg.add(kg);
	   
	   sepetFiyat.add(ucret);
	   
	   for (int i = 0; i < sepetUrunler.size(); i++) {
		System.out.print(sepetKg.get(i)+" kg "+sepetUrunler.get(i)+" ---> "+sepetFiyat.get(i)+" tl");
		System.out.println("");
	     }
	   
	   toplamFiyat+=ucret;
	   
	   System.out.println("toplam fiyat: "+toplamFiyat+" tl");
	   
	} while (devamMi()==true);
	   
	   System.out.println("odenecek tutar: "+ toplamFiyat);
	   
   }



public static boolean devamMi() {
	
	System.out.println("alisverise devam etmek icin true yazin\nodemeye gecmek icin false yazin");
	boolean cevap = scan.nextBoolean();
	return cevap; 
}


public static void urunListele() {
	
	for (int i = 0; i < 11; i++) {
		
		System.out.println("urun no: "+i+" ---> urun: "+urunler.get(i)+" ---> fiyat: "+fiyatlar.get(i)+" tl");
	}
}
   
}