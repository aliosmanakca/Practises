package Practices;

import java.util.ArrayList;
import java.util.List;

public class Soru24_Kutular {
	
	List<Soru24_Kutu> kutuListesi = new ArrayList<>(); // data type i class ismi 
    // datatype class ismi yaptik cunku o classdan olusturdugumuz nesneye 2 bilgi atadik
	
	
	public void kutuEkle(Soru24_Kutu kutu) {
		kutuListesi.add(kutu); 
	}
	
	
	
	public void kutuActir(int kutuNumarasi) {
		for (Soru24_Kutu each : kutuListesi) {
			 if(kutuNumarasi==each.getKutuNumarasi()) {
				 System.out.println("kutudaki miktar = "+ each.getParaMiktari());
				 kutuListesi.remove(each);
				 break; 
			 }
		} 
	}
	
	
	public int kalanKutuSayisi() {
		return kutuListesi.size();
	}
	
	
	public int kutulardakiToplamParaMiktari() {
		int toplamPara=0;
		for (Soru24_Kutu each : kutuListesi) {
			toplamPara+=each.getParaMiktari();
		}
		return toplamPara; 
	}
	
	
	public void secilenKutuyuKaldir(int kutuNumarasi) {
		for (Soru24_Kutu each : kutuListesi) {
			if (kutuNumarasi==each.getKutuNumarasi()) {
				kutuListesi.remove(each);
				break; 
			} 
		}
		
	}
	
	
	public int yapimcininTeklifiniAl(int oyuncununKendiKutusundakiMiktar) {
		int teklif = (kutulardakiToplamParaMiktari()+oyuncununKendiKutusundakiMiktar)/2;
				return teklif;
	}
	
	
	public String acilmamisKutulariGoster() {
		String acilmamisKutular="";
		for (Soru24_Kutu w : kutuListesi) {
			acilmamisKutular=acilmamisKutular+" "+w.getKutuNumarasi();
		}
		return acilmamisKutular; 
		
	}
	
}
