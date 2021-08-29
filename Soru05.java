package Practises;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan vize ve final notlarını alınız. Kullanıcın istediği oranlarda
		 * vize ve final yüzdeleri not ile not ortalamasını hesaplayıp not ortalamasını
		 * yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
		 * "Malesef dersten kaldınız..." yazdırınız
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("vize notunu girin");
		double v = scan.nextDouble();

		System.out.println("final notunu girin");
		double f = scan.nextDouble();

		System.out.println("vize oranini girin");
		double vo = scan.nextDouble();

		System.out.println("final oranini girin");
		double fo = scan.nextDouble();

		double ort = (v * vo) / 100 + (f * fo) / 100;

		if (ort > 100 || ort < 0) {
			System.out.println("gecerli not girin");
		} else if (ort >= 50) {
			System.out.println("gectiniz " + ort);
		} else {
			System.out.println("kaldiniz " + ort);
		}

		scan.close();
	}

}
