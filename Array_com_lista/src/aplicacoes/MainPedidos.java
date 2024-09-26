package aplicacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPedidos {
	private static ArrayList<Pedido> pedidos = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;

		while (opcao != 5) {
			System.out.println("\nSistema de Gestão de Pedidos");
			System.out.println("1. Adicionar Pedido");
			System.out.println("2. Remover Pedido");
			System.out.println("3. Exibir Pedidos");
			System.out.println("4. Calcular Total de Itens");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha após o número

			if (opcao == 1) {
				adicionarPedido();
			} else if (opcao == 2) {
				removerPedido();
			} else if (opcao == 3) {
				exibirPedidos();
			} else if (opcao == 4) {
				calcularTotalItens();
			} else if (opcao == 5) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}
		}
	}

	public static void adicionarPedido() {
		System.out.print("Nome do prato: ");
		String nomePrato = scanner.nextLine();
		System.out.print("Quantidade: ");
		int quantidade = scanner.nextInt();
		scanner.nextLine();

		pedidos.add(new Pedido(nomePrato, quantidade));
		System.out.println("Pedido adicionado com sucesso!");
	}

	// Método para remover um pedido da lista
	public static void removerPedido() {
		System.out.print("Nome do prato a ser removido: ");
		String nomePrato = scanner.nextLine();

		boolean removido = false;
		for (int i = 0; i < pedidos.size(); i++) {
			if (pedidos.get(i).getNomePrato().equalsIgnoreCase(nomePrato)) {
				pedidos.remove(i);
				System.out.println("Pedido removido com sucesso!");
				removido = true;
				break;
			}
		}
		if (!removido) {
			System.out.println("Pedido não encontrado.");
		}
	}

	private static void exibirPedidos() {
		if (pedidos.isEmpty()) {
			System.out.println("Nenhum pedido adicionado.");
		} else {
			System.out.println("\nPedidos da mesa:");
			for (Pedido pedido : pedidos) {
				System.out.println(pedido);
			}
		}
	}

	private static void calcularTotalItens() {
		int total = 0;
		for (Pedido pedido : pedidos) {
			total += pedido.getQuantidade();
		}
		System.out.println("Total de itens pedidos: " + total);
	}
}
