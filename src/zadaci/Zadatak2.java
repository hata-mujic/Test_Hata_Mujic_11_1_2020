package zadaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			arrayList.add((int) (Math.random() * 10));

		}

		System.out.println("Unesite broj: ");
		int unos = input.nextInt();

		boolean provjera = false;
		for (Integer e : arrayList) {
			if (unos == e) {
				provjera = true;
			}
		}

		if (provjera == true) {
			System.out.println("Pogodili ste broj iz moje tajne kolekcije!");
		} else {
			System.out.println("wah wah wah");
		}

		input.close();

	}

}
