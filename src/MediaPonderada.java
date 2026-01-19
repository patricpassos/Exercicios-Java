import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
	
	static double mediaPonderada(double n1, double n2, double n3) {
		double ponderada = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		return ponderada;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		double n1, n2, n3;
		
		System.out.print("Quantos casos você vai digitar? ");
		entrada = sc.nextInt();
		
		for(int i = 0; i < entrada; i++) {
			System.out.println("Digite três numeros: ");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			double ponderada = mediaPonderada(n1, n2, n3);
			System.out.printf("MEDIA = %.1f\n", ponderada);
		}
		
		sc.close();
	}

}
