package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4CollectionSet {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> lista = new HashSet<Integer>();

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
		int busca = leia.nextInt();

		if (lista.contains(busca)) {
			System.out.println("O número " + busca + " foi encontrado!");
		} else {
			System.out.println("O número " + busca + " não foi encontrado!");
		}

	}

}
