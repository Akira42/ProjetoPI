package pi;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class cyberNoir {
	static int temp_dialog = 25, temp_narrativa = 50, temp_transicao = 80;

	static Scanner input = new Scanner(System.in);

	static int main() throws Exception {

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

	static String insertionName() throws Exception {

		String name;

		System.out.println("----------------------");
		System.out.println("Bem vindo Jogador");
		System.out.print("Qual seu nickname?: ");
		name = input.next();

		return name;
	}

	static void credits() throws Exception {

		System.out.println("----------------------");
		System.out.println("Créditos a Grupo 10 - Xiaomeiros");
		System.out.println("\n Vitor Akira\n João Maziteli\n Tainara Almeida\n Matheus Alencar\n");
		System.out.println("Developed in Java ");
		System.out.println("----------------------");
	}

	static int iniciar() throws Exception {

		int opcaoC;

		do {
			System.out.println("----------------------");
			System.out.println("1 - Iniciar história");
			System.out.println("----------------------");
			opcaoC = input.nextInt();
		} while (opcaoC < 1 || opcaoC > 2);

		return opcaoC;
	}

	static void historia() throws Exception {
        
		String nomeJogador = insertionName();
		
		Print("----------------------", TimeUnit.MILLISECONDS, temp_dialog);	
		Print("\n\nCaro "+nomeJogador+" seja bem vindo de volta ao escritório, nosso departamento policial "
                        +"ficou uma bagunça desde que você entrou de férias. ", TimeUnit.MILLISECONDS, temp_narrativa);
                Print("\nMuitos casos desaparecimentos e algumas coisas estranhas começaram acontecer em "
                        + "algumas cidades da região!", TimeUnit.MILLISECONDS, temp_narrativa);
                Print("\nVamos precisar de você bem focado nessa missão, poís não será nada fácil.", TimeUnit.MILLISECONDS, temp_narrativa);
                Print("\nA propósito a Karen está com saudade de você, quase toda dia ela perguntava se você "
                        + "estava bem.", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n\n***Você vai para a sua sala***\n\n", TimeUnit.MILLISECONDS, temp_transicao);
                
                Print(nomeJogador+"\n: Olá Karen, quanto tempo! Como você está?", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n\n***Karen é sua assistente pessoal, ela é uma inteligencia artificial.***\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
                
                //ASCI KAREN FELIZ!!!!
                                
                Print("\nKaren: Olá "+nomeJogador+" como você está?", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n"+nomeJogador+": Eu estou bem, fiquei sabendo que a situação não está muito boa na região,"
                        + "poderia separar uma lista de ditritos aonde eu preciso passar?", TimeUnit.MILLISECONDS, temp_narrativa);        

                Print("\nKaren: É bom te ter devolta!!!", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\nKaren: Estou providênciando uma lista agora mesmo, vou traçar uma rota para você e todos os distritos que você precisar investigar!", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\n"+nomeJogador+": Valeu Karen!!!", TimeUnit.MILLISECONDS, temp_narrativa);
                
                Print("\nKaren: Distrito: Grajaú"
                        + "\nDistrito: Taboão"
                        + "\nCada cidade tem 3 casos e cada caso 3 e 5 hackings, e todos tem 3 combates!", TimeUnit.MILLISECONDS, temp_narrativa);
 
	}
	
	static int grajau() throws Exception {

		int opcaoG;

		do {
			
			Print("\n ---------------------- \n Grajaú \n", TimeUnit.MILLISECONDS, temp_dialog);
			Print("O lugar onde o crime vive de dia ou de noite... (Breve resumo do Grajaú) \n", TimeUnit.MILLISECONDS, temp_narrativa);
			Print("1 - Iniciar casos Grajaú \n ---------------------- \n", TimeUnit.MILLISECONDS, temp_dialog);
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
			int vidaJogador = 10, defJogador = 0, atkJogador = 20; //declaração da vida e defesa do jogador
			//CASO 1 Grajau

			Boolean correto = hacking1();
			
			if (correto == true) {
				int vidaInimigo1_C1 = 10;
				int defInimigo1_C1 = 0;
				int atkInimigo1_C1 = 20;		
				
				System.out.println("----------------------");
				Print("\n Narração: ao entrar no local, você se vê dois homens estranhos: \n", TimeUnit.MILLISECONDS, temp_narrativa);
				System.out.println("----------------------");
				
				System.out.println("\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
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
						+ "⠉⠉⠉⠉⠉⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠉⠉⠉⠉⠉\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				
				System.out.println("----------------------");
				Print("\n Bandido 1: Tá fazendo oque aqui rapá? dando mole essas horas no Grajaú fi? \n", TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println("----------------------");
				Print("\n Você: Cai fora, não quero confusão. \n", TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println("----------------------");
				Print("\n Bandido 2: já arrumou uma parceiro! \n", TimeUnit.MILLISECONDS, temp_dialog);
				
				System.out.println("---------------------- \n* Combate Iniciado *");
				System.out.println("A vida do inimigo é " + vidaInimigo1_C1);

				
				Boolean correto2 = combat(vidaInimigo1_C1, defInimigo1_C1, atkInimigo1_C1, vidaJogador, defJogador, atkJogador);
				
				if (correto2 == true) {
					System.out.println("----------------------");
					Print("Você encontra outro inimigo a frente... \n", TimeUnit.MILLISECONDS, temp_narrativa);
					System.out.println("----------------------");
					int vidaInimigo2_C1 = 10;
					int defInimigo2_C1 = 0;
					int atkInimigo2_C1 = 20;
					
					Print("Narração: \n", TimeUnit.MILLISECONDS, temp_narrativa);
					System.out.println("----------------------");

					Boolean correto3 = combat(vidaInimigo2_C1, defInimigo2_C1, atkInimigo2_C1, vidaJogador, defJogador, atkJogador);

					Print("Narração: Ao entrar mais á fundo, você vê uma cena de crime, \n", TimeUnit.MILLISECONDS, temp_narrativa);
					Print("um corpo de uma vítima dada como desaparecida está em uma cama no canto gélido quarto escuro. \n", TimeUnit.MILLISECONDS, temp_narrativa);
					Print("você vê um terminal, ele está bloqueado, você precisa hackea-lo \n", TimeUnit.MILLISECONDS, temp_narrativa);
					System.out.println("----------------------");
				
					System.out.println("----------------------");
					Print("Narração: Ao conseguir os dados, você ouve passos fora do quarto, é o líder daquela gangue! \n", TimeUnit.MILLISECONDS, temp_narrativa);
					System.out.println("----------------------");
					System.out.println("\n"
							+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠛⠛⠛⠛⠛\r\n" +
							"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
					
					System.out.println("---------------------- \n");
					Print("O Grande Khan: Acha mesmo que pode entrar aqui, atirar nos meus homens e ficar por isso mesmo? HAHAHA \n", TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println("---------------------- \n* Combate Iniciado *\n ----------------------");
					
					if (correto3 == true) {

						int vidaBoss_C1 = 20;
						int defBoss_C1 = 2;
						int atkBoss_C1 = 25;

						Boolean Finalizado = combat(vidaBoss_C1, defBoss_C1, atkBoss_C1, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							
							Print("Esse caso foi finalizado! \n", TimeUnit.MILLISECONDS, temp_narrativa);
							System.out.println("----------------------");
							Print("Você ganhou 5 pontos de vida e 2 de defesa adicionais! \\n Agora você tem 15 pontos de vida e 2 de defesa!", TimeUnit.MILLISECONDS, temp_narrativa);
							System.out.println("----------------------");
							
							System.out.println("----------------------");
							Print("Narração: ", TimeUnit.MILLISECONDS, temp_narrativa);
							System.out.println("----------------------");
						}
					}
				}
			}
			
			//CASO 2 Grajau
			vidaJogador = 15; //reseta vida e defesa do jogador
			defJogador = 2;
			atkJogador = 25;
			
			Boolean corretog1 = hacking2();
			if (corretog1 == true) {
				int vidaInimigo1_C2 = 15;
				int defInimigo1_C2 = 0;
				int atkInimigo1_C2 = 20;

				System.out.println("\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
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
						+ "⠉⠉⠉⠉⠉⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠉⠉⠉⠉⠉\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
				System.out.println("----------------------");
				Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

				Boolean corretog2 = combat(vidaInimigo1_C2, defInimigo1_C2, atkInimigo1_C2, vidaJogador, defJogador, atkJogador);

				if (corretog2 == true) {

					int vidaInimigo2_C2 = 15;
					int defInimigo2_C2 = 0;
					int atkInimigo2_C2 = 20;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretog3 = combat(vidaInimigo2_C2, defInimigo2_C2, atkInimigo2_C2, vidaJogador, defJogador, atkJogador);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");
					
					System.out.println("\n"
							+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
							"⠉⠉⠉⠉⠉⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠉⠉⠉⠉⠉"
							+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
					System.out.println("----------------------");
					Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao


					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretog3 == true) {
					
						int vidaBoss_C2 = 25;
						int defBoss_C2 = 4;
						int atkBoss_C2 = 25;

						Boolean Finalizado = combat(vidaBoss_C2, defBoss_C2, atkBoss_C2, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");
							System.out.println("Você ganhou 5 pontos de vida e 2 de defesa adicionais! \n Agora você tem 20 pontos de vida e 4 de defesa!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}
			
			hacking3();
			
			hacking4();

			//CASO 3 Grajau
			vidaJogador = 20; //reseta vida e defesa do jogador
			defJogador = 4;
			atkJogador = 30;
				
			Boolean corretogg1 = hacking5();
			if (corretogg1 == true) {
				int vidaInimigo1_C3 = 15;
				int defInimigo1_C3 = 4;
				int atkInimigo1_C3 = 25;
				
				System.out.println("\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
						"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣤⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠛⠛⠛⠛⠛\r\n" +
						"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
				System.out.println("----------------------");
				Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao
				
				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean corretogg2 = combat(vidaInimigo1_C3, defInimigo1_C3, atkInimigo1_C3, vidaJogador, defJogador, atkJogador);

				if (corretogg2 == true) {

					int vidaInimigo2_C3 = 15;
					int defInimigo2_C3 = 4;
					int atkInimigo2_C3 = 25;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretogg3 = combat(vidaInimigo2_C3, defInimigo2_C3, atkInimigo2_C3, vidaJogador, defJogador, atkJogador );

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					System.out.println("\n"
							+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\r\n" +
							"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("----------------------");
					Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao
					
					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretogg3 == true) {

						int vidaBoss_C3 = 35;
						int defBoss_C3 = 4;
						int atkBoss_C3 = 35;

						Boolean Finalizado = combat(vidaBoss_C3, defBoss_C3, atkBoss_C3, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");
							System.out.println("Você ganhou 5 pontos de vida e 2 de defesa adicionais! \n Agora você tem 25 pontos de vida e 6 de defesa!");
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
	
	//casos taboao

	static int controleTaboao() throws Exception{

		int opcaoT = taboao();

		Boolean sair = false;

		do {
			int vidaJogador = 25, defJogador = 6, atkJogador = 35; //declaração da vida e defesa do jogador
			//CASO 1 TABOAO

			Boolean correto1 = hacking6();
			if (correto1 == true) {
				int vidaInimigo1_C4 = 20;
				int defInimigo1_C4 = 6;
				int atkInimigo1_C4 = 35;
				
				System.out.println("\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
						"⠉⠉⠉⠉⠉⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⠉⠁⠄⠄⠄⠉⠉⠉⠉⠉"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
				System.out.println("----------------------");
				Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean correto2 = combat(vidaInimigo1_C4, defInimigo1_C4, atkInimigo1_C4, vidaJogador, defJogador, atkJogador);

				if (correto2 == true) {

					int vidaInimigo2_C4 = 20;
					int defInimigo2_C4 = 6;
					int atkInimigo2_C4 = 35;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean correto3 = combat(vidaInimigo2_C4, defInimigo2_C4, atkInimigo2_C4, vidaJogador, defJogador, atkJogador);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");
					
					System.out.println("\n"
							+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\r\n" +
							"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("----------------------");
					Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (correto3 == true) {

						int vidaBoss_C4 = 50;
						int defBoss_C4 = 8;
						int atkBoss_C4 = 35;

						Boolean Finalizado = combat(vidaBoss_C4, defBoss_C4, atkBoss_C4, vidaJogador, defJogador, atkJogador );

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");
							System.out.println("Você ganhou 5 pontos de vida e 2 de defesa adicionais! \n Agora você tem 30 pontos de vida e 8 de defesa!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}

			hacking7();

			hacking8();

			//CASO 2 TABOAO
			vidaJogador = 30; //reseta vida e defesa do jogador
			defJogador = 8;
			atkJogador = 40;
			
			Boolean corretot1 = hacking9();
			if (corretot1 == true) {
				int vidaInimigo1_C5 = 25;
				int defInimigo1_C5 = 6;
				int atkInimigo1_C5 = 35;
				
				System.out.println("\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
						"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\r\n" +
						"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("----------------------");
				Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");

				Boolean corretot2 = combat(vidaInimigo1_C5, defInimigo1_C5, atkInimigo1_C5, vidaJogador, defJogador, atkJogador);

				if (corretot2 == true) {

					int vidaInimigo2_C5 = 25;
					int defInimigo2_C5 = 6;
					int atkInimigo2_C5 = 35;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretot3 =combat(vidaInimigo2_C5, defInimigo2_C5, atkInimigo2_C5, vidaJogador, defJogador, atkJogador);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");
					
					System.out.println("\n"
							+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
							"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\r\n" +
							"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					System.out.println("----------------------");
					Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretot3 == true) {

						int vidaBoss_C5 = 60;
						int defBoss_C5 = 8;
						int atkBoss_C5 = 45;

						Boolean Finalizado = combat(vidaBoss_C5, defBoss_C5, atkBoss_C5, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");
							System.out.println("Você ganhou 5 pontos de vida e 2 de defesa adicionais! \n Agora você tem 35 pontos de vida e 10 de defesa!");
							System.out.println("----------------------");

							System.out.println("----------------------");
							System.out.println("Narração: ");
							System.out.println("----------------------");

						}
					}
				}
			}
			
			//CASO 3 TABOAO
			vidaJogador = 35; //reseta vida e defesa do jogador
			defJogador = 10;
			atkJogador = 40;
			
			Boolean corretott1 = hacking10();
			if (corretott1 == true) {
				int vidaInimigo1_C6 = 30;
				int defInimigo1_C6 = 6;
				int atkInimigo1_C6 = 35;
				
				System.out.println("\n"
						+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
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
						"⠛⠛⠛⠛⠛⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠛⠛⠛⠛\r\n" +
						"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("----------------------");
				Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

				System.out.println("----------------------");
				System.out.println("Narração: ");
				System.out.println("----------------------");
				
				Boolean corretott2 = combat(vidaInimigo1_C6, defInimigo1_C6, atkInimigo1_C6, vidaJogador, defJogador, atkJogador);

				if (corretott2 == true) {

					int vidaInimigo2_C6 = 30;
					int defInimigo2_C6 = 6;
					int atkInimigo2_C6 = 35;

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					Boolean corretott3 = combat(vidaInimigo2_C6, defInimigo2_C6, atkInimigo2_C6, vidaJogador, defJogador, atkJogador);

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					System.out.println("----------------------");
					System.out.println("Narração: ");
					System.out.println("----------------------");

					if (corretott3 == true) {
						
						System.out.println("\n"
								+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" +
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⢇⡀⠄⣀⣀⣀⣀⣀⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠉⢱⣶⠄⣶⡎⢱⣶⠉⣿⣿⣿⣿⣶⣶⣶⡎⠉⠉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⡟⠛⠄⠄⠘⢣⣤⠛⣤⡜⢣⣤⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⡜⢻⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⡏⠁⠄⠄⠄⠄⠈⠉⠶⣉⡱⢎⣉⠶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡎⠉⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⠛⠃⠄⠄⠄⠄⠄⠄⠄⠄⠛⢣⡜⠛⣤⠛⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⠛⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⠿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡸⠿⣀⠿⢿⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⠄⠿⢿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⢰⣶⣶⠄⠈⢱⣶⠉⣶⣾⣿⣿⠉⣶⣶⡎⠉⠉⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⣤⣼⣿⣿⣿⣿⡇⢠⣤⠛⣤⣼⡇⠄⣿⣿⣿⣿⣿⣤⠛⢻⣿⣿⠄⠄⢸⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠿⢿⣿⣿⣿⠿⠇⠈⠉⠶⣉⣹⣇⣀⠿⣿⣿⣿⣿⠿⣀⣸⣿⣿⠄⠄⢸⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠘⠛⠛⠛⠄⠄⠄⠄⣤⠛⢻⣿⣿⣤⠛⠛⠛⠛⣤⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⢸⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⠄⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣶⣾⣿⣿⣿⡿⠏⠉⣉⠉⠉⠁⠄⣀⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣧⡄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⢻⣿⣿⠛⠛⠃⢠⣤⣿⠄⠄⢠⣤⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣇⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠿⠄⠄⢀⣸⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣶⣾⡇⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⢠⣤⠄⣤⣤⣤⣤⣿⠛⢣⣼⣿⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⣀⡀⠈⠉⠶⠉⠹⠿⠿⣉⠄⢸⣿⣿⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠛⢣⡄⠄⠄⣤⡄⢠⣤⣿⠄⢸⣿⣿⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + 
								"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
						System.out.println("----------------------");
					
						
						Print("", TimeUnit.MILLISECONDS, temp_dialog); // narrativa/dialog/transicao

						int vidaBoss_C6 = 70;
						int defBoss_C6 = 8;
						int atkBoss_C6 = 50;
						
						Boolean Finalizado = combat(vidaBoss_C6, defBoss_C6, atkBoss_C6, vidaJogador, defJogador, atkJogador);

						if (Finalizado == true) {
							System.out.println("Esse caso foi finalizado!");
							System.out.println("----------------------");
							System.out.println("Você ganhou 5 pontos de vida e 2 de defesa adicionais! \n Agora você tem 40 pontos de vida e 12 de defesa!");
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

	//Função combate 
	static Boolean combat( double vidaInimigo, float defInimigo, int atkInimigo, double vidaJogador, float defJogador, int atkJogador) throws Exception {

		// vida e defesa do inimigo
		double vidaJogadorBckp = vidaJogador, vidaInimigoBckp = vidaInimigo;
		int escolhaAtk = 0;
		double atkJ, atkI;

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
				atkJ = dado.nextInt(atkJogador) + dado.nextInt(8); // pistola 9mm

			case (2):
				atkJ = dado.nextInt(atkJogador) + dado.nextInt(6) + dado.nextInt(6); // corpo á corpo

			default:
				atkJ = dado.nextInt(atkJogador); // faca
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
		System.out.println("Resolve o desafio abaixo para prosseguir");
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
		int vidaJogador = 40, defJogador = 12, atkJogador = 50; //declaração da vida e defesa do jogador
		
		
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
		System.out.println("HAHAHA Acha mesmo que pode me derrotar detetive? veremos...");
		System.out.println("----------------------");
		System.out.println("--------COMBATE INICIADO-------");
		
		int vitoria = 0;
		
		int vidaKaren = 100;
		int defKaren = 10;
		int atkKaren = 55;
		
		System.out.println("A vida do inimigo é " + vidaKaren);

		System.out.println("----------------------");
		System.out.println("Seguindo em frente");
		System.out.println("----------------------");

		combat(vidaKaren, defKaren, atkKaren, vidaJogador, defJogador, atkJogador);

		vitoria = 1;

		return vitoria;
	}

	public static void main(String args[]) throws Exception {

		int opcao;

		int escolha = 0, escolha2 = 0;

		Boolean quit = false, quit2 = false;

		do {
			opcao = main();

			switch (opcao) {
			case 1:
				
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
	
public static void Print(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
        }
	}
}

