package pi;

import java.util.Scanner;
import java.util.ArrayList;

public class cyberNoir {

	static Boolean quit = false;

	static Scanner input = new Scanner(System.in);

	static int main() {

		int opcao = 0;

		do {
			System.out.println("-- Menu -- ");
			System.out.println("1 - Jogar");
			System.out.println("2 - Créditos");
			System.out.println("3 - Sair");
			System.out.println("");
			opcao = input.nextInt();
		} while (opcao < 1 || opcao > 4);

		return opcao;

	}

	static String insertionName() {

		String name;

		System.out.println("\nBem vindo Jogador");
		System.out.print("Informe seu nome á nos: ");
		name = input.next();
		System.out.println("");

		return name;
	}

	static void credits() {

		System.out.println("");
		System.out.println("Créditos a Grupo 10 - Xiaomeiros");
		System.out.println("\n Vitor Akira\n João Maziteli\n Tainara Almeida\n Matheus Alencar\n Yvens Borges\n");
		System.out.println("Developed in Java ");
		System.out.println("");
	}

	static int cidades() {

		int opcaoC;

		do {
			System.out.println("-- Menu -- ");
			System.out.println("1 - Grajau");
			System.out.println("2 - Taboão da Serra");
			System.out.println("");
			opcaoC = input.nextInt();
		} while (opcaoC < 1 || opcaoC > 3);

		return opcaoC;
	}

	static int grajau() {

		int opcaoG;

		do {
			System.out.println("");
			System.out.println("-- Grajaú -- ");
			System.out.println("1 - Caso 1");
			System.out.println("2 - Caso 2");
			System.out.println("3 - Caso 3");
			System.out.println("4 - Caso 4");
			System.out.println("5 - Caso 5");
			System.out.println("6 - Sair");
			System.out.println("");
			opcaoG = input.nextInt();
		} while (opcaoG < 1 || opcaoG > 6);

		return opcaoG;
	}

	static int taboao() {

		int opcaoT;

		do {
			System.out.println("");
			System.out.println("-- Taboao da Serra --");
			System.out.println("1 - Caso 1");
			System.out.println("2 - Caso 2");
			System.out.println("3 - Caso 3");
			System.out.println("4 - Caso 4");
			System.out.println("5 - Caso 5");
			System.out.println("6 - Sair");
			System.out.println("");
			opcaoT = input.nextInt();
		} while (opcaoT < 1 || opcaoT > 6);

		return opcaoT;
	}

	static int controleCidades() {

		int opcaoC = cidades();

		switch (opcaoC) {
		case 1:
			break;
		case 2:
			break;
		default:
			System.out.print("Opção Inválida =(");
			System.out.println("");
			break;
		}

		return opcaoC;

	}

	static int controleGrajau() {

		int opcaoG = grajau();

		switch (opcaoG) {
		case 1:
			System.out.println("Hackear > Inimigo > Inimigo > Hackear > Boss");
			break;
		case 2:
			System.out.println("Hackear > Hackear > Hackear");
			break;
		case 3:
			System.out.println("Hackear > Inimigo > Inimigo > Hackear > Boss");
			break;
		case 4:
			System.out.println("Hackear > Hackear");
			break;
		case 5:
			System.out.println("Hackear > Inimigo > Inimigo > Hackear > Boss");
			break;

		}

		return opcaoG;
	}

	static int controleTaboao() {

		int opcaoT = taboao();

		switch (opcaoT) {
		case 1:
			System.out.println("Hackear > Inimigo > Inimigo > Hackear > Boss");
			break;
		case 2:
			System.out.println("Hackear > Hackear > Hackear");
			break;
		case 3:
			System.out.println("Hackear > Inimigo > Inimigo > Hackear > Boss");
			break;
		case 4:
			System.out.println("Hackear > Hackear");
			break;
		case 5:
			System.out.println("Hackear > Inimigo > Inimigo > Hackear > Boss");
			break;

		}

		return opcaoT;
	}

	static int case1() {
		
		int resultado = 000000;	
		
		
		
		
		return resultado;
	}
	
	public static void main(String args[]) {

		int opcao = main();

		int escolha = 0;

		Boolean quit = false;

		do {

			switch (opcao) {
			case 1:
				insertionName();
				escolha = controleCidades();
				if (escolha == 1) {
					controleGrajau();
				}
				if (escolha == 2) {
					controleTaboao();
				}
				
				quit = true;
				break;
			case 2:
				credits();
				quit = true;
				break;
			case 3:
				System.out.println("Você escolheu sair!.");
				System.exit(0);
				break;
			default:
				System.out.print("Opção Inválida =(");
				System.out.println("");
				break;
			}
		} while (!quit);

	}

}
