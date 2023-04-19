package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3CollectionSet {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("\nEntre com um número e não o repita: ");
			int num = leia.nextInt();
			numeros.add(num);
		}

		Iterator<Integer> lista = numeros.iterator();

		System.out.println("\nListar dados do Set:");

		while (lista.hasNext()) {
			System.out.println(lista.next());
		}
	}

}
