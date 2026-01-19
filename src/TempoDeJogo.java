import java.util.Scanner;

public class TempoDeJogo {

	/**
	 * Calcula a duração do jogo: duracao minima de uma hora e máxima de vinte e quatro horas
	 * @param inicial: hora inicial
	 * @param fim: hora final
	 */
	static void duracao(int inicial, int fim) {
		int tempoJogo;
		if (inicial >= fim) {
			tempoJogo = 24 - inicial + fim;
		} else {
			tempoJogo = fim - inicial;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)", tempoJogo);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();

		duracao(horaInicial, horaFinal);

		sc.close();

	}

}
