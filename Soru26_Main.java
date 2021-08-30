package Practises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru26_Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Soru26 obj1=new Soru26();
		
		List<String> bilgiler=new ArrayList();
		
		for(int i=0; i<3; i++)
		{
			System.out.println("isim giriniz");
			String isim=scan.nextLine();
			 
			System.out.println("telefon girin");
			String telefon=scan.next();
			
			System.out.println("numara girin");
			int numara=scan.nextInt();
			scan.nextLine();// bunu yapmazsak otomatik olarak bir satir atliyor
			
			obj1.setAd(isim);
			obj1.setNo(numara);
			obj1.setTel(telefon);
			
			//Ogrenci obj2=new Ogrenci(isim,telefon,numara);
			
			String eklenecek=obj1.getAd()+" "+obj1.getNo()+" "+obj1.getTel();
			
			bilgiler.add(eklenecek);
			
		}
		
		System.out.println(bilgiler);
scan.close();
	}

}
