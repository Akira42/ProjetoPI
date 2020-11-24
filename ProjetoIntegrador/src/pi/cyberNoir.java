package pi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class cyberNoir {

	static Scanner input = new Scanner(System.in);

	static ArrayList<String> respostah1 = new ArrayList<String>();

	static ArrayList<String> respostah2 = new ArrayList<String>();

	static ArrayList<String> respostah3 = new ArrayList<String>();

	static ArrayList<String> respostah4 = new ArrayList<String>();

	static ArrayList<String> respostah5 = new ArrayList<String>();

	static ArrayList<String> respostah6 = new ArrayList<String>();

	static ArrayList<String> respostah7 = new ArrayList<String>();

	static ArrayList<String> respostah8 = new ArrayList<String>();

	static ArrayList<String> respostah9 = new ArrayList<String>();

	static ArrayList<String> respostah10 = new ArrayList<String>();

	static ArrayList<String> respostah11 = new ArrayList<String>();

	static ArrayList<String> respostah12 = new ArrayList<String>();

	static ArrayList<String> respostah13 = new ArrayList<String>();

	static ArrayList<String> respostah14 = new ArrayList<String>();

	static ArrayList<String> respostah15 = new ArrayList<String>();

	static ArrayList<String> respostah16 = new ArrayList<String>();

	static ArrayList<String> respostah17 = new ArrayList<String>();

	static ArrayList<String> respostah18 = new ArrayList<String>();

	static ArrayList<String> respostah19 = new ArrayList<String>();

	static ArrayList<String> respostah20 = new ArrayList<String>();

	static ArrayList<String> respostah21 = new ArrayList<String>();

	static ArrayList<String> respostah22 = new ArrayList<String>();

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
		System.out.print("Qual seu nickname?: ");
		name = input.next();

		return name;
	}

	static void credits() {

		System.out.println("----------------------");
		System.out.println("Créditos a Grupo 10 - Xiaomeiros");
		System.out.println("\n Vitor Akira\n João Maziteli\n Tainara Almeida\n Matheus Alencar\n Yvens Borges\n");
		System.out.println("Developed in Java ");
		System.out.println("----------------------");
	}

	static int iniciar() {

		int opcaoC;

		do {
			System.out.println("----------------------");
			System.out.println("1 - Iniciar história");
			System.out.println("----------------------");
			opcaoC = input.nextInt();
		} while (opcaoC < 1 || opcaoC > 2);

		return opcaoC;
	}

	static void historia() {
		
		System.out.println("----------------------");	
		System.out.println("AQUI VAI FICAR UMA GRANDE HISTORIA");
		
		
		
	}
	
	static int grajau() {

		int opcaoG;

		do {
			System.out.println("----------------------");
			System.out.println("Grajaú");
			System.out.println("");
			System.out.println("	O lugar onde o crime vive de dia ou de noite... (Breve resumo do Grajaú)");
			System.out.println("");
			System.out.println("1 - Iniciar casos Grajaú");
			System.out.println("----------------------");
			opcaoG = input.nextInt();
		} while (opcaoG < 1 || opcaoG > 2);

		return opcaoG;
	}

	static int taboao() {

		int opcaoT;

		do {
			System.out.println("----------------------");
			System.out.println("Taboao da Serra");
			System.out.println("");
			System.out.println("	O lugar onde o crime vive de dia ou de noite... (Breve resumo do Taboao");
			System.out.println("");
			System.out.println("1 - Iniciar casos Taboao");
			opcaoT = input.nextInt();
			System.out.println("----------------------");
		} while (opcaoT < 1 || opcaoT > 2);

		return opcaoT;
	}

	static int controleCidades() {

		int opcaoC = iniciar();

		switch (opcaoC) {
		case 1:
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

		Boolean sair = false;

		do {

			Boolean correto = hacking1();
			if (correto == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");
				System.out.println("Você encontra um inimigo a frente...");
				System.out.println("\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
						+ "■⠄⠄⠄⠄⢠⡜⢣⡜⢣⡄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⢣⡄⠄⠄⠄⠄■\n"
						+ "■⠄⠄⠄⣀⡧⢜⡣⢜⡣⢼⣇⣀⣀⣀⣀⣀⣀⣀⣀⡀⠄⠄⠄⠄⠄⠸⢇⠄⠄⠄■\n"
						+ "■⠄⠄⠄⣿⣷⣎⣱⣾⣷⣎⣹⣏⣿⣉⣿⣉⣿⣉⣿⢱⡶⢆⣀⡀⠄⠄⢸⠄⠄⠄■\n"
						+ "■⠄⠄⣶⣿⣿⣿⣿⣏⣹⡿⠿⠿⠉⠉⠉⠉⠉⠉⠿⠾⢇⣸⡏⢱⡶⢆⡈⣶⠄⠄■\n"
						+ "■⠄⠄⣿⣿⣿⡿⢿⡿⢏⡁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠱⠾⢇⣸⡷⣿⠄⠄■\n"
						+ "■⠄⠄⣿⣿⣿⣷⣮⣥⣬⣥⣤⣤⠄⠄⠄⠄⠄⠄⣤⣤⣤⣤⣤⣤⣬⣽⣧⣿⠄⠄■\n"
						+ "■⠄⠄⠄⠛⣿⣿⣿⣿⣿⣿⣧⡜⣿⣿⣿⣿⣿⣿⣿⣿⣧⡜⢻⣿⣿⣧⡜⠄⠄⠄■\n"
						+ "■⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠄⠄⠛⣿⣿⣿⣿⣿⣿⡟⠃⢸⡇⠄⠄⠄■\n"
						+ "■⠄⠄⠄⠄⢻⣧⡜⠛⠛⠛⠛⠛⠄⠄⣿⠄⠄⠄⠛⠛⠛⠛⠃⠄⢠⡜⠃⠄⠄⠄■\n"
						+ "■⠄⠄⠄⠄⠸⢿⣿⡇⠄⠄⠄⠄⠄⠿⣿⣀⠶⠄⠄⠄⠄⠄⠄⢀⡸⠇⠄⠄⠄⠄■\n"
						+ "■⠄⠄⠄⠄⠄⠸⢿⣇⡀⠄⠄⠄⠄⠄⣉⠉⠄⠄⠄⠄⠄⠄⢀⡸⠇⠄⠄⠄⠄⠄■\n"
						+ "■⠄⠄⠄⠄⠄⠄⢸⣿⣇⡀⠄⠰⠶⠶⠿⠶⠶⠶⠶⠄⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄■\n"
						+ "■⠄⠄⠄⠄⠄⠄⠈⢹⣿⣷⡆⢀⠄⠄⣀⣀⣀⠄⠄⠄⢀⡰⢾⡇⠄⠄⠄⠄⠄⠄■\n"
						+ "■⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣧⠛⣤⣤⣤⠄⠄⠄⣤⡜⠃⢸⡇⠄⠄⠄⠄⠄⠄■\n"
						+ "■⣤⣤⣤⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠛⠛⠛⠛⠄⠄⠄⢠⣼⣿⣿⣧⣤⣤⣤■\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
				

				Boolean correto2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (correto2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("Narração: ");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean correto3 = hacking2();

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (correto3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}

			Boolean corretog1 = hacking3();
			if (corretog1 == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean corretog2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (corretog2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretog3 = hacking4();

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretog3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}

			hacking5();

			hacking6();

			hacking7();

			hacking8();

			hacking9();

			Boolean corretogg1 = hacking10();
			if (corretogg1 == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean corretogg2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (corretogg2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretogg3 = hacking11();

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretogg3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}
			
				sair = true;

		} while (!sair);

		opcaoG = 1;

		return opcaoG;
	}

	static int controleTaboao() {

		int opcaoT = taboao();

		Boolean sair = false;
		
		Boolean Finalizado = false;

		do {

			Boolean correto1 = hacking12();
			if (correto1 == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean correto2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (correto2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean correto3 = hacking13();

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (correto3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}
			
			Finalizado = true;
			
		} while (!Finalizado);

			hacking14();

			hacking15();

			hacking16();

			Boolean corretot1 = hacking17();
			if (corretot1 == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean corretot2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (corretot2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretot3 = hacking18();

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretot3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}

			hacking19();

			hacking20();

			Boolean corretott1 = hacking21();
			if (corretott1 == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean corretott2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (corretott2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretott3 = hacking22();

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretott3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}

			sair = true;

		} while (!sair);

		opcaoT = 2;

		return opcaoT;
	}

	static Boolean hacking1() {

		int resultado, resposta = 3;

		Boolean correto = false;

		System.out.println("----------------------");
		System.out.println(" - Porta trancada - ");
		System.out.println("Resolve o desafio abaixo para abrir");
		System.out.println("----------------------");

		do {

			System.out.println("Desafio: Qual o comando que printa e pula linha no Java?");

			respostah1.add("Sys.out.print(“TESTE”);");
			respostah1.add("System.out.printf(“TESTE”);");
			respostah1.add("System.out.println(“TESTE”);"); // Correta

			System.out.println("\nSys***.out.*******(“TESTE”); ");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - " + respostah1.get(0));
			System.out.println("2 - " + respostah1.get(1));
			System.out.println("3 - " + respostah1.get(2));
			System.out.println("----------------------");

			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Porta aberta. Seguindo em frente >>>");
			correto = true;
		}
		return correto;
	}

	static Boolean combat(float vidaInimigo, float defInimigo) {

		// vida e defesa do inimigo

		int escolhaAtk = 0, escolhaAtkI = 0;
		double atkJ, atkI, vidaJogador = 10, defJogador = 10;

		Random dado = new Random();

		Boolean combateFim = false;

		// a cada caso trocar a arma por uma arma mais forte e deixar o inimigo mais
		// forte (variavel arma atual)

		do {
			// ataque do jogador
			System.out.print("Escolha o seu ataque, ataques disponiveis: \n 1 - Pistola 9mm \n 2 - Corpo á corpo \n 3 - Faca \n");
			System.out.println("----------------------");
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
					System.out.println("----------------------");
				}
			}

			vidaInimigo = (float) (vidaInimigo - atkJ);

			if (atkJ <= 0) {
				System.out.println("Você errou o ataque");
				System.out.println("----------------------");
			} else {
				System.out.println("----------------------");
				System.out.println(
						"Você atacou, dando " + atkJ + " de dano ao inimigo, A vida dele agora é " + vidaInimigo);
				System.out.println("----------------------");
			}

			if (vidaInimigo <= 0) {
				System.out.println("Você matou o inimigo!");
				System.out.println("----------------------");
				combateFim = true;
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
					System.out.println("----------------------");
				}
			}

			vidaJogador = vidaJogador - atkI;

			if (atkJ <= 0) {
				System.out.println("O inimigo errou o ataque.");
				System.out.println("----------------------");
			} else {
				System.out.println("Você foi atacado, recebendo " + atkI + " de dano, sua vida agora é " + vidaJogador);
				System.out.println("----------------------");
			}

			if (vidaJogador <= 0) {
				System.out.println("Você Morreu!");
				System.out.println("----------------------");
				break;
			}

		} while (vidaInimigo > 0 || vidaJogador > 0);

		return combateFim;

	}

	static Boolean hacking2() {

		int resposta = 1, resultado;

		Boolean correto = false;

		System.out.println("- Erro na Matriz -");
		System.out.println("Resolve o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			System.out.println("Desafio: Encontre a obstrução na matriz: ");

			System.out.println("\nMatriz\n" + 
					"\n######################################################\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢠⣶⣆⠄⠄⠄⢸⠄⠄⢰⡶⠶⢶⣆⠄⠄⢸⠄⠄⢀⣴⡶⠶⢶⠄⠄⡇⠄⠄⣶⠶⠶⣶⣄⠄ #\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⣾⠁⢿⡄⠄⠄⢸⠄⠄⢸⣇⣀⣠⠟⠄⠄⢸⠄⠄⣾⡏⠄⠄⠄⠄⠄⡇⠄⠄⣿⠄⠄⠄⢹⡇ #\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⣾⣧⣤⣼⣿⡄⠄⢸⠄⠄⢸⡏⠉⠉⣿⡆⠄⢸⠄⠄⢿⣇⠄⠄⠄⠄⠄⡇⠄⠄⣿⠄⠄⠄⣸⡇ #\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠸⠿⠄⠄⠄⠻⠧⠄⢸⠄⠄⠸⠷⠶⠶⠟⠁⠄⢸⠄⠄⠘⠿⠶⠶⠶⠄⠄⡇⠄⠄⠿⠶⠶⠾⠛⠁ #\r\n"
					+ "#⠒⠒⠒⠒⠒⠒⠒⢸⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⢺⠒⠒⠒⠒⠒⠒⠒⠒⠒⢺⠒⠒⠒⠒⠒⠒⠒⠒⠒⡗⠒⠒⠒⠒⠒⠒⠒⠒⠒#\r\n"
					+ "#⠄⠄⠄⢠⡄⠄⠄⢸⠄⠄⠄⠄⢀⣤⣄⠄⠄⠄⢸⠄⠄⠄⢀⣤⣤⡀⠄⠄⢸⠄⠄⠄⣀⣤⣄⠄⠄⠄⡇⠄⠄⠄⢀⣤⣄⠄⠄⠄#\r\n"
					+ "#⠄⠄⠚⢹⡇⠄⠄⢸⠄⠄⠄⣰⡟⠉⠹⣿⠄⠄⢸⠄⠄⢰⡟⠉⠉⣿⠄⠄⢸⠄⠄⣼⠟⠉⢹⣧⠄⠄⡇⠄⠄⢰⡟⠉⢹⣷⠄⠄#\r\n"
					+ "#⠄⠄⠄⢸⡇⠄⠄⢸⠄⠄⠄⣿⡇⠄⠄⣿⠇⠄⢸⠄⠄⢸⡇⠄⠄⣿⠇⠄⢸⠄⠄⣿⠄⠄⢸⣿⠄⠄⡇⠄⠄⢿⡇⠄⢸⣿⠄⠄#\r\n"
					+ "#⠄⠄⣀⣸⣇⣀⠄⢸⠄⠄⠄⠹⣧⣀⣸⡿⠄⠄⢸⠄⠄⠸⣧⣀⣠⡿⠄⠄⢸⠄⠄⢻⣧⣀⣸⠏⠄⠄⡇⠄⠄⠸⣧⣀⣸⡿⠄⠄#\r\n"
					+ "#⣀⣀⣀⣀⣀⣀⣀⢸⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣸⣀⣀⣀⣀⣀⣀⣀⣀⣀⣸⣀⣀⣀⣀⣀⣀⣀⣀⣀⣇⣀⣀⣀⣀⣀⣀⣀⣀⣀#\r\n"
					+ "#⠄⠰⠟⠛⢿⣆⠄⢸⠄⠄⠄⢀⣾⠛⢻⣦⠄⠄⢸⠄⠄⢀⣾⠛⠻⣧⠄⠄⢸⠄⠄⣠⡿⠛⢿⡄⠄⠄⡇⠄⠄⢠⡾⠛⢻⣦⠄⠄#\r\n"
					+ "#⠄⠄⠄⢀⣾⠏⠄⢸⠄⠄⠄⣿⡇⠄⠄⣿⡆⠄⢸⠄⠄⢸⡇⠄⠄⣿⡆⠄⢸⠄⠄⣿⠄⠄⢸⣿⠄⠄⡇⠄⠄⣼⡇⠄⢸⣿⠄⠄#\r\n"
					+ "#⠄⠄⣴⡟⠁⠄⠄⢸⠄⠄⠄⢿⣇⠄⢠⣿⠁⠄⢸⠄⠄⢸⣇⠄⠄⣿⠁⠄⢸⠄⠄⣿⡄⠄⢸⡟⠄⠄⡇⠄⠄⢹⡇⠄⢸⣿⠄⠄#\r\n"
					+ "#⠄⠘⠛⠛⠛⠛⠄⢸⠄⠄⠄⠄⠛⠲⠛⠁⠄⠄⢸⠄⠄⠄⠛⠲⠚⠋⠄⠄⢸⠄⠄⠈⠛⠶⠛⠁⠄⠄⡇⠄⠄⠈⠛⠶⠛⠁⠄⠄#\r\n"
					+ "#⠉⠉⠉⠉⠉⠉⠉⢸⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⢹⠉⠉⠉⠉⠉⠉⠉⠉⠉⢹⠉⠉⠉⠉⠉⠉⠉⠉⠉⡏⠉⠉⠉⠉⠉⠉⠉⠉⠉#\r\n"
					+ "#⠄⢠⣴⣶⣦⡄⠄⢸⠄⠄⠄⠄⣤⣶⣦⡄⠄⠄⢸⠄⠄⠄⣤⣶⣶⣄⠄⠄⢸⠄⠄⢀⣤⣶⣦⡀⠄⠄⡇⠄⠄⠄⢠⣴⡆⠄⠄⠄#\r\n"
					+ "#⠄⠈⠄⢀⣸⠇⠄⢸⠄⠄⠄⣼⡏⠄⠘⣿⡀⠄⢸⠄⠄⢸⡏⠄⠄⣿⡀⠄⢸⠄⠄⣾⠋⠄⢸⣷⠄⠄⡇⠄⠄⠄⠉⣿⡇⠄⠄⠄#\r\n"
					+ "#⠄⠄⠉⠉⢻⣦⠄⢸⠄⠄⠄⣿⡇⠄⠄⣿⠃⠄⢸⠄⠄⢸⡇⠄⠄⣿⠃⠄⢸⠄⠄⣿⡀⠄⢸⣿⠄⠄⡇⠄⠄⠄⠄⣿⡇⠄⠄⠄#\r\n"
					+ "#⠄⠠⣤⣤⣼⠟⠄⢸⠄⠄⠄⠘⢿⣤⡼⠟⠄⠄⢸⠄⠄⠘⢿⣤⣴⠟⠄⠄⢸⠄⠄⠹⣷⣤⡼⠃⠄⠄⡇⠄⠄⠄⣤⣿⣧⣤⠄⠄#\r\n"
					+ "######################################################\n");

			respostah2.add("Coluna D, Linha 3"); // Correta
			respostah2.add("Coluna C, Linha 3");
			respostah2.add("Coluna B, Linha 1");
			respostah2.add("Coluna A, Linha 1");

			System.out.println("----------------------");
			System.out.println("1 - " + respostah2.get(0));
			System.out.println("2 - " + respostah2.get(1));
			System.out.println("3 - " + respostah2.get(2));
			System.out.println("4 - " + respostah2.get(3));
			System.out.println("----------------------");

			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Erro na matriz resolvido. Seguindo em frente >>>");
			correto = true;
		}
		return correto;
	}

	static Boolean hacking3() {

		int resposta = 3, resultado;

		Boolean correto = false;

		System.out.println("- Erro no console -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah3.add("int new [4];");
			respostah3.add("int new [5];");
			respostah3.add("new int [4];"); // Correta
			respostah3.add("int int [5];");

			System.out.println("Desafio: O que está faltando na declaração do Array abaixo?.");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - " + respostah3.get(0));
			System.out.println("2 - " + respostah3.get(1));
			System.out.println("3 - " + respostah3.get(2));
			System.out.println("4 - " + respostah3.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Console reestruturado. Seguindo em frente >>>");
			correto = true;
		}
		return correto;
	}

	static Boolean hacking4() {

		int resultado, resposta = 3;

		Boolean correto = false;

		System.out.println("- Porta trancada - ");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah4.add("import java.util.Scanner();");
			respostah4.add("import java.util.Scaner;");
			respostah4.add("import java.util.Scanner;"); // Correta
			respostah4.add("import Scanner;");

			System.out.println("Desafio - Um código está usando a biblioteca Scanner, porém, está dando erro na importação desta biblioteca. "
							+ "Qual a maneira correta de importar?");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - " + respostah4.get(0));
			System.out.println("2 - " + respostah4.get(1));
			System.out.println("3 - " + respostah4.get(2));
			System.out.println("4 - " + respostah4.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Porta aberta. Seguindo em frente >>>");
			correto = true;
		}
		return correto;
	}

	static Boolean hacking5() {

		int resultado, resposta = 3;

		Boolean correto = false;

		System.out.println("- Criptografia 1 -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah5.add("for(int i = 0; i < array.lenght; i++) {" + "\n array[i] = 10;" + "\n}");
			respostah5.add("for(int i = 0; i < array.lenght; i++) {" + "\n array[10] = 0" + "\n}");
			respostah5.add("for(int i = 0; i < array.lenght; i++) {" + "\n array[i] = 23" + "\n}"); // Correta
			respostah5.add("for(int i = 0; i < array.lenght; i++) {" + "\n array[0] = 23" + "\n}");

			System.out.println(
					"Desafio: Um array unidimensional em um código teve seu conteúdo inteiro alterado para 10 sendo que antes era 23."
							+ "Qual a alternativa correta para o array voltar ao seu conteudo original?");
			System.out.println("");
			System.out.println("1 - " + respostah5.get(0));
			System.out.println("2 - " + respostah5.get(1));
			System.out.println("3 - " + respostah5.get(2));
			System.out.println("4 - " + respostah5.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Descriptografada. Seguindo em frente >>>");
			System.out.println("----------------------");
			correto = true;
		}

		return correto;
	}

	static Boolean hacking6() {

		int resultado, resposta = 2;

		Boolean correto = false;

		System.out.println("- Criptografia 2 -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah6.add("Match.pow();");
			respostah6.add("Math.pow();"); // Correta
			respostah6.add("Match.sqrt();");
			respostah6.add("math.sqrt();");

			System.out.println("Desafio: Qual a função utilizada para calcular potências?");
			System.out.println("");
			System.out.println("1 - " + respostah6.get(0));
			System.out.println("2 - " + respostah6.get(1));
			System.out.println("3 - " + respostah6.get(2));
			System.out.println("4 - " + respostah6.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("\"Descriptografada. Seguindo em frente >>>");
			System.out.println("----------------------");
			correto = true;
		}

		return correto;
	}

	static Boolean hacking7() {

		int resultado, resposta = 3;

		Boolean correto = false;

		System.out.println("- Criptografia 3 -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah7.add("“<” no if e “++” no i");
			respostah7.add("“<” no if e “--” no i");
			respostah7.add("“>” no if e “++” no i");
			respostah7.add("“>” no if e “--” no i");

			System.out.println(
					"Desafio: No seguinte laço, o que esta faltando para que seja possivel imprimir uma contagem de 1 a 50?");
			System.out.println("");
			System.out.println("1 - " + respostah7.get(0));
			System.out.println("2 - " + respostah7.get(1));
			System.out.println("3 - " + respostah7.get(2));
			System.out.println("4 - " + respostah7.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("\"Descriptografada. Seguindo em frente >>>");
			System.out.println("----------------------");
			correto = true;
		}

		return correto;
	}

	static Boolean hacking8() {

		int resultado, resposta = 2;

		Boolean correto = false;

		System.out.println("- Criptografia 4 -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah8.add("Match.sqrt()");
			respostah8.add("Math.sqrt(121);"); // Correta
			respostah8.add("Match.sqrt();");
			respostah8.add("Mathsqrt()");

			System.out.println("Desafio: Qual a função correta para resolver a raiz quadrada de 121?");
			System.out.println("");
			System.out.println("1 - " + respostah8.get(0));
			System.out.println("2 - " + respostah8.get(1));
			System.out.println("3 - " + respostah8.get(2));
			System.out.println("4 - " + respostah8.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("\"Descriptografada. Seguindo em frente >>>");
			System.out.println("----------------------");
			correto = true;
		}

		return correto;
	}

	static Boolean hacking9() {

		int resultado, resposta = 4;

		Boolean correto = false;

		System.out.println("- Criptografia 5 -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah9.add("Scanner “Variavel” = Scanner(Scanner.in);");
			respostah9.add("Scanner “Variavel” = Scanner(Scanner.in);");
			respostah9.add("Scanner Scanner = Scanner(Scanner.in);");
			respostah9.add("Scanner “Variavel” = new Scanner(System.in);"); // Correta

			System.out.println("Desafio: Qual a maneira correta de declarar um Scanner?");
			System.out.println("");
			System.out.println("1 - " + respostah9.get(0));
			System.out.println("2 - " + respostah9.get(1));
			System.out.println("3 - " + respostah9.get(2));
			System.out.println("4 - " + respostah9.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("\"Descriptografada. Seguindo em frente >>>");
			correto = true;
		}

		return correto;
	}

	static Boolean hacking10() {

		int resultado, resposta = 3;

		Boolean correto = true;

		System.out.println("- Porta com defeito -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah10.add("variável = entrada.next();");
			respostah10.add("variável = entrada.nextInt();");
			respostah10.add("variavel = entrada.nextDouble();"); // Correta	
			respostah10.add("variavel = entrada.nextdouble();"); 

			System.out.println("Desafio: Qual a forma correta de usar o “next” para receber o valor de uma variável do tipo “double” usando o “Scanner” com nome de “entrada”?");
			System.out.println("");
			System.out.println("1 - " + respostah10.get(0));
			System.out.println("2 - " + respostah10.get(1));
			System.out.println("3 - " + respostah10.get(2));
			System.out.println("4 - " + respostah10.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Porta concertada. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking11() {

		int resultado, resposta = 3;
		
		Boolean correto = false;
		
		System.out.println("- Porta com defeito -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah11.add("variável = entrada.next();");
			respostah11.add("variável = entrada.nextInt();");
			respostah11.add("variavel = entrada.nextDouble();"); // Correta	
			respostah11.add("variavel = entrada.nextdouble();"); 

			System.out.println("Desafio: Qual a forma correta de usar o “next” para receber o valor de uma variável do tipo “double” usando o “Scanner” com nome de “entrada”?");
			System.out.println("");
			System.out.println("1 - " + respostah11.get(0));
			System.out.println("2 - " + respostah11.get(1));
			System.out.println("3 - " + respostah11.get(2));
			System.out.println("4 - " + respostah11.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Porta concertada. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking12() {

		int resultado, resposta = 2;

		Boolean correto = false;
		
		System.out.println("- Virus -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah12.add("(),()");
			respostah12.add("[],[]"); // Correta
			respostah12.add("[],()");
			respostah12.add("(),[]"); 

			System.out.println("Desafio: O que falta na criação do vetor abaixo?");
			System.out.println("");
			System.out.println("int ** vetor = new int **");
			System.out.println("");
			System.out.println("1 - " + respostah12.get(0));
			System.out.println("2 - " + respostah12.get(1));
			System.out.println("3 - " + respostah12.get(2));
			System.out.println("4 - " + respostah12.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Virus limpo. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking13() {

		int resultado, resposta = 1;

		Boolean correto = false;
		
		System.out.println("- Sistema caiu -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah13.add("tipo primitivo, variavel"); // Correta
			respostah13.add("variavel, variavel");
			respostah13.add("variavel, tipo primitivo");
			respostah13.add("tipo primitivo, tipo primitivo"); 

			System.out.println("Desafio: O que falta declarar no laço for abaixo?");
			System.out.println("");
			System.out.println("for(*** i = 0; i < ***; i++; ");
			System.out.println("");
			System.out.println("1 - " + respostah13.get(0));
			System.out.println("2 - " + respostah13.get(1));
			System.out.println("3 - " + respostah13.get(2));
			System.out.println("4 - " + respostah13.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Sistema reerguido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking14() {

		int resultado, resposta = 2;

		Boolean correto = false;
		
		System.out.println("- Virus -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah14.add("()[],()[]");
			respostah14.add("[][],[][]"); // Correta
			respostah14.add("[][],()[]");
			respostah14.add("()[],[][]"); 

			System.out.println("Desafio: O que falta na criação do vetor bidimensional abaixo?");
			System.out.println("");
			System.out.println("int ** ** vetor = new int ** **;");
			System.out.println("");
			System.out.println("1 - " + respostah14.get(0));
			System.out.println("2 - " + respostah14.get(1));
			System.out.println("3 - " + respostah14.get(2));
			System.out.println("4 - " + respostah14.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Virus limpo. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking15() {

		int resultado, resposta = 4;

		Boolean correto = false;
		
		System.out.println("- Bug matemático -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah15.add("30");
			respostah15.add("2010"); 
			respostah15.add("20,10");
			respostah15.add("Nenhuma das anteriores"); // Correta

			System.out.println("Desafio: Qual resultado da soma abaixo?");
			System.out.println("");
			System.out.println("int r = 20 + “10”;");
			System.out.println("");
			System.out.println("1 - " + respostah15.get(0));
			System.out.println("2 - " + respostah15.get(1));
			System.out.println("3 - " + respostah15.get(2));
			System.out.println("4 - " + respostah15.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Bug resolvido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking16() {

		int resultado, resposta = 2;

		Boolean correto = false;
		
		System.out.println("- Bug matemático -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah16.add("20");
			respostah16.add("1010"); // Correta
			respostah16.add("10,10");
			respostah16.add("Nenhuma das anteriores"); 

			System.out.println("Desafio: Qual é o resultado da união abaixo");
			System.out.println("");
			System.out.println("String r = “10” + “10”;");
			System.out.println("");
			System.out.println("1 - " + respostah16.get(0));
			System.out.println("2 - " + respostah16.get(1));
			System.out.println("3 - " + respostah16.get(2));
			System.out.println("4 - " + respostah16.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Bug resolvido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking17() {

		int resultado, resposta = 4;

		Boolean correto = false;
		
		System.out.println("- Bug matemático -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah17.add("20.27");
			respostah17.add("20"); 
			respostah17.add("27");
			respostah17.add("Nenhuma das anteriores"); // Correta

			System.out.println("Desafio: Qual é o resultado da união abaixo");
			System.out.println("");
			System.out.println("int r = 10 + 10.27;");
			System.out.println("");
			System.out.println("1 - " + respostah17.get(0));
			System.out.println("2 - " + respostah17.get(1));
			System.out.println("3 - " + respostah17.get(2));
			System.out.println("4 - " + respostah17.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Bug resolvido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking18() {

		int resultado, resposta = 4;

		Boolean correto = false;
		
		System.out.println("- Bug matemático -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah18.add("5, 5");
			respostah18.add("6, 6"); 
			respostah18.add("5, 6");
			respostah18.add("6, 5"); // Correta

			System.out.println("Desafio:  Qual o resultado apresentado após a execução dos comandos Java abaixo?");
			System.out.println("");
			System.out.println("i. int var1 = 5;"
					+ "\nii. int var2 = var1++;"
					+ "\niii. System.out.println(var1 + “ e ” + var2);");
			System.out.println("");
			System.out.println("1 - " + respostah18.get(0));
			System.out.println("2 - " + respostah18.get(1));
			System.out.println("3 - " + respostah18.get(2));
			System.out.println("4 - " + respostah18.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Bug resolvido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking19() {

		int resultado, resposta = 3;

		Boolean correto = false;
		
		System.out.println("- Bug no sistema -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah19.add("public static String main (String[] args)");
			respostah19.add("public static void main (String args)"); 
			respostah19.add("public static void main (String[] args)"); // Correta
			respostah19.add("public static int main (String[] args)"); 

			System.out.println("Desafio:  O método “Main” deve possuir uma assinatura que é obrigatória. Escolha a "
					+ "\nalternativa que corresponde à assinatura correta do método “Main”.");
			System.out.println("");
			System.out.println("1 - " + respostah19.get(0));
			System.out.println("2 - " + respostah19.get(1));
			System.out.println("3 - " + respostah19.get(2));
			System.out.println("4 - " + respostah19.get(3));
			System.out.println("----------------------");
			resultado = input.nextInt();

		} while (resultado != resposta);	
		if (resultado == resposta) {
			System.out.println("----------------------");
			System.out.println("Bug resolvido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking20() {

		int resultado, resposta = 4;

		Boolean correto = false;

		return correto;
	}

	static Boolean hacking21() {

		int resultado, resposta = 4;

		Boolean correto = false;

		return correto;
	}

	static Boolean hacking22() {

		int resultado, resposta = 4;

		Boolean correto = false;

		return correto;
	}

	static int karen() {

		int vitoria = 0;

		int vidaInimigo2_C1 = 10;
		int defInimigo2_C1 = 0;

		System.out.println("----------------------");
		System.out.println("Seguindo em frente");
		System.out.println("----------------------");

		combat(vidaInimigo2_C1, defInimigo2_C1);

		vitoria = 1;

		return vitoria;
	}

	public static void main(String args[]) {

		int opcao;

		int escolha = 0, escolha2 = 0;

		Boolean quit = false, quit2 = false;

		do {
			opcao = main();

			switch (opcao) {
			case 1:
				insertionName();
				
				escolha = controleCidades();
				historia();
				if (escolha == 1) {
					controleGrajau();
				}
				if (escolha == 2) {
					controleTaboao();
				}

				do {

					escolha2 = controleCidades();

					if (escolha2 == 1) {
						System.out.println("----------------------");
						System.out.println("Você já finalizou os casos deste distrito");
						System.out.println("----------------------");
					}
					if (escolha2 == 2) {
						quit2 = true;

					}

				} while (!quit2);
				controleTaboao();

				karen();

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
