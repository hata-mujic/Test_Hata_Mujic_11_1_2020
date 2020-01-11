package zadaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Unesite niz brojeva(nula prekida unos): ");
		int unos = input.nextInt();

		while (unos != 0) {
			arrayList.add(unos);
			unos = input.nextInt();
		}

		System.out.print("Niz u obrnutom redosljedu: ");
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			System.out.print(arrayList.get(i) + " ");
		}
		input.close();
	}

}
