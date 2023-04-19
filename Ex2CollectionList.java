package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2CollectionList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		int num = leia.nextInt();

		if (lista.contains(num)) {
			System.out.println("O número " + num + " está localizado na posição: " + lista.indexOf(num));
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}

	}

}
