package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru19_ParseInt { 

	public static void main(String[] args) {
		/*   $ ve  �  isareti olanlarin toplamlarini ayri ayri bulun
        String str = "$1 $23 $134 $2 $7 $24 �32 �40 �2 �65 �4 ";
        */
		String str = "$1 $23 $134 $2 $7 $24 �32 �40 �2 �65 �4";
		String arr[] = str.split(" "); 
		System.out.println(Arrays.toString(arr));
		
		List<String> dolar = new ArrayList<>(); // dolar icin
		List<String> euro = new ArrayList<>(); // euro icin
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("$")) {
				
				dolar.add(arr[i].replace("$", ""));  
				
			} else {
				euro.add(arr[i].replace("�", ""));
			} 
			
		}
		int dolartoplam=0;
		int eurotoplam=0;
		
		for (int i = 0; i < dolar.size(); i++) {
			dolartoplam += Integer.parseInt((dolar).get(i));  //string olan sayiyi integer a ceviriyor
		}
		
		for (int i = 0; i < euro.size(); i++) {
			eurotoplam += Integer.parseInt(euro.get(i)); 
		}
		
        System.out.println("dolar toplami "+dolartoplam); 
		System.out.println("euro toplami "+eurotoplam); 
	}

}
