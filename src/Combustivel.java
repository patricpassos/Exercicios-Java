import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo;
		int contAlcool = 0;
		int contGasolina = 0;
		int contDiesel = 0;
		do {
			System.out.println("Informe o codigo");
			System.out.println("1 - ÁLCOOL");
			System.out.println("2 - GASOLINA");
			System.out.println("3 - DIESEL");
			System.out.println("4 - FINALIZAR");
			codigo = sc.nextInt();

			switch (codigo) {
			case 1:
				contAlcool++;
				break;
			case 2:
				contGasolina++;
				break;
			case 3:
				contDiesel++;
				break;
			case 4:
				System.out.println("\nMUITO OBRIGADO");
				System.out.println("Alcool: " + contAlcool);
				System.out.println("Gasolina: " + contGasolina);
				System.out.println("Diesel: " + contDiesel);
				break;
			default:
				System.out.println("\n** Codigo errado **\n");
			}

		} while (codigo != 4);

		sc.close();

	}

}
