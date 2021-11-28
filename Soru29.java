package Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru29 {

	public static void main(String[] args) {
		
		List<String> list2=new ArrayList<>();
        list2.add("ALI");
        list2.add("veli");
        list2.add("Ayse");
        list2.add("fatma");
        System.out.println(list2);
        
        //for each kullanarak listedeki tum elemanların isimlerini buyuk harf yapalım ve ekranda
        //yazdıralım
        
        for (String w : list2) {
                        
            System.out.println(w.toUpperCase());
        }
        
        System.out.println(list2);
        
        System.out.println("--------------------------------");
        
        for (int i=0; i<list2.size(); i++) {
        	
        	list2.set(i, list2.get(i).toUpperCase());
        }
        
        System.out.println(list2);
        
        System.out.println("------------------------------------");
        
        ListIterator <String> itr=list2.listIterator();
        
        while (itr.hasNext()) {
        	
        String gecici=itr.next();	
        itr.set(gecici.toLowerCase());
        	
        }
        System.out.println(list2);
        

	}

}
