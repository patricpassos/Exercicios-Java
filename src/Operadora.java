import java.util.Locale;
import java.util.Scanner;

public class Operadora {
	
	/**
	 * Calcula o total da fatura conforme o pacote de minutos
	 * @param minutos: minustos utilizado pelo usuário
	 */
	static void valorDaFatura (int minutos) {
		double precoPacote = 50.0;
		precoPacote = minutos > 100 ? (minutos - 100.0) * 2.0 + precoPacote : precoPacote;
		System.out.printf("Valor a pagar: R$ %.2f", precoPacote);
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		valorDaFatura(minutos);
		
		sc.close();

	}

}
