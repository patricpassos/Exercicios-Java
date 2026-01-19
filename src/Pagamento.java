import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	/**
	 * Programa que calcular o pagamento salarial de um determinado funcionario
	 * @param funcionario: nome do funcionario
	 * @param precoHora: valor da hora
	 * @param horasTrabalhadas: quantidade de horas tabalhadas
	 */
	static void pagamento(String funcionario, double precoHora, double horasTrabalhadas) {
		double totalPagar = precoHora * horasTrabalhadas;

		System.out.printf("O pagamento para %s deve ser %.2f", funcionario, totalPagar);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nomeFuncionario;
		double precoHora, horasTrabalhadas;
		char resp;

		do {
			System.out.print("Nome: ");
			nomeFuncionario = sc.nextLine();
			System.out.print("Valor da hora: ");
			precoHora = sc.nextDouble();
			System.out.print("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextDouble();

			pagamento(nomeFuncionario, precoHora, horasTrabalhadas);

			System.out.print("\n\nDeseja continuar? (s/n): ");
			resp = sc.next().charAt(0);
			sc.nextLine();
		} while (resp != 'n');

		System.out.print("\n** fim do programa **");

		sc.close();

	}

}
