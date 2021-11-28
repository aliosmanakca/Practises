package Practices;

public class Soru21 {
	
	 String name;
	 String adres;

	public Soru21(String name, String adres) { 
		super();
		this.name = name;
		this.adres = adres;
	}

	public static void main(String[] args) {
		
		Soru21 ogrenci = new Soru21("ali","ankara");
		
		ogrenci.yeni(); 
		

	} 

	private  void yeni() {
		System.out.println(name+" "+adres);
		
	}
	
	

}
