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
			System.out.println("1 - Iniciar casos Taboao");
			opcaoT = input.nextInt();
			System.out.println("----------------------");
		} while (opcaoT < 1 || opcaoT > 2);

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

		int g1 = 0, g2 = 0, g3 = 0, g4, g5;

		Boolean sair = false;

		do {
			Boolean correto = hacking1();
			if (correto == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Seguindo em frente");
				System.out.println("----------------------");

				Boolean correto2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (correto2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					Boolean correto3 = hacking2();

					if (correto3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							g1 = 1;
						}
					}
				}
			}
			Boolean corretog1 = hacking1();
			if (corretog1 == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Seguindo em frente");
				System.out.println("----------------------");

				Boolean corretog2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (corretog2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					Boolean corretog3 = hacking2();

					if (corretog3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							g2 = 1;
						}
					}
				}
			}

			System.out.println("Hackear > Hackear > Hackear");

			System.out.println("Hackear > Hackear");

			Boolean corretogg1 = hacking1();
			if (corretogg1 == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;

				System.out.println("----------------------");
				System.out.println("Seguindo em frente");
				System.out.println("----------------------");

				Boolean corretogg2 = combat(vidaInimigo1_C1, defInimigo1_C1);

				if (corretogg2 == true) {

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					combat(vidaInimigo2_C1, defInimigo2_C1);

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					Boolean corretogg3 = hacking2();

					if (corretogg3 == true) {

						int vidaBoss_C1 = 10;
						int defBoss_C1 = 5;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							g3 = 1;
						}
					}
				}
			}

			if (g1 == 1 && g2 == 1 && g3 == 1) {
				sair = true;
			}

		} while (!sair);

		opcaoG = 1;

		return opcaoG;
	}

	static int controleTaboao() {

		int opcaoT = taboao();

		Boolean sair = false;

		int t1 = 0, t2 = 0, t3 = 0, t4, t5;

		do {

			switch (opcaoT) {
			case 1:
				Boolean correto1 = hacking1();
				if (correto1 == true) {
					int vidaInimigo1_C1 = 10;
					int defInimigo1_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					Boolean correto2 = combat(vidaInimigo1_C1, defInimigo1_C1);

					if (correto2 == true) {

						int vidaInimigo2_C1 = 10;
						int defInimigo2_C1 = 0;

						System.out.println("----------------------");
						System.out.println("Seguindo em frente");
						System.out.println("----------------------");

						combat(vidaInimigo2_C1, defInimigo2_C1);

						System.out.println("----------------------");
						System.out.println("Seguindo em frente");
						System.out.println("----------------------");

						Boolean correto3 = hacking2();

						if (correto3 == true) {

							int vidaBoss_C1 = 10;
							int defBoss_C1 = 5;

							Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

							if (Finalizado == true) {
								System.out.println("Esse caso foi finalizado!");
								t1 = 1;
							}
						}
					}
				}
				break;
			case 2:
				System.out.println("Hackear > Hackear > Hackear");
				break;
			case 3:
				Boolean corretot1 = hacking1();
				if (corretot1 == true) {
					int vidaInimigo1_C1 = 10;
					int defInimigo1_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					Boolean corretot2 = combat(vidaInimigo1_C1, defInimigo1_C1);

					if (corretot2 == true) {

						int vidaInimigo2_C1 = 10;
						int defInimigo2_C1 = 0;

						System.out.println("----------------------");
						System.out.println("Seguindo em frente");
						System.out.println("----------------------");

						combat(vidaInimigo2_C1, defInimigo2_C1);

						System.out.println("----------------------");
						System.out.println("Seguindo em frente");
						System.out.println("----------------------");

						Boolean corretot3 = hacking2();

						if (corretot3 == true) {

							int vidaBoss_C1 = 10;
							int defBoss_C1 = 5;

							Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

							if (Finalizado == true) {
								System.out.println("Esse caso foi finalizado!");
								t2 = 1;
							}
						}
					}
				}
				break;
			case 4:
				System.out.println("Hackear > Hackear");
				break;
			case 5:
				Boolean corretott1 = hacking1();
				if (corretott1 == true) {
					int vidaInimigo1_C1 = 10;
					int defInimigo1_C1 = 0;

					System.out.println("----------------------");
					System.out.println("Seguindo em frente");
					System.out.println("----------------------");

					Boolean corretott2 = combat(vidaInimigo1_C1, defInimigo1_C1);

					if (corretott2 == true) {

						int vidaInimigo2_C1 = 10;
						int defInimigo2_C1 = 0;

						System.out.println("----------------------");
						System.out.println("Seguindo em frente");
						System.out.println("----------------------");

						combat(vidaInimigo2_C1, defInimigo2_C1);

						System.out.println("----------------------");
						System.out.println("Seguindo em frente");
						System.out.println("----------------------");

						Boolean corretott3 = hacking2();

						if (corretott3 == true) {

							int vidaBoss_C1 = 10;
							int defBoss_C1 = 5;

							Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1);

							if (Finalizado == true) {
								System.out.println("Esse caso foi finalizado!");
								t3 = 1;
							}
						}
					}
				}
				break;
			default:

				if (t1 == 1 && t2 == 1 && t3 == 1) {
					sair = true;
				}

			}
		} while (!sair);

		opcaoT = 2;

		return opcaoT;
	}

	static Boolean hacking1() {

		int resultado;

		Boolean correto = false;

		System.out.println("----------------------");
		System.out.println("Essa porta está dominada por virus, descubra a alternativa correta para limpar o sistema.");

		do {

			resposta.add("Sys.out.print(“TESTE”);");
			resposta.add("System.out.printf(“TESTE”);");
			resposta.add("System.out.println(“TESTE”);"); // Correta

			System.out.println("\nSys***.out.*******(“TESTE”); ");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - " + resposta.get(0));
			System.out.println("2 - " + resposta.get(1));
			System.out.println("3 - " + resposta.get(2));
			System.out.println("----------------------");

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

		} while (!correto);

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
			System.out.println("----------------------");
			System.out.print(
					"Escolha o seu ataque, ataques disponiveis: \n 1 - Pistola 9mm \n 2 - Corpo á corpo \n 3 - Faca \n");
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
					System.out.println("----------------------");
					System.out.println("Seu ataque foi efetivo contra o inimigo");
					System.out.println("----------------------");
				}
			}

			vidaInimigo = (float) (vidaInimigo - atkJ);

			if (atkJ <= 0) {
				System.out.println("----------------------");
				System.out.println("Você errou o ataque");
				System.out.println("----------------------");
			} else {
				System.out.println("----------------------");
				System.out.println(
						"Você atacou, dando " + atkJ + " de dano ao inimigo, A vida dele agora é " + vidaInimigo);
				System.out.println("----------------------");
			}

			if (vidaInimigo <= 0) {
				System.out.println("----------------------");
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
					System.out.println("----------------------");
					System.out.println("O ataque do inimigo não foi efetivo contra você");
					System.out.println("----------------------");
				}
			}

			vidaJogador = vidaJogador - atkI;

			if (atkJ <= 0) {
				System.out.println("----------------------");
				System.out.println("O inimigo errou o ataque.");
				System.out.println("----------------------");
			} else {
				System.out.println("----------------------");
				System.out.println("Você foi atacado, recebendo " + atkI + " de dano, sua vida agora é " + vidaJogador);
				System.out.println("----------------------");
			}

			if (vidaJogador <= 0) {
				System.out.println("----------------------");
				System.out.println("Você Morreu!");
				System.out.println("----------------------");
				break;
			}

		} while (vidaInimigo > 0 || vidaJogador > 0);

		return combateFim;

	}

	static Boolean hacking2() {

		int r = 0;
		int resposta = 1;

		Boolean acertou = false;

		System.out.println("----------------------");
		System.out.println("A seguinte matriz 2D está com um valor diferente do padrão dela. "
				+ "Descubra qual coluna e linha o esse caractere diferente está.");
		do {
			System.out.println("\nMatriz\n" + "##############################################\r\n"
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
					+ "##############################################\r\n");
			System.out.println("----------------------");
			System.out.println("1 - Coluna D, Linha 3");
			System.out.println("2 - Coluna C, Linha 3");
			System.out.println("3 - Coluna B, Linha 1");
			System.out.println("4 - Coluna A, Linha 1");
			System.out.println("----------------------");
			r = input.nextInt();

		} while (r != resposta);
		if (r == resposta)
			System.out.println("----------------------");
		System.out.println("Você encontrou a obstrução na matriz!");
		System.out.println("----------------------");
		acertou = true;

		return acertou;
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
