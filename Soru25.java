package Practises;

public class Soru25 {
	
	private String ad="ahmet";
	@Override
	public String toString() {
		return "Soru25 [ad=" + ad + ", yas=" + yas + ", adres=" + adres + "]"; 
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	private int yas=40;
	String adres="ankara";

	public Soru25() {
		
	}

	public Soru25(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}

	public String getAd() {
		return ad;
	}

	public int getYas() {
		return yas;
	}


	

}
