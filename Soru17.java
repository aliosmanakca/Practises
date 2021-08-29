package Practises;

import java.util.Arrays;

public class Soru17 {

	public static void main(String[] args) {
		/*
         * write a method that accepts a 2 dimensional array and finds the max value (2
         * boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,3},{41,5},{6,7,8}} Output : 41
         */
        int arr[][] = { { 1, 2, -3 }, { 41, 5 }, { 6, 7, 18 } };
        int uzunluk = 0;
        
        for (int i = 0; i < arr.length; i++) {
            uzunluk += arr[i].length;
            
        }
        int yeniARR[] = new int[uzunluk];
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                yeniARR[sayac] = arr[i][j];
                sayac++;
            }
        }
        Arrays.sort(yeniARR);
        System.out.println("arrayin max elemani : "+yeniARR[yeniARR.length-1]);

	}

}
