package zadaci;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Unesite niz brojeva(nula prekida unos): ");
		int unos = input.nextInt();

		while (unos != 0) {
			arrayList.add(unos);
			unos = input.nextInt();
		}

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(arrayList);
		System.out.print("Unikatni brojevi u datom nizu: ");
		for (Integer e : linkedHashSet) {
			System.out.print(e + ", ");
		}

		input.close();

	}

}
