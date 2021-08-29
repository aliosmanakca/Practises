package Practises;

import java.util.Scanner;

public class Soru18 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        
        
        Scanner scan = new Scanner (System.in);
        int [] arr = new int [8];
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.println(i+". indexdeki sayiyi girin");
			 arr[i]=scan.nextInt();
		}
        int count=0;
        for (int i = 0; i < arr.length; i++) {//arr in elemanlrın ulsılıyor
            if (arr[i]%3==0) {
                count++;
                
            }
            
        }
        System.out.println("arraydeki 3 e tam bolunen eleman sayisi : "+count);
scan.close();
	}

}
