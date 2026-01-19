import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	/**
	 * Classifica o nivel de glicose no sangue
	 * @param g: glicose em mg/dl
	 */
	static void classificacaoGlicose(double g) {
		if (g <= 100) {
			System.out.println("Classificação: Normal");
		} else if (g <= 140) {
			System.out.println("Classificação: Elevado");
		} else {
			System.out.println("Classificação: Diabetes");
		}

	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double glicose;
		char resp;
		
		do {
			System.out.print("Digite a medida da glicose: ");
			glicose = sc.nextDouble();
			
			classificacaoGlicose(glicose);
			
			System.out.print("\nDeseja continuar? (s/n): ");
			resp = sc.next().charAt(0);
			
			while (resp != 's') {
				if (resp == 'n') {
					break;
				} else {
					System.out.print("Digite (s) para continuar ou digite (n) para finalizar: ");
					resp = sc.next().charAt(0);
				}
			}
		} while(resp != 'n');
		
		sc.close();

	}

}
