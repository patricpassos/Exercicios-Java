import java.util.Locale;
import java.util.Scanner;

public class Troco {

	/**
	 * Retorno o troco coforme pagamento (suponha que haja dinheiro suficiente)
	 * @param precoUnitario:    preco do item
	 * @param quantidade:       quantidade de item do mesmo produto
	 * @param dinheiroRecebido: recebivel para pagamento da compra
	 */
	static void troco(double precoUnitario, double quantidade, double dinheiroRecebido) {
		double totalPagar = precoUnitario * quantidade;
		double troco = dinheiroRecebido - totalPagar;
		if (dinheiroRecebido == totalPagar) {
			System.out.print("Volte Sempre!");
		} else {
			System.out.printf("TROCO = %.2f", troco);
		}
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco, dinheiroRecebido;
		int quantidade;
		char resp = 'a';

		while (resp != 'n') {
			System.out.print("Preço unitário do produto: ");
			preco = sc.nextDouble();
			System.out.print("Quantidade comprada: ");
			quantidade = sc.nextInt();
			System.out.print("Dinheiro recebido: ");
			dinheiroRecebido = sc.nextDouble();

			troco(preco, quantidade, dinheiroRecebido);

			System.out.print("\n\nDeseja passar mais produtos (s/n): ");
			resp = sc.next().charAt(0);

		}

		sc.close();

	}

}
