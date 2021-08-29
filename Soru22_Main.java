package Practises;

import java.util.Scanner;

public class Soru22_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("isim girin");
		String name=scan.nextLine();
		
		System.out.println("yasinizi girin");
		int yas = scan.nextInt();
		
		Soru22 adam1 = new Soru22(); 
		
		adam1.setName(name);
		adam1.setAge(yas);
		
		System.out.println("isim: "+adam1.getName()+" yas: "+adam1.getAge());
		
		
scan.close();
	}

}
