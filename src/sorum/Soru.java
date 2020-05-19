package sorum;

import java.util.Scanner;

class hesap {
	double sayi1;
	double sayi2;
	private double toplam;
	private double c�kar;

	hesap(double a, double b) {
		this.sayi1 = a;
		this.sayi2 = b;
	}

	void topla() {
		toplam = sayi1 + sayi2;
		System.out.println("Toplam=" + toplam);
	}

	void cikar() {
		c�kar = sayi1 - sayi2;
		System.out.println("Farklar�= " + c�kar);
	}

}

class Hesapla extends hesap {

	Hesapla(double a, double b) {
		super(a, b);
	}

	private void KokAl() {
		double kok1 = Math.sqrt(sayi1);
		double kok2 = Math.sqrt(sayi2);
		System.out.println(sayi1 + "in k�k�: " + kok1);
		System.out.println(sayi2 + "nin k�k�: " + kok2);

	}

	void Goster() {
		KokAl();

	}
}

class KupAlma extends hesap {

	KupAlma(double a, double b) {
		super(a, b);

	}

	private void KupAl() {
		double kup1 = sayi1 * sayi1 * sayi1;
		double kup2 = sayi2 * sayi2 * sayi2;
		System.out.println(sayi1 + "in k�p�: " + kup1);
		System.out.println(sayi2 + "in k�p�: " + kup2);

	}

	void Goster() {
		KupAl();

	}
}

public class Soru {

	public static void main(String args[]) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		double a = klavye.nextDouble();
		System.out.println("Bir say� giriniz");
		double b = klavye.nextDouble();
		hesap nesne = new hesap(a, b);
		Hesapla nesne1 = new Hesapla(a, b);
		KupAlma nesne2 = new KupAlma(a, b);
		nesne.topla();
		nesne.cikar();
		nesne1.Goster();
		nesne2.Goster();

	}

}