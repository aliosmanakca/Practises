package Practices;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		 *  formula
		    
		    c = (f-32)*5/9
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Fahrenheit degerini giriniz");
		double f=scan.nextDouble();
		double c=(f-32)*5/9;
		
		System.out.println("celcius degeri : "+c);
scan.close();
	}

}
