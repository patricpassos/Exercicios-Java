import java.util.Locale;
import java.util.Scanner;

public class AreaTerreno {
	
	/**
	 * 
	 * @param largura: largura do terreno em metros quadrado
	 * @param comprimento: comprimento do terreno em metros quadrados
	 * @return: calcula o metro quadrado do terrno
	 */
	static double areaTerreno(double largura, double comprimento) {
		double area = largura * comprimento;
		return area;
	}

	/**
	 * 
	 * @param largura: largura do terreno em metros quadrado
	 * @param comprimento: comprimento do terreno em metros quadrados
	 * @param precoTerreno: calcula o preço total do terreno
	 * @return
	 */
	static double precoTerrono(double largura, double comprimento, double precoTerreno) {
		double precoTotal = areaTerreno(largura, comprimento) * precoTerreno;
		return precoTotal;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, precoDoTerreno;

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		precoDoTerreno = sc.nextDouble();

		double areaTotal = areaTerreno(largura, comprimento);
		double precoTotal = precoTerrono(largura, comprimento, precoDoTerreno);

		System.out.printf("Área do terreno: %.2f\n", areaTotal);
		System.out.printf("Preco do terreno: %.2f\n", precoTotal);

		sc.close();
	}

}
