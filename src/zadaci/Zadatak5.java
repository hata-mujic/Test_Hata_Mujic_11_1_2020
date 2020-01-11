package zadaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<String> newArrayList = new ArrayList<>();

		System.out.println("Unesite kolekciju stringova:");
		String unos = input.nextLine();

		String sumaString = "";

		for (int i = 0; i < unos.length(); i++) {

			if (unos.charAt(i) != ' ') {
				sumaString = sumaString + unos.charAt(i);

			}
			if (unos.charAt(i) == ' ' || unos.charAt(i) == '.') {
				arrayList.add(sumaString);
				sumaString = " ";
			}
		}

		for (String e : arrayList) {
			System.out.print(e + " ");
		}

		for (int i = 0; i < arrayList.size(); i++) {
			String rijecString = arrayList.get(i);

			if (rijecString.length() % 2 != 0) {
				newArrayList.add(rijecString);
			}
		}

		System.out.println("Kolekcija stringova sa neparnim brojevima.");

		for (String e : newArrayList) {
			System.out.print(e + " ");
		}

		input.close();
	}

}
