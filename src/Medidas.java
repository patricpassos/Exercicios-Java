import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	/**
	 * Área do quadrado de lado A
	 * @param ladoA: lado do quadrado
	 * @return: calcula a area do quadrado de lado A
	 */
	static double areaQuadrado(double ladoA) {
		double calculoArea = ladoA * ladoA;
		return calculoArea;
	}
	
	/**
	 * Área de um triângulo retângulo
	 * @param baseA: do triângulo retângulo
	 * @param alturaB: do triângulo retângulo
	 * @return: calcula a área de um triângulo retângulo
	 */
	static double areaTriangulo(double baseA, double alturaB) {
		double calculoTriangulo = baseA * alturaB;
		return calculoTriangulo / 2;
	}

	/**
	 * Área do trapézio
	 * @param baseA: do trapézio
	 * @param baseB: do trapézio
	 * @param altura: do trapezio
	 * @return: calcula a área de um trapézio
	 */
	static double areaTrapezio(double baseA, double baseB, double altura) {
		double calculoTrapezio = (baseA + baseB) * altura;
		return calculoTrapezio / 2;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;

		System.out.print("Digite a medida de A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida de B: ");
		b = sc.nextDouble();
		System.out.print("Digite a medida de C: ");
		c = sc.nextDouble();

		System.out.printf("ÁREA DO QUADRADO: %.4f\n", areaQuadrado(a));
		System.out.printf("ÁREA DO QUADRADO: %.4f\n", areaTriangulo(a, b));
		System.out.printf("ÁREA DO TRAPÉZIO: %.4f\n", areaTrapezio(a, b, c));

		sc.close();

	}

}
