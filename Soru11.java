package Practices;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		// kullanicidan kelime alip bosluk olup olmadigini kontrol edin

		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir kelime giriniz");
        
        String name1 = scanner.nextLine();
        
        if (name1.contains(" ")) {
            
            System.out.println("Bosluk vardir"); }
                
        else {
            
            System.out.println("Bosluk yoktur"); }
                
        scanner.close(); 

	}

}
