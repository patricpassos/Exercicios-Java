import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
	
	/**
	 * 
	 * @param base do retangulo
	 * @param altura do retangulo
	 * @return: calcula a area do retangulo
	 */
	static double areaRetangulo(double base, double altura) {
		double area = base * altura;
		return area;
	}
	
	/**
	 * 
	 * @param base do retangulo
	 * @param altura do retangulo
	 * @return: calcula o perimetro do retangulo
	 */
	static double perimetroRetangulo(double base, double altura) {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	/**
	 * 
	 * @param base do retangulo
	 * @param altura do retangulo
	 * @return calcula a diagonal do retangulo
	 */
	static double diagonalRetangulo(double base, double altura) {
		double diagonal = Math.pow(base, 2) + Math.pow(altura, 2);
		return Math.sqrt(diagonal);
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura;
		char resp;
		do {
			System.out.print("Base do retangulo: ");
			base = sc.nextDouble();
			System.out.print("Altura do retangulo: ");
			altura = sc.nextDouble();
			
			double area = areaRetangulo(base, altura);
			double perimetro = perimetroRetangulo(base, altura);
			double diagonal = diagonalRetangulo(base, altura);
			
			System.out.printf("ÁREA = %.4f\n", area);
			System.out.printf("PERIMETRO = %.4f\n", perimetro);
			System.out.printf("DIAGONAL = %.4f\n", diagonal);
			
			System.out.println("\nDeseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();

	}

}
