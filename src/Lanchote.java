import java.util.Locale;
import java.util.Scanner;

public class Lanchote {

	static void valorPagar(int codProduto, int quantidade) {
		double total;
		if (codProduto == 1) {
			total = 5.0 * quantidade;
		} else if (codProduto == 2) {
			total = 3.50 * quantidade;
		} else if (codProduto == 3) {
			total = 4.80 * quantidade;
		} else if (codProduto == 4) {
			total = 8.90 * quantidade;
		} else {
			total = 7.32 * quantidade;
		}

		System.out.printf("Valor a pagar: R$ %.2f\n\n", total);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoProduto, quantidade;

		System.out.print("Código do produto comprado: ");
		codigoProduto = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		valorPagar(codigoProduto, quantidade);

		sc.close();
	}

}
