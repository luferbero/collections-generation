package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex5CollectionQueue {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int num;
		String nome;

		do {
			System.out.println("\n*****************************");
			System.out.println("1- Adicionar Cliente na fila");
			System.out.println("2- Listar todos os clientes");
			System.out.println("3- Retirar cliente da fila");
			System.out.println("0- Sair");
			System.out.println("*****************************");
			System.out.println("\nEntre com a opção desejada: ");
			num = leia.nextInt();
			leia.nextLine();

			switch (num) {
			case 1:
				System.out.println("\nDigite nome do cliente: ");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila: ");
				System.out.println("\n" + fila);
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila: " + fila);
				break;
			case 3:
				if (0 == fila.size()) {
					System.out.println("A Fila está vazia!");
				} else {
					fila.remove();
					System.out.println("\nLista de Clientes na Fila: " + fila);
					System.out.println("\nO Cliente foi chamado!");
				}
				break;
			case 0:
				System.out.println("\nObrigado por utlizar nosso programa");
				break;
			default:
				System.out.println("Opção inválida!");

			}

		} while (num != 0);

	}

}
