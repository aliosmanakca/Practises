package Practices;

public class Soru26 {
	
	/*
	 
	ad(String),telefon(String),no(int) bilgisi olacak
	hepsi private olcak
	farklı bir classta, 
	klavyeden girilen 10 adedt öğrenciye ait bilgiyi ekranda görüntüleyeceğiz
	
	
	
	
	*/
	
	private String ad;
	private String tel;
	private int no;
	public Soru26(String ad, String tel, int no) {
		super();
		this.ad = ad;
		this.tel = tel;
		this.no = no;
	}
	public Soru26() { 
		
		
		
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", tel=" + tel + ", no=" + no + "]";
	}

}
