import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	static void novoSalario(double salarioAntigo) {
		double aumento, novoSalario, percentual;
		if (salarioAntigo <= 1000.0) {
			percentual = 20.0;
		} else if (salarioAntigo <= 3000.0) {
			percentual = 15.0;
		} else if (salarioAntigo <= 8000.0) {
			percentual = 10.0;
		} else {
			percentual = 5.0;
		}

		aumento = salarioAntigo * percentual / 100;
		novoSalario = salarioAntigo + aumento;

		System.out.printf("Nono salário: %.2f\n", novoSalario);
		System.out.printf("Aumento: %.2f\n", aumento);
		System.out.printf("Procentagem = %.0f %%", percentual);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario;

		System.out.print("Digite o salário da pessoa: ");
		salario = sc.nextDouble();

		novoSalario(salario);

		sc.close();

	}

}
