package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1CollectionList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Entre com 5 cores!");

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "º cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores:");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}

		Collections.sort(cores);
		System.out.println("\nCores ordenadas em ordem crescente:");

		for (String i : cores) {
			System.out.println(i);

		}
	}

}
