import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
	
	/**
	 * utiliza a formula area = pi * r^2
	 * @param raio: de um determinado circulo
	 * @return: calcula a área de um circulo
	 */
	static double areaCirculo(double raio) {
		double diametro = Math.pow(raio, 2.0);
		return Math.PI * diametro;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double circulo;
		
		System.out.print("Digite o valor do raio do circulo: ");
		circulo = sc.nextDouble();
		
		double areaDoCirculo = areaCirculo(circulo);
		System.out.printf("ÁREA = %.3f", areaDoCirculo);
		System.out.print("------------------------");
		
		sc.close();
	}

}
