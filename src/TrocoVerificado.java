import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
	
	/**
	 * Total das compras realizadas
	 * @param precoProduto: preço do produto 
	 * @param quantidade: quantidade de produtos comprados
	 * @return: calcula o total do produto
	 */
	static double totalCompra(double precoProduto, double quantidade) {
		double total = precoProduto * quantidade;
		return total;
	}
	
	/**
	 * Verificação do troco
	 * @param precoProduto: preço do produto
	 * @param quantidade: quantidade de produtos comprados
	 * @param dinheiroRecebido: dinheiro recebido pelo cliente
	 */
	static void troco(double precoProduto, double quantidade, double dinheiroRecebido) {
		double totalGeral = totalCompra(precoProduto, quantidade);
		if (dinheiroRecebido >= totalGeral) {
			double troco = dinheiroRecebido - totalGeral;
			System.out.printf("TROCO = R$ %.2f\n", troco);
		} else {
			double teste = totalGeral - dinheiroRecebido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f REAIS", teste);
		}
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoProduto, dinheiroRecebido;
		int quantidadeComprada;

		System.out.print("Preço unitário do produto: ");
		precoProduto = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidadeComprada = sc.nextInt();

		double totalGeral = totalCompra(precoProduto, quantidadeComprada);
		System.out.printf("TOTAL GERAL: R$ %.2f\n", totalGeral);

		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();

		troco(precoProduto, quantidadeComprada, dinheiroRecebido);

		sc.close();

	}

}
