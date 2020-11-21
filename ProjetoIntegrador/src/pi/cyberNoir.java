package pi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class cyberNoir {

	static Scanner input = new Scanner(System.in);

	static ArrayList<String> resposta = new ArrayList<String>();

	static int main() {

		int opcao = 0;

		do {
			System.out.println("----------------------");
			System.out.println("Bem vindo ao Cyber Noir");
			System.out.println("----------------------");
			System.out.println("Menu");
			System.out.println("\n1 - Jogar");
			System.out.println("2 - Créditos");
			System.out.println("3 - Sair");
			System.out.println("----------------------");
			opcao = input.nextInt();
		} while (opcao < 1 || opcao > 4);

		return opcao;

	}

	static String insertionName() {

		String name;

		System.out.println("----------------------");
		System.out.println("Bem vindo Jogador");
		System.out.print("Informe seu nome á nos: ");
		name = input.next();
		System.out.println("----------------------");
		System.out.println("");

		return name;
	}

	static void credits() {

		System.out.println("----------------------");
		System.out.println("Créditos a Grupo 10 - Xiaomeiros");
		System.out.println("\n Vitor Akira\n João Maziteli\n Tainara Almeida\n Matheus Alencar\n Yvens Borges\n");
		System.out.println("Developed in Java ");
		System.out.println("----------------------");
	}

	static int cidades() {

		int opcaoC;

		do {
			System.out.println("----------------------");
			System.out.println("Menu");
			System.out.println("\n1 - Grajau");
			System.out.println("2 - Taboão da Serra");
			System.out.println("----------------------");
			opcaoC = input.nextInt();
		} while (opcaoC < 1 || opcaoC > 3);

		return opcaoC;
	}

	static int grajau() {

		int opcaoG;

		do {
			System.out.println("----------------------");
			System.out.println("Grajaú");
			System.out.println("1 - Caso 1");
			System.out.println("2 - Caso 2");
			System.out.println("3 - Caso 3");
			System.out.println("4 - Caso 4");
			System.out.println("5 - Caso 5");
			System.out.println("6 - Voltar");
			System.out.println("----------------------");
			System.out.println("");
			opcaoG = input.nextInt();
		} while (opcaoG < 1 || opcaoG > 7);

		return opcaoG;
	}

	static int taboao() {

		int opcaoT;

		do {
			System.out.println("----------------------");
			System.out.println("Taboao da Serra");
			System.out.println("1 - Caso 1");
			System.out.println("2 - Caso 2");
			System.out.println("3 - Caso 3");
			System.out.println("4 - Caso 4");
			System.out.println("5 - Caso 5");
			System.out.println("6 - Voltar");
			opcaoT = input.nextInt();
			System.out.println("----------------------");
		} while (opcaoT < 1 || opcaoT > 7);

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

		Boolean correto = hacking1();

		int opcaoG = grajau();

		switch (opcaoG) {
		case 1:
			hacking1();
			if (correto == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				combat(vidaInimigo1_C1, defInimigo1_C1);

				Boolean correto2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (correto2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					combat(vidaInimigo2_C1, defInimigo2_C1);

					Boolean correto3 = combat(vidaInimigo1_C1, defInimigo1_C1);

					if (correto3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						combat(vidaBoss_C1, defBoss_C1);
					}
				}
			}
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

	static Boolean hacking1() {

		int resultado;

		Boolean correto = false;

		System.out.println("Essa porta está dominada por virus, descubra a alternativa correta para limpar o sistema.");

		do {
			resposta.add("Sys.out.print(“TESTE”);");
			resposta.add("System.out.printf(“TESTE”);");
			resposta.add("System.out.println(“TESTE”);"); // Correta

			System.out.println("----------------------");
			System.out.println("Sys***.out.*******(“TESTE”); ");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - " + resposta.get(0));
			System.out.println("2 - " + resposta.get(1));
			System.out.println("3 - " + resposta.get(2));

			resultado = input.nextInt();

			System.out.println("----------------------");

			switch (resultado) {
			case 1:
				if (resposta.get(0).equals("System.out.println(“TESTE”);")) {
					System.out.println("Porta desbloqueada, você pode seguir em frente.");
					correto = true;
				} else {
					System.out.println("Incorreto!");
				}
				break;
			case 2:
				if (resposta.get(1).equals("System.out.println(“TESTE”);")) {
					System.out.println("Porta desbloqueada, você pode seguir em frente.");
					correto = true;
				} else {
					System.out.println("Incorreto!");
				}
				break;
			case 3:
				if (resposta.get(2).equals("System.out.println(“TESTE”);")) {
					System.out.println("Porta desbloqueada, você pode seguir em frente.");
					correto = true;
				} else {
					System.out.println("Incorreto!");
				}
				break;
			default:

			}
			Collections.shuffle(resposta);

		} while (!correto);

		return correto;
	}

	static boolean combat(float vidaInimigo, float defInimigo) {

		// vida e defesa do inimigo

		int escolhaAtk = 0, escolhaAtkI = 0;
		double atkJ, atkI, vidaJogador = 10, defJogador = 10;

		Random dado = new Random();

		// a cada caso trocar a arma por uma arma mais forte e deixar o inimigo mais
		// forte (variavel arma atual)

		do {
			// ataque do jogador
			System.out.print(
					"Escolha o seu ataque, ataques disponiveis: \n 1 - Pistola 9mm \n 2 - Corpo á corpo \n 3 - Faca \n");
			escolhaAtk = input.nextInt();

			switch (escolhaAtk) {
			case (1):
				atkJ = dado.nextInt(8) + dado.nextInt(8); // pistola 9mm

			case (2):
				atkJ = dado.nextInt(6) + dado.nextInt(6) + dado.nextInt(6); // corpo á corpo

			default:
				atkJ = dado.nextInt(20); // faca
			}

			// defesa do inimigo contra o jogador
			// atkJ = atkJ - (defInimigo*0.5);

			if (atkJ <= defInimigo) { // se o valor do ataque for igual ou menor ï¿½ defesa, apenas 50% do valor do
										// ataque ï¿½ vï¿½lido
				atkJ = atkJ * 0.5;
				if (atkJ < 0) { // impede valores negativos
					atkJ = 0;
					System.out.println("Seu ataque foi efetivo contra o inimigo");
				}
			}

			vidaInimigo = (float) (vidaInimigo - atkJ);

			if (atkJ <= 0) {
				System.out.println("Você errou o ataque");
			} else {
				System.out.println(
						"Você atacou, dando " + atkJ + " de dano ao inimigo, A vida dele agora é " + vidaInimigo);
			}

			if (vidaInimigo <= 0) {
				System.out.println("Você matou o inimigo!");
				break;
			}

			// ataque do inimigo

			// escolha do ataque do inimigo
			escolhaAtkI = dado.nextInt(2);

			switch (escolhaAtkI) {
			case (0):
				atkI = dado.nextInt(20); // pistola 9mm

			case (1):
				atkI = dado.nextInt(6) + dado.nextInt(6) + dado.nextInt(6); // corpo ï¿½ corpo

			default:
				atkI = dado.nextInt(8) + dado.nextInt(8); // faca
			}

			// defesa do jogador contra inimigo
			atkI = atkI - (defJogador * 0.5);

			if (atkI <= defJogador) {// se o valor do ataque for igual ou menor ï¿½ defesa, apenas 50% do valor do
										// ataque ï¿½ vï¿½lido
				atkI = atkI * 0.5;
				if (atkI < 0) {// impede valores negativos
					atkI = 0;
					System.out.println("O ataque do inimigo não foi efetivo contra você");
				}
			}

			vidaJogador = vidaJogador - atkI;

			if (atkJ <= 0) {
				System.out.println("O inimigo errou o ataque.");
			} else {
				System.out.println("Você foi atacado, recebendo " + atkI + " de dano, sua vida agora é " + vidaJogador);
			}

			if (vidaJogador <= 0) {
				System.out.println("Você Morreu!");
				break;
			}

		} while (vidaInimigo > 0 || vidaJogador > 0);

		boolean combateFim = true;
		return combateFim;

	}

	public static void main(String args[]) {

		int opcao;

		int escolha = 0;

		Boolean quit = false;

		do {
			opcao = main();

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
				System.out.println("----------------------");
				System.out.println("Você escolheu sair!.");
				System.out.println("----------------------");
				System.exit(0);
				break;
			default:
				System.out.println("----------------------");
				System.out.println("\nOpção Inválida =(, tente novamente =).\n");
				opcao = 0;
				break;
			}
		} while (!quit);

	}

}
