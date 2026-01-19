import java.util.Locale;
import java.util.Scanner;

public class ConsumoDeCombustivel {
	
	/**
	 * 
	 * @param distancia: distância total percorrido pelo veículo (km)
	 * @param combustivel: total de combustível gasto pelo veículo
	 * @return: calcula o consumo médio de combustível durante uma viagem
	 */
	static double consumoMedio (double distancia, double combustivel) {
		double consumo = distancia / combustivel;
		return consumo;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double distancia, combustivel;
		char resp;

		do {
			System.out.print("Distânia percorrida: ");
			distancia = sc.nextDouble();
			System.out.print("Combustível gasto: ");
			combustivel = sc.nextDouble();
			
			double consumoDeCombustivel = consumoMedio(distancia, combustivel);
			System.out.printf("Consumo médio = %.3f", consumoDeCombustivel);
			
			System.out.print("\n\nDeseja continuar (s/n)?: ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}
