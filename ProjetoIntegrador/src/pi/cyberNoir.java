package pi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class cyberNoir {
	static int temp_dialog = 12, temp_narrativa = 25, temp_transicao = 50; //define o tempo em que cada diálogo ou narração é digitado

	static Scanner input = new Scanner(System.in);

	static int main() throws Exception {// menu do jogo

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

	static String insertionName() throws Exception {//função nome

		String name;

		System.out.println("----------------------");
		System.out.println("Bem vindo Jogador");
		System.out.print("Qual seu nickname?: ");
		name = input.next();

		return name;
	}

	static void credits() throws Exception {//função creditos

		System.out.println("----------------------");
		System.out.println("Créditos a Grupo 10 - Xiaomeiros");
		System.out.println("\n Vitor Akira\n João Maziteli\n Tainara Almeida\n Matheus Alencar\n");
		System.out.println("Developed in Java ");
		System.out.println("----------------------");
	}

	static int iniciar() throws Exception {

		int opcaoC = 0;

		do {
			System.out.println("----------------------");
			System.out.println("Digite 1 para começar >>>");
			System.out.println("----------------------");
			opcaoC = input.nextInt();
		} while (opcaoC < 1 || opcaoC > 1);

		return opcaoC;
	}

	static void historia() throws Exception {
        
		String nomeJogador = insertionName();// recebendo o return da função insertionName que é o nome do usuario, na variavel nomeJogador
		
		Print("----------------------", TimeUnit.MILLISECONDS, temp_dialog);// usando a funcao Print com a variavel temp_dialog para printar na tela como se estivesse digitando
		Print("\n\nCaro "+nomeJogador+". seja bem vindo de volta ao escritório, nosso departamento policial "
                        +"ficou uma bagunça desde que você entrou de férias. ", TimeUnit.MILLISECONDS, temp_narrativa);
                Print("\nMuitos casos desaparecimentos e algumas coisas estranhas começaram acontecer em "
                        + "algumas cidades da região!", TimeUnit.MILLISECONDS, temp_narrativa);
                Print("\nVamos precisar de você bem focado nessa missão, poís não será nada fácil.", TimeUnit.MILLISECONDS, temp_narrativa);
                Print("\nA propósito a Karen está com saudade de você, quase toda dia ela perguntava se você "
                        + "estava bem.", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n\n***Você vai para a sua sala***\n", TimeUnit.MILLISECONDS, temp_transicao);
                
                Print("\n"+nomeJogador+": Olá Karen, quanto tempo! Como você está?", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n\n***Karen é sua assistente pessoal, ela é uma inteligencia artificial.***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                
                System.out.println(
                		"⣿⡟⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿\n" + 
                		"⣿⡇⢰⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⡆⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⠛⢻⣿⣿⣿⠛⢻⣿⣿⣿⣿⣿⣿⣿⠛⣿⣿⣿⣿⠛⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣇⣸⣿⣿⣀⣸⣿⣿⣿⣿⣿⣿⣿⣀⣿⣿⣇⣀⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⡏⠉⠉⣿⣿⡏⠉⠉⠉⢹⣿⣿⣿⣿⣿⣿⣿⠉⠉⠉⢹⣿⣿⠉⠉⢹⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⢠⣤⠄⠄⠄⢸⣿⣿⣿⣿⡇⠄⣤⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠄⠄⠄⢸⣿⣿⣿⣿⡇⠄⣿⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣧⡜⠛⠄⠄⢠⣼⣿⣿⣿⣿⣧⣤⠛⠄⠄⢠⣤⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⠛⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⣿⠛⢻⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣏⣉⠶⣉⡱⢎⣉⣿⣿⣏⣹⣿⣿⣿⣿⣿⣿⣿⣿⣏⡱⠶⣉⠶⢎⣹⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⡟⠛⣤⠛⢣⡜⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢣⣤⠛⣤⡜⢻⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣀⣿⣇⣸⣿⠿⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠿⢿⣇⣀⣿⣀⣸⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠉⢹⣿⣿⣿⣿⣿⣿⣿⠉⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n" + 
                		"⣿⣇⣈⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣁⣀⣿\n" + 
                		"⣿⣿⡟⠛⣿⣿⡟⠛⠛⣿⣿⡟⢻⣿⠛⣿⣿⣿⣿⣿⠛⢻⡟⠛⣿⠛⢻⣿⣿⠛⣿⣿⣿⣿⣿⠛⠛⢻⣿⣿\n" + 
                		"⣿⣿⡿⠿⣿⠄⢸⣿⣿⠄⣿⡿⢿⣿⠿⣿⣿⣿⣿⣿⠄⢀⡸⠿⣿⠄⢀⡸⠿⠄⣿⣇⣀⣀⣿⣿⡇⢸⣿⣿\n" + 
                		"⣿⣿⣷⣶⣿⣶⡎⠉⠉⣶⣿⣷⣾⣿⣶⣿⣿⣿⣿⣿⠄⢸⡇⠄⣿⠄⢸⣷⣶⠄⣿⣿⣿⣿⣿⠉⠁⠈⠉⣿\n");
                                
                Print("\nKaren: Olá "+nomeJogador+" como você está?", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n"+nomeJogador+": Eu estou bem, fiquei sabendo que a situação não está muito boa na região, "
                        + "poderia separar a lista dos distritos aonde eu preciso investigar?", TimeUnit.MILLISECONDS, temp_narrativa);        

                Print("\nKaren: É bom te ter devolta!!!", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\nKaren: Estou providênciando uma lista agora mesmo, baseada nas pistas que temos até agora, vou traçar uma rota para você e todos os distritos que você precisar investigar!", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n"+nomeJogador+": Valeu Karen!!!", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\nKaren: "+nomeJogador+", os os distritos são Grajaú e Taboão."
                    + "\n       Cada cidade tem 3 casos e cada caso 3 e 5 hackings, e todos tem 3 combates!\n", TimeUnit.MILLISECONDS, temp_narrativa);
                //mudar texto sobre quantidade de casos
	}
	
	static int grajau() throws Exception {

		int opcaoG;

		do {
			
			Print("\n----------------------\n \nGrajaú \n", TimeUnit.MILLISECONDS, temp_dialog);
			Print("\n	O lugar onde o crime vive de dia ou de noite... \n"
                                + "\n   Karen: Precisamos que você investigue esses casos, Grajaú ficou um lugar ainda mais perigoso desde que você entrou de férias.", TimeUnit.MILLISECONDS, temp_narrativa);
                        Print("\n   Karen: Você vai ter que entrar em um prédio e conseguir algumas informações para nós!\n", TimeUnit.MILLISECONDS, temp_narrativa);
			Print("\n----------------------\nDigite 1 para ir ao GRAJAÚ \n----------------------\n", TimeUnit.MILLISECONDS, temp_dialog);
			opcaoG = input.nextInt();
		} while (opcaoG < 1 || opcaoG > 2);

		return opcaoG;
	}

	static int taboao() throws Exception {

		int opcaoT;

		do {			
			Print("---------------------- \n Taboão da Serra \n", TimeUnit.MILLISECONDS, temp_narrativa);
			Print("\n O lugar onde o crime vive de dia ou de noite... (Breve resumo do Taboao \n", TimeUnit.MILLISECONDS, temp_narrativa);
			Print("\n 1 - Iniciar casos Taboao", TimeUnit.MILLISECONDS, temp_narrativa);
			opcaoT = input.nextInt();
			Print("\n ---------------------- ", TimeUnit.MILLISECONDS, temp_narrativa);
		} while (opcaoT < 1 || opcaoT > 2);

		return opcaoT;
	}

	static int controleCidades() throws Exception {

		int opcaoC = iniciar();

		switch (opcaoC) {
		case 1:
			break;
		default:
			Print("Opção Inválida =( \n", TimeUnit.MILLISECONDS, temp_dialog);
			break;
		}

		return opcaoC;
	}

	//casos grajau
	static int controleGrajau() throws Exception {

		int opcaoG = grajau();

		Boolean sair = false;

		do {
			int vidaJogador = 10, defJogador = 0, atkJogador = 30; //declaração da vida e defesa do jogador
			//CASO 1 Grajau
			
			Print("----------------------\n\n ***Você sai do departamento de policia e se locomove até o local*** \n ", TimeUnit.MILLISECONDS, temp_transicao);// narrativa/dialog/transicao
			Print("\n ***ao chegar, se depara com um grande prédio, densamente populado, parece até uma segunda cidade por dentro.*** \n" +
				  "\n ***Você passa por uma multidão de pessoas aglomeradas entre as dezenas de lojas e barracas de comida de rua no primeiro andar do prédio*** \n" + 
				  "\n ***em meio a multidão você vê seu colega Deckard do departamento de polícia comendo uma porção de yakisoba antes de seu expediente.*** \n" +
				  "\n ***Você embarca no elevador para o apartamento á ser investigado*** \n" +
				  "\n ***e encontra a porta do apartamento, ela está trancada, você precisa hackea-la*** \n" , TimeUnit.MILLISECONDS, temp_narrativa);

			Boolean correto = hacking1();
			
			if (correto == true) {
				
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;
				int atkInimigo1_C1 = 10;		
				
				Print("---------------------- \n ***Ao entrar no local, você se vê dois homens estranhos: ***\n----------------------", TimeUnit.MILLISECONDS, temp_narrativa);// narrativa/dialog/transicao
				
				System.out.println("\n\n"
						+ "⣿⣿⣿⣿⣿⣿⡟⢣⣤⠛⣤⡜⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡜⠛⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⠉⠱⢎⣉⠶⣉⡱⠎⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⠉⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⠛⠄⢠⡜⠛⣤⠛⢣⡄⠄⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣤⠛⢻⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⠄⠄⠄⠸⠿⠄⠄⠄⠸⠿⠄⠿⠇⠸⠿⠄⠿⠇⠸⠿⠄⣿⡇⢀⣀⠿⠿⢿⣿⣿⣿⠄⢸⣿⣿⣿\n"
						+ "⣿⣿⡏⠉⠄⠄⠄⠄⠄⠄⣶⡆⠄⠄⠄⠄⢰⣶⣶⣶⣶⣶⣶⣶⠄⠉⠁⢸⣿⠄⣶⡎⠉⠉⣿⣶⡎⢹⣿⣿\n"
						+ "⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⢠⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⠛⠃⢸⣿⠄⠛⠃⢸⣿⣿\n"
						+ "⣿⣿⡇⠄⠄⠄⠄⠰⠶⣀⣶⣎⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣎⣉⠄⣶⡆⢸⣿⣿\n"
						+ "⣿⣿⡇⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠄⠛⠃⢸⣿⣿\n"
						+ "⣿⣿⣿⣿⣀⣀⡀⠄⠄⠄⠄⠄⠄⠄⠿⣀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠸⠿⣀⠄⠄⠄⠄⣿⣀⣸⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠉⠁⠄⠄⣶⣶⡆⠄⠄⠄⠄⠄⠄⠄⠉⠄⠄⢰⣶⠉⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⠄⠄⢠⣤⠄⠄⠄⠄⠄⠄⠄⢠⣼⣿⠛⣿⣿⣧⣤⠄⠄⠄⠄⠄⠄⣤⣼⣿⣿⠄⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣶⡆⠈⠉⠶⣶⣶⣶⣶⣶⣶⣾⡿⠿⠄⣿⣿⣿⣿⣶⣶⣶⣶⣶⣶⣿⣿⡏⠉⣶⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⣀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣷⣶⠄⠉⢹⣿⣿⣿⣿⣿⣿⣿⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⢱⣾⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠘⢻⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠈⠉⣿⠿⢿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣿⡿⠿⣉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠛⣤⡜⢻⣿⣤⣤⣤⣼⣿⣿⣿⣿⡇⠄⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠄⠸⠇⠄⠄⠄⠸⠿⠿⠿⣀⣀⣸⣿⣿⣀⡸⠿⠿⠿⣿⣿⣿⣿⣿\n"
						+ "⠉⠉⠉⠉⠉⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠉⠉⠉⠉⠉\n");
				
				Print("---------------------- \nBandido 1: Tá fazendo oque aqui rapá? essa é nossa área! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Print("---------------------- \nVocê: Cai fora, não quero confusão. \n", TimeUnit.MILLISECONDS, temp_dialog);
				Print("---------------------- \nBandido 2: já arrumou uma, parceiro! \n", TimeUnit.MILLISECONDS, temp_dialog);
				
				System.out.println("---------------------- \n*** Combate Iniciado ***\n----------------------");
				System.out.println("A vida do inimigo é " + vidaInimigo1_C1);
				
				Boolean correto2 = combat(vidaInimigo1_C1, defInimigo1_C1, atkInimigo1_C1, vidaJogador, defJogador, atkJogador);
				
				if (correto2 == true) {

					Print("---------------------- \n ***O Segundo inimigo avança em sua direção*** \n----------------------\n", TimeUnit.MILLISECONDS, temp_narrativa);

					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;
					int atkInimigo2_C1 = 10;

					Boolean correto3 = combat(vidaInimigo2_C1, defInimigo2_C1, atkInimigo2_C1, vidaJogador, defJogador, atkJogador);

					
					Print("***Ao entrar mais á fundo naquele apartamento, você vê um computador, ele pode conter informações vitais para a investigação*** \n" + 
					"***Você tenta hackea-lo*** \n antes de chegar até ele, você ouve passos fora do quarto", TimeUnit.MILLISECONDS, temp_narrativa);
				
					Print("***um homem forte, com cerca de 2 metros de altura entra no quarto, coberto de implantes cibernéticos*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);

					System.out.println("\n" +
							"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠸⠿⠿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⢀⣀⣀⣀⣰⣶⣶⣶⣶⣶⣶⣶⣀⣀⣀⣀⣀⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⢠⡜⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⣤⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣀⡀⢸⣿⣀⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢇⣸⣿⣿⣿⡇⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣶⠉⢱⣾⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣷⡆⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛⠄⠘⠛⠛⠛⠛⠛⠛⠛⠛⠄⠘⠛⠛⠛⠛⠛⠃⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠶⢆⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠰⠶⣀⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⠃⠄⣤⣤⡄⠄⠄⠄⠄⠄⠄⠄⠛⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣸⣿⠿⣿⣿⣇⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⣶⡆⢰⣶⣶⠄⢸⣿⣿⠄⣿⣿⣿⣿⣶⠄⢰⣶⣶⣶⣶⣶⡆⠄⣶⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⣤⡜⢻⣿⠛⣤⣼⡇⠄⠄⣿⡟⢻⣿⣿⣤⡜⢻⣿⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠉⢁⡈⠉⣶⣿⣿⣷⣶⣀⣉⣱⣾⣿⣿⣿⣷⣎⣉⣉⣉⡉⢱⣶⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠘⢣⣤⣿⣿⣿⣿⣿⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠸⢇⣀⠿⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠈⠉⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠛⣤⡜⢻⣿⣤⣤⣤⣼⣿⣿⣿⣿⡇⠄⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠉⠉⠹⠿⠿⠿⣉⣉⣱⣶⣿⣀⡸⠿⠿⠿⣿⣿⣿⣿⣿\r\n" + 
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠛⠛⠛⠛⠛\r\n");
					
					Print("---------------------- \n O Grande Khan: Acha mesmo que pode entrar aqui, atirar nos meus homens e ficar por isso mesmo? HAHAHA \n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println("---------------------- \n*** Combate Iniciado ***\n----------------------");
					
					if (correto3 == true) {

						int vidaBoss_C1 = 20;
						int defBoss_C1 = 2;
						int atkBoss_C1 = 20;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1, atkBoss_C1, vidaJogador, defJogador, atkJogador);
						if (Finalizado == true) {
							
							Print("---------------------- \n ***Ao derrotar o líder da gangue, você prossegue para o computador, porém algum dispositivo de segurança é ativado, e o computador se auto-destroi!***\n ----------------------\n", TimeUnit.MILLISECONDS, temp_narrativa);// narrativa/dialog/transicao
							
							Print("\n Esse caso foi finalizado! \n", TimeUnit.MILLISECONDS, temp_narrativa);
							Print("---------------------- \n ***Você ganhou 5 pontos de vida e 2 de defesa adicionais! \n Agora você tem 15 pontos de vida e 2 de defesa! ***\n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);
							
						}
					}
				}
			}
			
			//CASO 2 Grajau
			Print("---------------------- \n ***Sem sucesso no ultimo caso, você segue para sua próxima pista*** \n " +
			"\n ***O local é um beco, você não encontra nada além de pixações, lixo e uma porta enferrujada, porém com modernos sistemas de segurança, você tenta hackea-la *** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_narrativa);// narrativa/dialog/transicao
			
			vidaJogador = 15; //reseta vida e defesa do jogador
			defJogador = 2;
			atkJogador = 35;
			
			Boolean corretog1 = hacking2();
			if (corretog1 == true) {
				int vidaInimigo1_C2 = 15;
				int defInimigo1_C2 = 0;
				int atkInimigo1_C2 = 20;

				System.out.println("\n"
						+ "⣿⣿⣿⣿⣿⣿⡟⢣⣤⠛⣤⡜⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡜⠛⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⠉⠱⢎⣉⠶⣉⡱⠎⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⠉⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⠛⠄⢠⡜⠛⣤⠛⢣⡄⠄⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣤⠛⢻⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⠄⠄⠄⠸⠿⠄⠄⠄⠸⠿⠄⠿⠇⠸⠿⠄⠿⠇⠸⠿⠄⣿⡇⢀⣀⠿⠿⢿⣿⣿⣿⠄⢸⣿⣿⣿\n"
						+ "⣿⣿⡏⠉⠄⠄⠄⠄⠄⠄⣶⡆⠄⠄⠄⠄⢰⣶⣶⣶⣶⣶⣶⣶⠄⠉⠁⢸⣿⠄⣶⡎⠉⠉⣿⣶⡎⢹⣿⣿\n"
						+ "⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⢠⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⠛⠃⢸⣿⠄⠛⠃⢸⣿⣿\n"
						+ "⣿⣿⡇⠄⠄⠄⠄⠰⠶⣀⣶⣎⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣎⣉⠄⣶⡆⢸⣿⣿\n"
						+ "⣿⣿⡇⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠄⠛⠃⢸⣿⣿\n"
						+ "⣿⣿⣿⣿⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠿⣀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠸⠿⣀⠄⠄⠄⠄⣿⣀⣸⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⠁⠄⠄⣶⣶⡆⠄⠄⠄⠄⠄⠄⠄⠉⠄⠄⢰⣶⠉⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⠄⠄⢠⣤⠄⠄⠄⠄⠄⠄⠄⢠⣼⣿⠛⣿⣿⣧⣤⠄⠄⠄⠄⠄⠄⣤⣼⣿⣿⠄⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣶⡆⠈⠉⠶⣶⣶⣶⣶⣶⣶⣾⡿⠿⠄⣿⣿⣿⣿⣶⣶⣶⣶⣶⣶⣿⣿⡏⠉⣶⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⣀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣷⣶⠄⠉⢹⣿⣿⣿⣿⣿⣿⣿⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⢱⣾⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠘⢻⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠈⠉⣿⠿⢿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣿⡿⠿⣉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠛⣤⡜⢻⣿⣤⣤⣤⣼⣿⣿⣿⣿⡇⠄⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n"
						+ "⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠄⠸⠇⠄⠄⠄⠸⠿⠿⠿⣀⣀⣸⣿⣿⣀⡸⠿⠿⠿⣿⣿⣿⣿⣿\n"
						+ "⠉⠉⠉⠉⠉⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠉⠉⠉⠉⠉\n");

				Print("---------------------- \n Bandido 1: Ei! é aquele cara que atacou os caras do Grande Khan! \n", TimeUnit.MILLISECONDS, temp_dialog);
				Print("---------------------- \n Bandido 2: perdeu rapá! perdeu! \n", TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println("---------------------- \n* Combate Iniciado * \n ----------------------");

				Boolean corretog2 = combat(vidaInimigo1_C2, defInimigo1_C2, atkInimigo1_C2, vidaJogador, defJogador, atkJogador);

				if (corretog2 == true) {

					int vidaInimigo2_C2 = 15;
					int defInimigo2_C2 = 0;
					int atkInimigo2_C2 = 20;

					Print("---------------------- \n ***O Segundo inimigo avança em sua direção*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);

					Boolean corretog3 = combat(vidaInimigo2_C2, defInimigo2_C2, atkInimigo2_C2, vidaJogador, defJogador, atkJogador);
					
					System.out.println("\n" +
							"⣿⣿⣿⣿⣿⣿⡟⢣⣤⠛⣤⡜⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡜⠛⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠉⠱⢎⣉⠶⣉⡱⠎⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⠉⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⠛⠄⢠⡜⠛⣤⠛⢣⡄⠄⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣤⠛⢻⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⠄⠄⠄⠸⠿⠄⠄⠄⠸⠿⠄⠿⠇⠸⠿⠄⠿⠇⠸⠿⠄⣿⡇⢀⣀⠿⠿⢿⣿⣿⣿⠄⢸⣿⣿⣿\r\n" + 
							"⣿⣿⡏⠉⠄⠄⠄⠄⠄⠄⣶⡆⠄⠄⠄⠄⢰⣶⣶⣶⣶⣶⣶⣶⠄⠉⠁⢸⣿⠄⣶⡎⠉⠉⣿⣶⡎⢹⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⢠⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣤⠛⠃⢸⣿⠄⠛⠃⢸⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⢀⣀⠶⣀⡸⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠉⣶⣶⣎⣉⠄⣶⡆⢸⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠘⠛⣤⣿⡇⢠⣤⣤⣤⡜⠛⠛⣿⣿⣿⡟⠛⠛⣤⣤⡄⠄⣤⣿⣿⣿⣿⠄⠛⠃⢸⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣀⠄⠄⠸⠿⣀⠿⢇⡀⠄⠄⠿⠿⢿⣿⣿⣿⣿⡿⠿⠿⣀⡀⠄⠄⠿⣿⣿⣿⣿⠿⣀⣸⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⢰⣶⣿⣶⡎⠁⠄⠄⣶⣶⣾⣿⣿⣿⣿⣷⣶⣶⠉⠁⠄⠄⣶⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿⣿⣿⣿⠛⣿⣿⣿⣿⠛⣿⣿⣿⣿⣿⠛⢻⣿⣿⣿⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣶⡆⠈⠉⠿⣿⣿⣿⣿⠄⣿⣿⡿⠿⠄⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣿⡏⠉⣶⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⣿⣿⣿⣿⠄⣿⣿⡇⠄⠄⣿⡟⢻⣿⣿⠄⢸⣿⣿⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⠿⠿⢇⣀⣿⣿⣿⣿⣿⣀⣀⣸⣿⣿⣿⣿⣇⡸⠿⠿⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣷⣶⠄⠄⢰⣾⣿⣿⣿⣿⣿⣿⠉⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⠉⢱⣾⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠘⢻⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠈⠉⣿⠿⢿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣿⡿⠿⣉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠛⣤⡜⢻⣿⣤⣤⣤⣼⣿⣿⣿⣿⡇⠄⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠄⠸⠇⠄⠄⠄⠸⠿⠿⠿⣀⣀⣸⣿⣿⣀⡸⠿⠿⠿⣿⣿⣿⣿⣿\r\n" + 
							"⠉⠉⠉⠉⠉⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠉⠉⠉⠉⠉");

					Print("---------------------- \n Pequeno Khan: Você matou meus homens e meu irmão! AGORA MORRA! \n ----------------------", TimeUnit.MILLISECONDS, temp_dialog);// narrativa/dialog/transicao

					if (corretog3 == true) {
						Print("---------------------- \n ***O Líder inimigo avança em sua direção*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);
					
						int vidaBoss_C2 = 25;
						int defBoss_C2 = 4;
						int atkBoss_C2 = 25;

						Boolean Finalizado = combat(vidaBoss_C2, defBoss_C2, atkBoss_C2, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							Print("\n ***Você encontra um computador, você tenta hackea-lo*** \n", TimeUnit.MILLISECONDS, temp_narrativa);

						}
					}
				}
			}
			
			hacking3();
			
			hacking4();

			Print("\n Esse caso foi finalizado! \n", TimeUnit.MILLISECONDS, temp_narrativa);
			Print("---------------------- \n ***Você ganhou 5 pontos de vida e 2 de defesa adicionais! \n Agora você tem 20 pontos de vida e 4 de defesa! ***\n ---------------------- \n", TimeUnit.MILLISECONDS, temp_narrativa);
			
			//CASO 3 Grajau
			Print("\n---------------------- \n ***Você não encontra nada relevante no computador, exceto por um endereço. \n sem outras opções, você vai até tal local.*** \n " +
					"\n ***Você se depara com uma casa velha, aparentemente abandonada, porém com trancas modernas nas portas, você as hackeia. *** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_narrativa);// narrativa/dialog/transicao
			vidaJogador = 20; //reseta vida e defesa do jogador
			defJogador = 4;
			atkJogador = 40;
				
			Boolean corretogg1 = hacking5();
			if (corretogg1 == true) {
				int vidaInimigo1_C3 = 15;
				int defInimigo1_C3 = 4;
				int atkInimigo1_C3 = 25;
				Print("---------------------- \n ***Você vê homens de terno preparando armas*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);
				
				System.out.println("\n"
						+
						"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠸⠿⠿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⢀⣀⣀⣀⣰⣶⣶⣶⣶⣶⣶⣶⣀⣀⣀⣀⣀⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⢠⡜⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⣤⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣀⡀⢸⣿⣀⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢇⣸⣿⣿⣿⡇⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣶⠉⢱⣾⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣷⡆⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛⠄⠘⠛⠛⠛⠛⠛⠛⠛⠛⠄⠘⠛⠛⠛⠛⠛⠃⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠶⢆⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠰⠶⣀⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⠃⠄⣤⣤⡄⠄⠄⠄⠄⠄⠄⠄⠛⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣸⣿⠿⣿⣿⣇⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⣶⡆⢰⣶⣶⠄⢸⣿⣿⠄⣿⣿⣿⣿⣶⠄⢰⣶⣶⣶⣶⣶⡆⠄⣶⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⣤⡜⢻⣿⠛⣤⣼⡇⠄⠄⣿⡟⢻⣿⣿⣤⡜⢻⣿⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠉⢁⡈⠉⣶⣿⣿⣷⣶⣀⣉⣱⣾⣿⣿⣿⣷⣎⣉⣉⣉⡉⢱⣶⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠘⢣⣤⣿⣿⣿⣿⣿⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠸⢇⣀⠿⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠈⠉⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠛⣤⡜⢻⣿⣤⣤⣤⣼⣿⣿⣿⣿⡇⠄⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠉⠉⠹⠿⠿⠿⣉⣉⣱⣶⣿⣀⡸⠿⠿⠿⣿⣿⣿⣿⣿\r\n" + 
						"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠛⠛⠛⠛⠛\r\n");
				
				Print("----------------------\n Homem 1: Ele caiu em nossa armadilha HAHAHA, nunca vai sair vivo daqui!", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao
				
				System.out.println("---------------------- \n* Combate Iniciado * \n ----------------------");

				Boolean corretogg2 = combat(vidaInimigo1_C3, defInimigo1_C3, atkInimigo1_C3, vidaJogador, defJogador, atkJogador);

				if (corretogg2 == true) {

					int vidaInimigo2_C3 = 15;
					int defInimigo2_C3 = 4;
					int atkInimigo2_C3 = 25;

					Print("---------------------- \n ***O Segundo inimigo avança em sua direção*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);

					Boolean corretogg3 = combat(vidaInimigo2_C3, defInimigo2_C3, atkInimigo2_C3, vidaJogador, defJogador, atkJogador );

					Print("---------------------- \n ***Um homem com armamento e armadura pesada entra pelo corredor*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);

					System.out.println("\n\n"+
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣀⠿⢇⡸⠿⣀⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⠉⠄⠄⠄⠄⠉⣶⡎⢱⣶⠉⣶⡎⢱⣶⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠉⢹⣿⣿⣿\n" + 
							"⣿⣿⡟⠛⠄⠄⠄⠄⠄⠄⠄⠘⢣⣤⠛⣤⡜⢣⣤⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⢻⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠶⣉⡱⢎⣉⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⠛⢣⡜⠛⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠛⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡄⠄⠄⠄⠄⢸⣿⣿\n" + 
							"⣿⣿⣷⣶⣶⠄⠄⠄⠄⠶⣉⡹⢏⣉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣶⣶⣾⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣤⠛⢣⡜⠛⣿⠛⢻⡟⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⡟⠃⠄⠄⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠸⠿⠄⠿⢇⡸⠿⠄⠿⢿⣇⣀⣀⠿⠿⠿⠿⠿⠿⢇⣸⣿⠄⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠄⣶⡎⢹⣿⣿⣶⣶⣶⣶⠄⠄⠈⠉⠉⣶⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⠛⣿⣿⡇⠄⣤⣤⣤⣤⣤⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⢈⣉⠶⣿⡿⢇⣀⣿⠿⢏⣹⣿⠿⣿⡏⢱⣶⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠄⠄⠄⠄⠄⠄⠘⠛⠄⠛⠃⢸⣿⠛⣤⣼⡟⠛⣤⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⡀⠸⠿⣿⣿⣇⣸⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠄⠄⠄⠄⠄⢰⣶⠉⠉⢱⡆⠄⠉⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣤⡜⢣⣤⠛⠛⢣⡜⠛⣤⠄⠘⠃⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠶⠶⠎⠱⠶⠉⠄⠄⠄⠄⠄⠄⠸⠿⠿⠿⣿⣿⣿⣿⣿\n" + 
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\n");
					
					Print("---------------------- \n Alguém do departamento de policia mandou lembranças HAHAHA, Do Svidaniya!", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

					if (corretogg3 == true) {

						int vidaBoss_C3 = 35;
						int defBoss_C3 = 4;
						int atkBoss_C3 = 35;

						Boolean Finalizado = combat(vidaBoss_C3, defBoss_C3, atkBoss_C3, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							Print("\n Você coletou as evidências do local! \n", TimeUnit.MILLISECONDS, temp_narrativa);
							Print("\n Esse caso foi finalizado! \n", TimeUnit.MILLISECONDS, temp_narrativa);
							Print("---------------------- \n ***Você ganhou 5 pontos de vida e 2 de defesa adicionais! "
								+ "\n Agora você tem 25 pontos de vida e 6 de defesa! ***"
								+ "\n ---------------------- \n", TimeUnit.MILLISECONDS, temp_narrativa);
						}
					}
				}
			}
			
				sair = true;

		} while (!sair);

		opcaoG = 1;

		return opcaoG;
	}
	
	//casos taboao

	static int controleTaboao() throws Exception{
		Print("\n ***Você volta para o departamento de policia*** \n", TimeUnit.MILLISECONDS, temp_transicao);
		Print("\n ---------------------- \n "
			+ "Karen: Você conseguiu coletar as evidências! agora estamos mais perto de descobrir quem, ou o que, pode estar por trás desses crimes.\n"
			+ "Karen: Com as novas pistas, consegui montar uma lista de distritos que você precisa investigar na cidade de Taboão das Trevas \n "
			+ "Você: Obrigado Karen!, durante as investigações um dos criminosos mencionou que alguém do departamento de policia poderia estar envolvido,"
			+ " temos alguma pista de quem possa ser? \n"
			+ "Karen: Ele mencionou?, infelizmente não temos nenhuma pista sobre isso Detetive, ele devia estar tentando te provocar! \n"
			+ "Você: Tem razão! não devo me preocupar com isso \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_dialog);
		
		Print("\n***Você se desloca até o local da primeira pista do Taboão***\n ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		int opcaoT = taboao();

		Boolean sair = false;

		do {
			int vidaJogador = 25, defJogador = 6, atkJogador = 45; //declaração da vida e defesa do jogador
			//CASO 1 TABOAO
			
			Print("\n ***Ao Chegar no local você se depara com mais uma porta trancada*** \n ", TimeUnit.MILLISECONDS, temp_narrativa);

			Boolean correto1 = hacking6();
			if (correto1 == true) {
				int vidaInimigo1_C4 = 20;
				int defInimigo1_C4 = 6;
				int atkInimigo1_C4 = 35;
				
				System.out.println("\n" +
						"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠸⠿⠿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⢀⣀⣀⣀⣰⣶⣶⣶⣶⣶⣶⣶⣀⣀⣀⣀⣀⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⢠⡜⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⣤⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣀⡀⢸⣿⣀⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢇⣸⣿⣿⣿⡇⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣶⠉⢱⣾⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣷⡆⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛⠄⠘⠛⠛⠛⠛⠛⠛⠛⠛⠄⠘⠛⠛⠛⠛⠛⠃⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠶⢆⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠰⠶⣀⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⠃⠄⣤⣤⡄⠄⠄⠄⠄⠄⠄⠄⠛⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣸⣿⠿⣿⣿⣇⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⣶⡆⢰⣶⣶⠄⢸⣿⣿⠄⣿⣿⣿⣿⣶⠄⢰⣶⣶⣶⣶⣶⡆⠄⣶⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⣤⡜⢻⣿⠛⣤⣼⡇⠄⠄⣿⡟⢻⣿⣿⣤⡜⢻⣿⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠉⢁⡈⠉⣶⣿⣿⣷⣶⣀⣉⣱⣾⣿⣿⣿⣷⣎⣉⣉⣉⡉⢱⣶⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠘⢣⣤⣿⣿⣿⣿⣿⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠸⢇⣀⠿⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣿⣿⣿⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠈⠉⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠛⣤⡜⢻⣿⣤⣤⣤⣼⣿⣿⣿⣿⡇⠄⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠉⠉⠹⠿⠿⠿⣉⣉⣱⣶⣿⣀⡸⠿⠿⠿⣿⣿⣿⣿⣿\r\n" + 
						"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠛⠛⠛⠛⠛\r\n");
				
				Print("---------------------- \n ***Um inimigo avança em sua direção*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);

				Boolean correto2 = combat(vidaInimigo1_C4, defInimigo1_C4, atkInimigo1_C4, vidaJogador, defJogador, atkJogador);

				if (correto2 == true) {

					int vidaInimigo2_C4 = 20;
					int defInimigo2_C4 = 6;
					int atkInimigo2_C4 = 35;
					
					Print("---------------------- \n ***O Segundo inimigo avança em sua direção*** \n ----------------------", TimeUnit.MILLISECONDS, temp_narrativa);
					
					Boolean correto3 = combat(vidaInimigo2_C4, defInimigo2_C4, atkInimigo2_C4, vidaJogador, defJogador, atkJogador);
					
					System.out.println("\n" +
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣀⠿⢇⡸⠿⣀⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⠉⠄⠄⠄⠄⠉⣶⡎⢱⣶⠉⣶⡎⢱⣶⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠉⢹⣿⣿⣿\n" + 
							"⣿⣿⡟⠛⠄⠄⠄⠄⠄⠄⠄⠘⢣⣤⠛⣤⡜⢣⣤⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⢻⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠶⣉⡱⢎⣉⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⠛⢣⡜⠛⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⢸⣿⣿\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠛⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡄⠄⠄⠄⠄⢸⣿⣿\n" + 
							"⣿⣿⣷⣶⣶⠄⠄⠄⠄⠶⣉⡹⢏⣉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣶⣶⣾⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣤⠛⢣⡜⠛⣿⠛⢻⡟⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⡟⠃⠄⠄⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠸⠿⠄⠿⢇⡸⠿⠄⠿⢿⣇⣀⣀⠿⠿⠿⠿⠿⠿⢇⣸⣿⠄⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠄⣶⡎⢹⣿⣿⣶⣶⣶⣶⠄⠄⠈⠉⠉⣶⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⠛⣿⣿⡇⠄⣤⣤⣤⣤⣤⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⢈⣉⠶⣿⡿⢇⣀⣿⠿⢏⣹⣿⠿⣿⡏⢱⣶⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠄⠄⠄⠄⠄⠄⠘⠛⠄⠛⠃⢸⣿⠛⣤⣼⡟⠛⣤⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⡀⠸⠿⣿⣿⣇⣸⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠄⠄⠄⠄⠄⢰⣶⠉⠉⢱⡆⠄⠉⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣤⡜⢣⣤⠛⠛⢣⡜⠛⣤⠄⠘⠃⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
							"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠶⠶⠎⠱⠶⠉⠄⠄⠄⠄⠄⠄⠸⠿⠿⠿⣿⣿⣿⣿⣿\n" + 
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\n");
					
					Print("\n Soldado Corporativo: Olha, olha, quem estou vendo por aqui, se não é o tal do frangote do detetive, vem pro pau! \n ", TimeUnit.MILLISECONDS, temp_dialog);

					if (correto3 == true) {

						int vidaBoss_C4 = 50;
						int defBoss_C4 = 8;
						int atkBoss_C4 = 35;

						Boolean Finalizado = combat(vidaBoss_C4, defBoss_C4, atkBoss_C4, vidaJogador, defJogador, atkJogador );

						if (Finalizado == true) {
							Print("\n ***Você encontra um computador, você tenta hackea-lo*** \n", TimeUnit.MILLISECONDS, temp_narrativa);
						}
					}
				}
			}

			hacking7();

			hacking8();
			
			Print("\n Esse caso foi finalizado! \n", TimeUnit.MILLISECONDS, temp_narrativa);
			Print("---------------------- \n ***Você ganhou 5 pontos de vida e 2 de defesa adicionais! "
				+ "\n Agora você tem 30 pontos de vida e 8 de defesa! ***"
				+ "\n ---------------------- \n", TimeUnit.MILLISECONDS, temp_narrativa);


			//CASO 2 TABOAO
			Print("\n ***Com as pistas encontradas no último local, você segue para o próximo*** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_transicao);
			Print("\n ***Você vê um prédio alto, a sede de uma das maiores corporações do país.*** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_transicao);
			Print("\n ***Diversos guardas armados estão na frente do prédio, mas você percebe uma porta nos fundos desprotegida.*** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_transicao);
			
			vidaJogador = 30; //reseta vida e defesa do jogador
			defJogador = 8;
			atkJogador = 50;
			
			Print("\n ***Você precisa hackea-la*** \n ", TimeUnit.MILLISECONDS, temp_narrativa);
			
			Boolean corretot1 = hacking9();
			if (corretot1 == true) {
				int vidaInimigo1_C5 = 25;
				int defInimigo1_C5 = 6;
				int atkInimigo1_C5 = 35;
				
				System.out.println("\n" +
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣀⠿⢇⡸⠿⣀⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⠉⠄⠄⠄⠄⠉⣶⡎⢱⣶⠉⣶⡎⢱⣶⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠉⢹⣿⣿⣿\r\n" + 
						"⣿⣿⡟⠛⠄⠄⠄⠄⠄⠄⠄⠘⢣⣤⠛⣤⡜⢣⣤⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⢻⣿⣿\r\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠶⣉⡱⢎⣉⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\r\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⠛⢣⡜⠛⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\r\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\r\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⢸⣿⣿\r\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠛⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡄⠄⠄⠄⠄⢸⣿⣿\r\n" + 
						"⣿⣿⣷⣶⣶⠄⠄⠄⠄⠶⣉⡹⢏⣉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣶⣶⣾⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣤⠛⢣⡜⠛⣿⠛⢻⡟⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⡟⠃⠄⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠸⠿⠄⠿⢇⡸⠿⠄⠿⢿⣇⣀⣀⠿⠿⠿⠿⠿⠿⢇⣸⣿⠄⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠄⣶⡎⢹⣿⣿⣶⣶⣶⣶⠄⠄⠈⠉⠉⣶⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⠛⣿⣿⡇⠄⣤⣤⣤⣤⣤⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⢈⣉⠶⣿⡿⢇⣀⣿⠿⢏⣹⣿⠿⣿⡏⢱⣶⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠄⠄⠄⠄⠄⠄⠘⠛⠄⠛⠃⢸⣿⠛⣤⣼⡟⠛⣤⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⡀⠸⠿⣿⣿⣇⣸⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠄⠄⠄⠄⠄⢰⣶⠉⠉⢱⡆⠄⠉⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣤⡜⢣⣤⠛⠛⢣⡜⠛⣤⠄⠘⠃⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
						"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠶⠶⠎⠱⠶⠉⠄⠄⠄⠄⠄⠄⠸⠿⠿⠿⣿⣿⣿⣿⣿\r\n" + 
						"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\r\n");

				Print("----------------------\n Soldado Corporativo: Essa é uma área privada! você está invadindo! \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

				Boolean corretot2 = combat(vidaInimigo1_C5, defInimigo1_C5, atkInimigo1_C5, vidaJogador, defJogador, atkJogador);

				if (corretot2 == true) {

					int vidaInimigo2_C5 = 25;
					int defInimigo2_C5 = 6;
					int atkInimigo2_C5 = 35;
					
					Boolean corretot3 =combat(vidaInimigo2_C5, defInimigo2_C5, atkInimigo2_C5, vidaJogador, defJogador, atkJogador);
					
					System.out.println("\n" +
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣀⠿⢇⡸⠿⣀⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⠉⠄⠄⠄⠄⠉⣶⡎⢱⣶⠉⣶⡎⢱⣶⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠉⢹⣿⣿⣿\r\n" + 
							"⣿⣿⡟⠛⠄⠄⠄⠄⠄⠄⠄⠘⢣⣤⠛⣤⡜⢣⣤⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⢻⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠶⣉⡱⢎⣉⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⠛⢣⡜⠛⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⢸⣿⣿\r\n" + 
							"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠛⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡄⠄⠄⠄⠄⢸⣿⣿\r\n" + 
							"⣿⣿⣷⣶⣶⠄⠄⠄⠄⠶⣉⡹⢏⣉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣶⣶⣾⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣤⠛⢣⡜⠛⣿⠛⢻⡟⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⡟⠃⠄⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠸⠿⠄⠿⢇⡸⠿⠄⠿⢿⣇⣀⣀⠿⠿⠿⠿⠿⠿⢇⣸⣿⠄⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠄⣶⡎⢹⣿⣿⣶⣶⣶⣶⠄⠄⠈⠉⠉⣶⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⠛⣿⣿⡇⠄⣤⣤⣤⣤⣤⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⢈⣉⠶⣿⡿⢇⣀⣿⠿⢏⣹⣿⠿⣿⡏⢱⣶⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠄⠄⠄⠄⠄⠄⠘⠛⠄⠛⠃⢸⣿⠛⣤⣼⡟⠛⣤⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⡀⠸⠿⣿⣿⣇⣸⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠄⠄⠄⠄⠄⢰⣶⠉⠉⢱⡆⠄⠉⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣤⡜⢣⣤⠛⠛⢣⡜⠛⣤⠄⠘⠃⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
							"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠶⠶⠎⠱⠶⠉⠄⠄⠄⠄⠄⠄⠸⠿⠿⠿⣿⣿⣿⣿⣿\r\n" + 
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\r\n");
					Print("\n Você não pode se meter nos interesses da Corporação! \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_dialog);

					if (corretot3 == true) {

						int vidaBoss_C5 = 60;
						int defBoss_C5 = 8;
						int atkBoss_C5 = 45;

						Boolean Finalizado = combat(vidaBoss_C5, defBoss_C5, atkBoss_C5, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							Print("\n Esse caso foi finalizado! \n", TimeUnit.MILLISECONDS, temp_narrativa);
							Print("---------------------- \n ***Você ganhou 5 pontos de vida e 2 de defesa adicionais! "
								+ "\n Agora você tem 35 pontos de vida e 10 de defesa! ***"
								+ "\n ---------------------- \n", TimeUnit.MILLISECONDS, temp_narrativa);
							
							Print("\n ***Você encontra um memorando com informações importantes, e sai *** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_transicao);
							
						}
					}
				}
			}
			
			//CASO 3 TABOAO
			Print("\n ***Ao analisar as pistas com mais calma, você descobre que as informações confirmam que havia alguem de dentro do departamento envolvido dos crimes *** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_transicao);
			Print("\n ***Você ve o código 'KN-1', o mesmo código inscrito no monitor da Karen*** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_transicao);
			Print("\n Você: Que robô falso! \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_dialog);
			Print("\n ***Você volta para o departamento de polícia para confrontar Karen*** \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_transicao);
			
			vidaJogador = 35; //reseta vida e defesa do jogador
			defJogador = 10;
			atkJogador = 55;
			
			Print("\n ***Ao Chegar no local ele está vazio, e as portas estão trancadas, você precisa hackear para entrar*** \n ", TimeUnit.MILLISECONDS, temp_narrativa);
			
			Boolean corretott1 = hacking10();
			if (corretott1 == true) {
				int vidaInimigo1_C6 = 30;
				int defInimigo1_C6 = 6;
				int atkInimigo1_C6 = 35;
				
				System.out.println("\n" +
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣀⠿⢇⡸⠿⣀⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⠉⠄⠄⠄⠄⠉⣶⡎⢱⣶⠉⣶⡎⢱⣶⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠉⢹⣿⣿⣿\n" + 
						"⣿⣿⡟⠛⠄⠄⠄⠄⠄⠄⠄⠘⢣⣤⠛⣤⡜⢣⣤⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⢻⣿⣿\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠶⣉⡱⢎⣉⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⠛⢣⡜⠛⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠿⢇⡸⠿⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⣿\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⢸⣿⣿\n" + 
						"⣿⣿⡇⠄⠄⠄⠄⠄⠄⠛⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡄⠄⠄⠄⠄⢸⣿⣿\n" + 
						"⣿⣿⣷⣶⣶⠄⠄⠄⠄⠶⣉⡹⢏⣉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⣶⣶⣾⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⣤⠛⢣⡜⠛⣿⠛⢻⡟⠛⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⡟⠃⠄⠄⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠸⠿⠄⠿⢇⡸⠿⠄⠿⢿⣇⣀⣀⠿⠿⠿⠿⠿⠿⢇⣸⣿⠄⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣶⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠁⠄⠄⣶⡎⢹⣿⣿⣶⣶⣶⣶⠄⠄⠈⠉⠉⣶⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢠⣤⠛⣿⣿⡇⠄⣤⣤⣤⣤⣤⣿⣿⣿⡇⠄⣿⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣿⣷⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⢈⣉⠶⣿⡿⢇⣀⣿⠿⢏⣹⣿⠿⣿⡏⢱⣶⣿⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣧⣤⠄⠄⠄⠄⠄⠄⠄⠄⠘⠛⠄⠛⠃⢸⣿⠛⣤⣼⡟⠛⣤⠛⢣⣼⣿⣿⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⡀⠸⠿⣿⣿⣇⣸⣿⣿⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠄⠄⠄⠄⠄⠄⢰⣶⠉⠉⢱⡆⠄⠉⣿⣿⣿⣿⠉⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣤⡜⢣⣤⠛⠛⢣⡜⠛⣤⠄⠘⠃⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
						"⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠄⠄⠄⠄⠄⠉⠱⠎⠉⠶⠶⠎⠱⠶⠉⠄⠄⠄⠄⠄⠄⠸⠿⠿⠿⣿⣿⣿⣿⣿\n" + 
						"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛");
				Print("\n Soldado Corporativo: PARE! Estamos com ordens para fechar o departamento! \n", TimeUnit.MILLISECONDS, temp_transicao);
				Print("\n Você: Eu sou um detetive aqui!, preciso entrar! \n", TimeUnit.MILLISECONDS, temp_transicao);
				Print("\n Soldado Corporativo: Você é o detetive? ABRIR FOGO! \n", TimeUnit.MILLISECONDS, temp_transicao);
				
				Boolean corretott2 = combat(vidaInimigo1_C6, defInimigo1_C6, atkInimigo1_C6, vidaJogador, defJogador, atkJogador);

				if (corretott2 == true) {

					int vidaInimigo2_C6 = 30;
					int defInimigo2_C6 = 6;
					int atkInimigo2_C6 = 35;

					Boolean corretott3 = combat(vidaInimigo2_C6, defInimigo2_C6, atkInimigo2_C6, vidaJogador, defJogador, atkJogador);

					if (corretott3 == true) {
						Print("\n ***Você vê um robô grande com fios e circuitos expostos, com uma face que lembra um esqueleto humano!*** \n", TimeUnit.MILLISECONDS, temp_transicao);
						
						System.out.println("\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⢇⡀⠄⣀⣀⣀⣀⣀⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠉⢱⣶⠄⣶⡎⢱⣶⠉⣿⣿⣿⣿⣶⣶⣶⡎⠉⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⡟⠛⠄⠄⠘⢣⣤⠛⣤⡜⢣⣤⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⢻⣿⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⡏⠁⠄⠄⠄⠄⠈⠉⠶⣉⡱⢎⣉⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡎⠉⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠛⢣⡜⠛⣤⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⠛⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⠿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡸⠿⣀⠿⢿⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⠄⠿⢿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⢰⣶⣶⠄⠈⢱⣶⠉⣶⣾⣿⣿⠉⣶⣶⡎⠉⠉⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⣤⣼⣿⣿⣿⣿⡇⢠⣤⠛⣤⣼⡇⠄⣿⣿⣿⣿⣿⣤⠛⢻⣿⣿⠄⠄⢸⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠿⢿⣿⣿⣿⠿⠇⠈⠉⠶⣉⣹⣇⣀⠿⣿⣿⣿⣿⠿⣀⣸⣿⣿⠄⠄⢸⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠘⠛⠛⠛⠄⠄⠄⠄⣤⠛⢻⣿⣿⣤⠛⠛⠛⠛⣤⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⠄⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣾⣿⣿⣿⡿⠏⠉⣉⠉⠉⠁⠄⣀⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣧⡄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⢻⣿⣿⠛⠛⠃⢠⣤⣿⠄⠄⢠⣤⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣇⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠿⠄⠄⢀⣸⣿⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣾⡇⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⢠⣤⠄⣤⣤⣤⣤⣿⠛⢣⣼⣿⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣀⡀⠈⠉⠶⠉⠹⠿⠿⣉⠄⢸⣿⣿⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠛⢣⡄⠄⠄⣤⡄⢠⣤⣿⣿⣿⣿⣿⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n");
						Print("\n The Deciever: Detetive Detetive... você seguiu nossos passos como esperavamos!, minha criadora está muito contente \n", TimeUnit.MILLISECONDS, temp_transicao);
						Print("\n The Deciever: Mas agora preciso te parar! hahaha *beep* \n", TimeUnit.MILLISECONDS, temp_transicao);
					
						System.out.println("---------------------- \n* Combate Iniciado * \n ----------------------");

						int vidaBoss_C6 = 70;
						int defBoss_C6 = 8;
						int atkBoss_C6 = 50;
						
						Boolean Finalizado = combat(vidaBoss_C6, defBoss_C6, atkBoss_C6, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {							
							Print("\n Esse caso foi finalizado! \n", TimeUnit.MILLISECONDS, temp_narrativa);
							Print("---------------------- \n ***Você ganhou 5 pontos de vida e 2 de defesa adicionais! "
								+ "\n Agora você tem 40 pontos de vida e 12 de defesa! ***"
								+ "\n ---------------------- \n", TimeUnit.MILLISECONDS, temp_narrativa);

						}
					}
				}
			}

			sair = true;

		} while (!sair);

		opcaoT = 2;

		return opcaoT;
	}

	//Função combate 
	static Boolean combat( double vidaInimigo, float defInimigo, int atkInimigo, double vidaJogador, float defJogador, int atkJogador) throws Exception {

		// vida e defesa do inimigo
		double vidaJogadorBckp = vidaJogador, vidaInimigoBckp = vidaInimigo;
		int escolhaAtk = 0;
		double atkJ, atkI;

		Random dado = new Random();

		Boolean combateFim = false;

		do {
			// ataque do jogador
			System.out.print("Escolha o seu ataque, ataques disponiveis: \n 1 - Pistola 9mm \n 2 - Corpo á corpo \n 3 - Faca \n");
			System.out.println("----------------------");
			escolhaAtk = input.nextInt();

			switch (escolhaAtk) {
			case (1):
				atkJ = dado.nextInt(atkJogador) + dado.nextInt(8); // pistola 9mm

			case (2):
				atkJ = dado.nextInt(atkJogador) + dado.nextInt(6) + dado.nextInt(6); // corpo á corpo

			default:
				atkJ = dado.nextInt(atkJogador); // faca
			}

			// defesa do inimigo contra o jogador
			if (atkJ <= defInimigo) { // se o valor do ataque for igual ou menor ï¿½ defesa, apenas 50% do valor do
										// ataque é inválido
				atkJ = atkJ * 0.5;
				if (atkJ < 0) { // impede valores negativos
					atkJ = 0;

					System.out.println("Seu ataque foi efetivo contra o inimigo");
					System.out.println("----------------------");
				}
			}

			vidaInimigo = (float) (vidaInimigo - atkJ);
			
			//ataque jogador
			if (atkJ <= 0) {
				System.out.println("Você errou o ataque");
				System.out.println("----------------------");
			} else {
				System.out.println("----------------------");
				System.out.println(
						"Você atacou, dando " + atkJ + " de dano ao inimigo, A vida dele agora é " + vidaInimigo);
				System.out.println("----------------------");
			}

			//inimigo morre
			if (vidaInimigo <= 0) {
				Print("***Você matou o inimigo!***\n", TimeUnit.MILLISECONDS, temp_narrativa);
				combateFim = true;
				break;
			}

			// escolha do ataque do inimigo
			atkI = dado.nextInt(atkInimigo);
					
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
			
			//ataque inimigo
			if (atkI <= 0) {
				System.out.println("O inimigo errou o ataque.");
				System.out.println("----------------------");
			} else {
				System.out.println("Você foi atacado, recebendo " + atkI + " de dano, sua vida agora é " + vidaJogador);
				System.out.println("----------------------");
			}

			//jogador morre
			if (vidaJogador <= 0) {
				Print("***Você morreu! tente novamente! *** \n----------------------\n", TimeUnit.MILLISECONDS, temp_narrativa);

				vidaJogador = vidaJogadorBckp;
				vidaInimigo = vidaInimigoBckp;
			}

		} while (vidaInimigo > 0 || vidaJogador > 0);

		return combateFim;

	}
	
	static Boolean hacking1() throws Exception {
		ArrayList<String> respostah1 = new ArrayList<String>();
		
		int resultado, resposta = 2;

		Boolean correto = false;
		
		System.out.println("----------------------");
		System.out.println("- Virus -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah1.add("(),()");
			respostah1.add("[],[]"); // Correta
			respostah1.add("[],()");
			respostah1.add("(),[]"); 

			System.out.println("Desafio: O que falta na criação do vetor abaixo?");
			System.out.println("");
			System.out.println("int ** vetor = new int **");
			System.out.println("");
			System.out.println("1 - " + respostah1.get(0));
			System.out.println("2 - " + respostah1.get(1));
			System.out.println("3 - " + respostah1.get(2));
			System.out.println("4 - " + respostah1.get(3));
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

	static Boolean hacking2() throws Exception {
		
		ArrayList<String> respostah2 = new ArrayList<String>();
		
		int resposta = 1, resultado;

		Boolean correto = false;

		System.out.println("- Erro na Matriz -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {
			System.out.println("Desafio: Encontre a obstrução na matriz: ");
			System.out.println("\nMatriz\n" + 
					"\n######################################################\r\n"
					+ "⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢠⣶⣆⠄⠄⠄⢸⠄⠄⢰⡶⠶⢶⣆⠄⠄⢸⠄⠄⢀⣴⡶⠶⢶⠄⠄⡇⠄⠄⣶⠶⠶⣶⣄⠄ #\r\n"
					+ "⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⣾⠁⢿⡄⠄⠄⢸⠄⠄⢸⣇⣀⣠⠟⠄⠄⢸⠄⠄⣾⡏⠄⠄⠄⠄⠄⡇⠄⠄⣿⠄⠄⠄⢹⡇ #\r\n"
					+ "⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⣾⣧⣤⣼⣿⡄⠄⢸⠄⠄⢸⡏⠉⠉⣿⡆⠄⢸⠄⠄⢿⣇⠄⠄⠄⠄⠄⡇⠄⠄⣿⠄⠄⠄⣸⡇ #\r\n"
					+ "⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠸⠿⠄⠄⠄⠻⠧⠄⢸⠄⠄⠸⠷⠶⠶⠟⠁⠄⢸⠄⠄⠘⠿⠶⠶⠶⠄⠄⡇⠄⠄⠿⠶⠶⠾⠛⠁ #\r\n"
					+ "⠒⠒⠒⠒⠒⠒⠒⢸⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⢺⠒⠒⠒⠒⠒⠒⠒⠒⠒⢺⠒⠒⠒⠒⠒⠒⠒⠒⠒⡗⠒⠒⠒⠒⠒⠒⠒⠒⠒#\r\n"
					+ "⠄⠄⠄⢠⡄⠄⠄⢸⠄⠄⠄⠄⢀⣤⣄⠄⠄⠄⢸⠄⠄⠄⢀⣤⣤⡀⠄⠄⢸⠄⠄⠄⣀⣤⣄⠄⠄⠄⡇⠄⠄⠄⢀⣤⣄⠄⠄⠄#\r\n"
					+ "⠄⠄⠚⢹⡇⠄⠄⢸⠄⠄⠄⣰⡟⠉⠹⣿⠄⠄⢸⠄⠄⢰⡟⠉⠉⣿⠄⠄⢸⠄⠄⣼⠟⠉⢹⣧⠄⠄⡇⠄⠄⢰⡟⠉⢹⣷⠄⠄#\r\n"
					+ "⠄⠄⠄⢸⡇⠄⠄⢸⠄⠄⠄⣿⡇⠄⠄⣿⠇⠄⢸⠄⠄⢸⡇⠄⠄⣿⠇⠄⢸⠄⠄⣿⠄⠄⢸⣿⠄⠄⡇⠄⠄⢿⡇⠄⢸⣿⠄⠄#\r\n"
					+ "⠄⠄⣀⣸⣇⣀⠄⢸⠄⠄⠄⠹⣧⣀⣸⡿⠄⠄⢸⠄⠄⠸⣧⣀⣠⡿⠄⠄⢸⠄⠄⢻⣧⣀⣸⠏⠄⠄⡇⠄⠄⠸⣧⣀⣸⡿⠄⠄#\r\n"
					+ "⣀⣀⣀⣀⣀⣀⣀⢸⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣸⣀⣀⣀⣀⣀⣀⣀⣀⣀⣸⣀⣀⣀⣀⣀⣀⣀⣀⣀⣇⣀⣀⣀⣀⣀⣀⣀⣀⣀#\r\n"
					+ "⠄⠰⠟⠛⢿⣆⠄⢸⠄⠄⠄⢀⣾⠛⢻⣦⠄⠄⢸⠄⠄⢀⣾⠛⠻⣧⠄⠄⢸⠄⠄⣠⡿⠛⢿⡄⠄⠄⡇⠄⠄⢠⡾⠛⢻⣦⠄⠄#\r\n"
					+ "⠄⠄⠄⢀⣾⠏⠄⢸⠄⠄⠄⣿⡇⠄⠄⣿⡆⠄⢸⠄⠄⢸⡇⠄⠄⣿⡆⠄⢸⠄⠄⣿⠄⠄⢸⣿⠄⠄⡇⠄⠄⣼⡇⠄⢸⣿⠄⠄#\r\n"
					+ "⠄⠄⣴⡟⠁⠄⠄⢸⠄⠄⠄⢿⣇⠄⢠⣿⠁⠄⢸⠄⠄⢸⣇⠄⠄⣿⠁⠄⢸⠄⠄⣿⡄⠄⢸⡟⠄⠄⡇⠄⠄⢹⡇⠄⢸⣿⠄⠄#\r\n"
					+ "⠄⠘⠛⠛⠛⠛⠄⢸⠄⠄⠄⠄⠛⠲⠛⠁⠄⠄⢸⠄⠄⠄⠛⠲⠚⠋⠄⠄⢸⠄⠄⠈⠛⠶⠛⠁⠄⠄⡇⠄⠄⠈⠛⠶⠛⠁⠄⠄#\r\n"
					+ "⠉⠉⠉⠉⠉⠉⠉⢸⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⢹⠉⠉⠉⠉⠉⠉⠉⠉⠉⢹⠉⠉⠉⠉⠉⠉⠉⠉⠉⡏⠉⠉⠉⠉⠉⠉⠉⠉⠉#\r\n"
					+ "⠄⢠⣴⣶⣦⡄⠄⢸⠄⠄⠄⠄⣤⣶⣦⡄⠄⠄⢸⠄⠄⠄⣤⣶⣶⣄⠄⠄⢸⠄⠄⢀⣤⣶⣦⡀⠄⠄⡇⠄⠄⠄⢠⣴⡆⠄⠄⠄#\r\n"
					+ "⠄⠈⠄⢀⣸⠇⠄⢸⠄⠄⠄⣼⡏⠄⠘⣿⡀⠄⢸⠄⠄⢸⡏⠄⠄⣿⡀⠄⢸⠄⠄⣾⠋⠄⢸⣷⠄⠄⡇⠄⠄⠄⠉⣿⡇⠄⠄⠄#\r\n"
					+ "⠄⠄⠉⠉⢻⣦⠄⢸⠄⠄⠄⣿⡇⠄⠄⣿⠃⠄⢸⠄⠄⢸⡇⠄⠄⣿⠃⠄⢸⠄⠄⣿⡀⠄⢸⣿⠄⠄⡇⠄⠄⠄⠄⣿⡇⠄⠄⠄#\r\n"
					+ "⠄⠠⣤⣤⣼⠟⠄⢸⠄⠄⠄⠘⢿⣤⡼⠟⠄⠄⢸⠄⠄⠘⢿⣤⣴⠟⠄⠄⢸⠄⠄⠹⣷⣤⡼⠃⠄⠄⡇⠄⠄⠄⣤⣿⣧⣤⠄⠄#\r\n"
					+ "#####################################################\n");

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

	static Boolean hacking3() throws Exception {
		
		ArrayList<String> respostah3 = new ArrayList<String>();

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

	static Boolean hacking4() throws Exception {

		ArrayList<String> respostah4 = new ArrayList<String>();
		

		int resultado, resposta = 2;

		Boolean correto = false;
		
		System.out.println("- Virus -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah4.add("()[],()[]");
			respostah4.add("[][],[][]"); // Correta
			respostah4.add("[][],()[]");
			respostah4.add("()[],[][]"); 

			System.out.println("Desafio: O que falta na criação do vetor bidimensional abaixo?");
			System.out.println("");
			System.out.println("int ** ** vetor = new int ** **;");
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
			System.out.println("Virus limpo. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking5() throws Exception {
		
		ArrayList<String> respostah5 = new ArrayList<String>();

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

	static Boolean hacking6() throws Exception {

		ArrayList<String> respostah6 = new ArrayList<String>();
		
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

	static Boolean hacking7() throws Exception {
		
		ArrayList<String> respostah7 = new ArrayList<String>();

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

	static Boolean hacking8() throws Exception {
		
		ArrayList<String> respostah8 = new ArrayList<String>();

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

	static Boolean hacking9() throws Exception {
		
		ArrayList<String> respostah9 = new ArrayList<String>();

		int resultado, resposta = 2;

		Boolean correto = false;
		
		System.out.println("- Bug matemático -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah9.add("20");
			respostah9.add("1010"); // Correta
			respostah9.add("10,10");
			respostah9.add("Nenhuma das anteriores"); 

			System.out.println("Desafio: Qual é o resultado da união abaixo");
			System.out.println("");
			System.out.println("String r = “10” + “10”;");
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
			System.out.println("Bug resolvido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static Boolean hacking10() throws Exception {
		
		ArrayList<String> respostah10 = new ArrayList<String>();

		int resultado, resposta = 4;

		Boolean correto = false;
		
		System.out.println("- Bug matemático -");
		System.out.println("Resolva o desafio abaixo para prosseguir");
		System.out.println("----------------------");

		do {

			respostah10.add("30");
			respostah10.add("2010"); 
			respostah10.add("20,10");
			respostah10.add("Nenhuma das anteriores"); // Correta

			System.out.println("Desafio: Qual resultado da soma abaixo?");
			System.out.println("");
			System.out.println("int r = 20 + “10”;");
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
			System.out.println("Bug resolvido. Seguindo em frente >>>");
			correto = true;

		}

		return correto;
	}

	static int karen() throws Exception {
		int vidaJogador = 40, defJogador = 12, atkJogador = 60; //declaração da vida e defesa do jogador
		
		System.out.println("----------------------");
		System.out.println("\n"
				+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
				+ "⠄⢀⣀⣀⣀⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⣀⣀⣀⣀⠄\n"
				+ "⠄⢸⣿⣿⣿⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⠄\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣧⣤⣤⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⠛⣤⣤⣼⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣶⣶⣎⣉⣉⣉⡹⠿⠿⣿⣿⡿⠿⠿⣉⣉⣉⣱⣶⣶⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⠛⠛⢣⣤⣤⣿⣿⣧⣤⣤⠛⠛⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⢀⣀⠄⠄⠄⢸⣿⣿⣿⣿⡇⠄⣀⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠄⠄⠄⢸⣿⣿⣿⣿⡇⠄⣿⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣧⡜⠛⠄⠄⢠⣼⣿⣿⣿⣿⣧⣤⠛⠄⠄⢠⣤⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⠿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⣿⠿⢿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⡏⠉⣶⠉⢱⡎⠉⣿⠉⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢱⣶⠉⣶⡎⢹⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⡟⠛⣤⠛⢣⡜⠛⠛⠛⠛⠛⠛⠛⣿⣿⣿⣿⣿⣿⡟⢣⣤⠛⣤⡜⢻⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣷⣶⣉⣶⣎⣱⣶⣀⠄⢰⡆⠄⣶⠉⢉⡉⠉⣉⠉⢱⣎⣉⣶⣉⣱⣾⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⠃⠄⣿⠄⢸⡇⠄⠛⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⣀⣀⣀⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣿\n"
				+ "⣿⡇⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⠄⣿\n"
				+ "⣿⣿⡟⠛⣿⣿⡟⠛⠛⣿⣿⡟⢻⣿⠛⣿⣿⣿⣿⣿⠛⢻⡟⠛⣿⠛⢻⣿⣿⠛⣿⣿⣿⣿⣿⠛⠛⢻⣿⣿\n"
				+ "⣿⣿⡷⠶⣿⠉⢱⣶⣶⠉⣿⡷⢾⣿⠶⣿⣿⣿⣿⣿⠄⢈⡱⠶⣿⠄⢈⡹⠿⠄⣿⣏⣉⣉⣿⣶⡆⢸⣿⣿\n"
				+ "⣿⣿⣧⣤⣿⣤⡜⠛⠛⣤⣿⣧⣼⣿⣤⣿⣿⣿⣿⣿⠄⢸⡇⠄⣿⠄⢸⣧⣤⠄⣿⣿⣿⣿⣿⠛⠃⠘⠛⣿\n"
				+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
		
		Print("\n Karen: Você desvendou o mistério! estou impressionada! \n", TimeUnit.MILLISECONDS, temp_transicao);
		Print("\n Karen: Agora preciso acabar com você para continuar com meus planos! \n", TimeUnit.MILLISECONDS, temp_transicao);
		
		System.out.println("-------COMBATE FINAL INICIADO-------");
		
		int vitoria = 0;
		
		int vidaKaren = 100;
		int defKaren = 8;
		int atkKaren = 55;
		
		System.out.println("A vida do inimigo é " + vidaKaren);

		combat(vidaKaren, defKaren, atkKaren, vidaJogador, defJogador, atkJogador);
		
		Print("\n Karen: NÃAAAAAAAAO VOCÊ ESTRAGOU TUDO! *PANE NO SISTEMA* \n", TimeUnit.MILLISECONDS, temp_transicao);
		Print("\n Auto Falante: Vulnerabilidades detectadas no computador central, O prédio se auto-destruíra em 5... 4... 3... 2... 1... \n", TimeUnit.MILLISECONDS, temp_transicao);
		Print("\n Should I Stay or Should I Go por The Clash - Começa a tocar. \n", TimeUnit.MILLISECONDS, temp_transicao);
		credits();

		vitoria = 1;

		return vitoria;
	}

	public static void main(String args[]) throws Exception {

		int opcao;

		Boolean quit = false;

		do {
			opcao = main();

			switch (opcao) {
			case 1:
				
				controleCidades();
				
				historia();
				
				controleGrajau();
				
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
	
public static void Print(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }
	}
}

