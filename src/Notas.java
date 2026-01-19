import java.util.Locale;
import java.util.Scanner;

public class Notas {

	/**
	 * Soma as notas do primeiro e segundo semestre
	 * 
	 * @param notaPrimeiroSemestre: nota referente do primeiro semestre
	 * @param notaSegundoSemestre:  nota referente ao segundo semetres
	 * @return: calcula a soma das notas do primeiro e segundo semestre
	 */
	static double notaFinal(double notaPrimeiroSemestre, double notaSegundoSemestre) {
		double somaNotas = notaPrimeiroSemestre + notaSegundoSemestre;
		return somaNotas;
	}

	/**
	 * Resulta na aprovação e reprovação (reprovado < 60.0)
	 * 
	 * @param notaPrimeiroSemestre: nota referente do primeiro semestre
	 * @param notaSegundoSemestre:  nota referente ao segundo semetres
	 */
	static void resultadoNotas(double notaPrimeiroSemestre, double notaSegundoSemestre) {
		double notasAnual = notaFinal(notaPrimeiroSemestre, notaSegundoSemestre);
		if (notasAnual < 60.0) {
			System.out.print("REPROVADO");
		} else {
			System.out.print("PROVADO");
		}
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notaPrimeiroSemestre, notaSegundoSemestre;
		char resp;

		do {
			System.out.print("Digite a primeira nota: ");
			notaPrimeiroSemestre = sc.nextDouble();
			System.out.print("Digite a segunda nota: ");
			notaSegundoSemestre = sc.nextDouble();

			double notaAnual = notaFinal(notaPrimeiroSemestre, notaSegundoSemestre);
			System.out.printf("NOTA FINAL = %.1f\n", notaAnual);

			resultadoNotas(notaPrimeiroSemestre, notaSegundoSemestre);

			System.out.print("\n\nDeseja continuar? (s/n): ");
			resp = sc.next().charAt(0);

			while (resp != 's') {
				if (resp == 'n') {
					break;
				} else {
					System.out.print("Digite (s) para continuar ou digite (n) para finalizar: ");
					resp = sc.next().charAt(0);
				}
			}
		} while (resp != 'n');

		sc.close();
	}

}
