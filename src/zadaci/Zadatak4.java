package zadaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> uklanjanjeElementa = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			arrayList.add((int) (Math.random() * 100));
		}

		System.out.print("Generisana kolekcija: ");
		for (Integer e : arrayList) {
			System.out.print(e + " ");
		}
		System.out.println();

		System.out.println("Koliko elemenata zelite ukloniti iz kolekcije: ");
		int brisanjeIzKolekcije = input.nextInt();

		System.out.println("Sa kojih indeksa zelite ukloniti elemente: ");
		int indexi;

		for (int i = 0; i < brisanjeIzKolekcije; i++) {
			indexi = input.nextInt();
			uklanjanjeElementa.add(indexi);

		}
		for (int j = 0; j < uklanjanjeElementa.size(); j++) {
			for (int i = 0; i < arrayList.size(); i++) {

				if (uklanjanjeElementa.get(j) == i) {
					arrayList.remove(j);
				}
			}
		}

		System.out.print("Nova klekcija: ");
		for (Integer e : arrayList) {
			System.out.print(e + " ");
		}
		input.close();
	}

}
