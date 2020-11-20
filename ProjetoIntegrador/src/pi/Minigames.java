package pi;

import java.util.Scanner;

public class Minigames {

	static Scanner input = new Scanner(System.in);

	static Boolean minigame1() {

		int r = 0;
		int resposta = 2;

		Boolean acertou = false;

		System.out.println("Essa porta está dominada por virus, descubra a alternativa correta para limpar o sistema.");

		do {
			System.out.println("O que está faltando na declaração do Array abaixo: ");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - int new [4]; ");
			System.out.println("2 - new int [4];");
			System.out.println("3 - new int [5];");
			System.out.print("Opção: ");
			r = input.nextInt();

		} while (r != resposta);
		if (r == resposta)
			System.out.println("Porta descriptografada");
		System.out.println("");
		acertou = true;

		return acertou;
	}

	static Boolean minigame2() {

		int r = 0;
		int resposta = 1;

		Boolean acertou = false;

		System.out.println("A seguinte matriz 2D está com um valor diferente do padrão dela. "
				+ "Descubra qual coluna e linha o esse caractere diferente está.");
		do {
			System.out.println("");
			System.out.println("Matriz\n"
					+ "##############################################⠄\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⢠⣶⣆⠄⠄⠄⢸⠄⠄⢰⡶⠶⢶⣆⠄⠄⢸⠄⠄⢀⣴⡶⠶⢶⠄⠄⡇⠄⠄⣶⠶⠶⣶⣄⠄ #⠄\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⠄⣾⠁⢿⡄⠄⠄⢸⠄⠄⢸⣇⣀⣠⠟⠄⠄⢸⠄⠄⣾⡏⠄⠄⠄⠄⠄⡇⠄⠄⣿⠄⠄⠄⢹⡇ #⠄\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠄⣾⣧⣤⣼⣿⡄⠄⢸⠄⠄⢸⡏⠉⠉⣿⡆⠄⢸⠄⠄⢿⣇⠄⠄⠄⠄⠄⡇⠄⠄⣿⠄⠄⠄⣸⡇ #⠄\r\n"
					+ "#⠄⠄⠄⠄⠄⠄⠄⢸⠄⠄⠸⠿⠄⠄⠄⠻⠧⠄⢸⠄⠄⠸⠷⠶⠶⠟⠁⠄⢸⠄⠄⠘⠿⠶⠶⠶⠄⠄⡇⠄⠄⠿⠶⠶⠾⠛⠁ #⠄\r\n"
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
					+ "#⠤⠤⠤⠤⠤⠤⠤⢸⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⢼⠤⠤⠤⠤⠤⠤⠤⠤⠤⢼⠤⠤⠤⠤⠤⠤⠤⠤⠤⡧⠤⠤⠤⠤⠤⠤⠤⠤⠤#\r\n"
					+ "#⠄⠄⠄⢀⣀⡀⠄⢸⠄⠄⠄⠄⢀⣀⣀⠄⠄⠄⢸⠄⠄⠄⢀⣀⣀⡀⠄⠄⢸⠄⠄⠄⣀⣀⣀⠄⠄⠄⡇⠄⠄⠄⢀⣀⣀⠄⠄⠄#\r\n"
					+ "#⠄⠄⢠⡼⢻⡇⠄⢸⠄⠄⠄⣠⡿⠉⠻⣷⠄⠄⢸⠄⠄⢠⡾⠋⠙⣷⠄⠄⢸⠄⠄⣴⡟⠉⢻⣆⠄⠄⡇⠄⠄⢠⡟⠉⢻⣷⠄⠄#\r\n"
					+ "#⠄⢠⠏⠁⢸⡇⠄⢸⠄⠄⠄⣿⡇⠄⠄⣿⡇⠄⢸⠄⠄⢸⡇⠄⠄⣿⡇⠄⢸⠄⠄⣿⠄⠄⢸⣿⠄⠄⡇⠄⠄⣾⡇⠄⢸⣿⠄⠄#\r\n"
					+ "#⠄⠻⠿⠿⢿⡿⠄⢸⠄⠄⠄⠻⣧⠄⣰⣿⠄⠄⢸⠄⠄⠸⣧⠄⢀⣿⠄⠄⢸⠄⠄⢿⣆⠄⣸⡏⠄⠄⡇⠄⠄⢸⣇⠄⣸⡿⠄⠄#\r\n"
					+ "##############################################\r\n");
			System.out.println("");
			System.out.println("1 - Coluna D, Linha 3");
			System.out.println("2 - Coluna C, Linha 3");
			System.out.println("3 - Coluna B, Linha 1");
			System.out.println("4 - Coluna A, Linha 4");
			System.out.print("");
			r = input.nextInt();

		} while (r != resposta);
		if (r == resposta)
			System.out.println("Você encontrou a obstrução na matriz!");
		System.out.println("");
		acertou = true;

		return acertou;
	}

	static Boolean minigame3() {

		int r = 0;
		int resposta = 3;

		Boolean acertou = false;

		System.out.println("Essa porta está dominada por virus, descubra a alternativa correta para limpar o sistema.");

		do {
			System.out.println("Sys***.out.*******(“TESTE”); ");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - Sys.out.print(“TESTE”);");
			System.out.println("2 - System.out.printf(“TESTE”);");
			System.out.println("3 - System.out.println(“TESTE”);");
			System.out.print("Opção: ");
			r = input.nextInt();

		} while (r != resposta);
		if (r == resposta)
			System.out.println("Porta descriptografada");
		System.out.println("");
		acertou = true;

		return acertou;
	}

	public static void main(String args[]) {

		Boolean r = minigame1(), r1 = minigame2(), r2 = minigame3(), r3 = minigame4, r4 = minigame5(), r5 = minigame6(), r6 = minigame7(),
		r7 = minigame8(), r8 = minigame9(), r9 = minigame10(), r10 = minigame11(), r11 = minigame12(), r12 = minigame13(), r13 = minigame14(),
		r14 = minigame15(), r15 = minigame16(), r16 = minigame17(), r17 = minigame18(), r18 = minigame19(), r19 = minigame20(), r20 = minigame21();
			
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
	}

}
