import java.util.Scanner;

public class Calculadora {
	public static double valor1 = 0;
	public static double valor2 = 0;
	public static double divisao;
	public static double multiplicacao;

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double soma, subtracao, divisao, multiplicacao;
		int opcao = 0;
		Funcoes.mostrarMenu();
		while (opcao != 6) {

			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();

				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");

				break;
			case 2:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				Funcoes.somar(valor1, valor2);

				break;
			case 3:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();

				Funcoes.subtrair(valor1, valor2);
				break;
			case 4:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				Funcoes.dividir(valor1, valor2);
				break;
			case 5:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				Funcoes.multiplicar(valor1, valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}

		}
		leitor.close();

	}

}
