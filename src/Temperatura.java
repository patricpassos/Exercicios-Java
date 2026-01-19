import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	static double conversaoCelsius(double fahrenheit) {
		double celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
		return celsius;
	}

	static double conversaoFahrenheit(double celsius) {
		double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
		return fahrenheit;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char temperatura;
		double fahrenheit, celsius;

		do {
			System.out.print("Você vai digitar a temperartura em qual escala (C/F/N(FINALIZAR))? ");
			temperatura = sc.next().charAt(0);

			if (temperatura == 'F') {
				System.out.print("Digite a temperatura em Fahrenheit: ");
				fahrenheit = sc.nextDouble();
				System.out.printf("Temperatura equivalente em Celsius: %.2f\n", conversaoCelsius(fahrenheit));
			} else if (temperatura == 'C') {
				System.out.print("Digite a temperatura em Celsius: ");
				celsius = sc.nextDouble();
				System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", conversaoFahrenheit(celsius));
			}

		} while (temperatura != 'N');

		sc.close();

	}

}
