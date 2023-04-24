package Collections;

import java.util.Scanner;
import java.util.Stack;

public class Ex6CollectionStack {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		int num;

		String livro;

		do {
			System.out.println("\n*************************************");
			System.out.println("1- Adicionar um novo livro na pilha");
			System.out.println("2- Listar todos os livros");
			System.out.println("3- Retirar livro da pilha");
			System.out.println("0- Sair");
			System.out.println("*************************************");
			System.out.println("\nEntre com a opção desejada: ");
			num = leia.nextInt();
			leia.nextLine();

			switch (num) {
			case 1:
				System.out.println("\nAdicionar Livro na Pilha: ");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("\nPilha:");
				System.out.println("\n" + pilha);
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: " + pilha);
				break;
			case 3:
				if (0 == pilha.size()) {
					System.out.println("A Pilha Está Vazia!");
				} else {
					pilha.pop();
					System.out.println("Pilha:");
					System.out.println("\n" + pilha);
					System.out.println("\nUm Livro Foi Retirado da Pilha!");
				}
				break;
			case 0:
				System.out.println("\nObrigado por utilizar nosso programa!");
				break;
			default:
				System.out.println("\nOpção inválida!");

			}

		} while (num != 0);

	}

}
