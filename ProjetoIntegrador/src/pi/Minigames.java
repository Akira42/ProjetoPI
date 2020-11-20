package pi;

import java.util.Scanner;

public class Minigames {

	static Scanner input = new Scanner(System.in);

	static Boolean minigame1() {

		int r = 0;
		int resposta = 2;

		Boolean acertou = false;

		System.out.println("Essa porta estÃ¡ dominada por virus, descubra a alternativa correta para limpar o sistema.");

		do {
			System.out.println("O que estÃ¡ faltando na declaraÃ§Ã£o do Array abaixo: ");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - int new [4];");
			System.out.println("2 - new int [4];");
			System.out.println("3 - new int [5];");
			System.out.print("OpÃ§Ã£o: ");
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

		System.out.println("A seguinte matriz 2D estÃ¡ com um valor diferente do padrÃ£o dela. "
				+ "Descubra qual coluna e linha o esse caractere diferente estÃ¡.");
		do {
			System.out.println("");
			System.out.println("Matriz\n"
					+ "##############################################â „\r\n"
					+ "#â „â „â „â „â „â „â „â¢¸â „â „â „â „â¢ â£¶â£†â „â „â „â¢¸â „â „â¢°â¡¶â ¶â¢¶â£†â „â „â¢¸â „â „â¢€â£´â¡¶â ¶â¢¶â „â „â¡‡â „â „â£¶â ¶â ¶â£¶â£„â „ #â „\r\n"
					+ "#â „â „â „â „â „â „â „â¢¸â „â „â „â „â£¾â �â¢¿â¡„â „â „â¢¸â „â „â¢¸â£‡â£€â£ â Ÿâ „â „â¢¸â „â „â£¾â¡�â „â „â „â „â „â¡‡â „â „â£¿â „â „â „â¢¹â¡‡ #â „\r\n"
					+ "#â „â „â „â „â „â „â „â¢¸â „â „â „â£¾â£§â£¤â£¼â£¿â¡„â „â¢¸â „â „â¢¸â¡�â ‰â ‰â£¿â¡†â „â¢¸â „â „â¢¿â£‡â „â „â „â „â „â¡‡â „â „â£¿â „â „â „â£¸â¡‡ #â „\r\n"
					+ "#â „â „â „â „â „â „â „â¢¸â „â „â ¸â ¿â „â „â „â »â §â „â¢¸â „â „â ¸â ·â ¶â ¶â Ÿâ �â „â¢¸â „â „â ˜â ¿â ¶â ¶â ¶â „â „â¡‡â „â „â ¿â ¶â ¶â ¾â ›â � #â „\r\n"
					+ "#â ’â ’â ’â ’â ’â ’â ’â¢¸â ’â ’â ’â ’â ’â ’â ’â ’â ’â ’â¢ºâ ’â ’â ’â ’â ’â ’â ’â ’â ’â¢ºâ ’â ’â ’â ’â ’â ’â ’â ’â ’â¡—â ’â ’â ’â ’â ’â ’â ’â ’â ’#\r\n"
					+ "#â „â „â „â¢ â¡„â „â „â¢¸â „â „â „â „â¢€â£¤â£„â „â „â „â¢¸â „â „â „â¢€â£¤â£¤â¡€â „â „â¢¸â „â „â „â£€â£¤â£„â „â „â „â¡‡â „â „â „â¢€â£¤â£„â „â „â „#\r\n"
					+ "#â „â „â šâ¢¹â¡‡â „â „â¢¸â „â „â „â£°â¡Ÿâ ‰â ¹â£¿â „â „â¢¸â „â „â¢°â¡Ÿâ ‰â ‰â£¿â „â „â¢¸â „â „â£¼â Ÿâ ‰â¢¹â£§â „â „â¡‡â „â „â¢°â¡Ÿâ ‰â¢¹â£·â „â „#\r\n"
					+ "#â „â „â „â¢¸â¡‡â „â „â¢¸â „â „â „â£¿â¡‡â „â „â£¿â ‡â „â¢¸â „â „â¢¸â¡‡â „â „â£¿â ‡â „â¢¸â „â „â£¿â „â „â¢¸â£¿â „â „â¡‡â „â „â¢¿â¡‡â „â¢¸â£¿â „â „#\r\n"
					+ "#â „â „â£€â£¸â£‡â£€â „â¢¸â „â „â „â ¹â£§â£€â£¸â¡¿â „â „â¢¸â „â „â ¸â£§â£€â£ â¡¿â „â „â¢¸â „â „â¢»â£§â£€â£¸â �â „â „â¡‡â „â „â ¸â£§â£€â£¸â¡¿â „â „#\r\n"					
					+ "#â£€â£€â£€â£€â£€â£€â£€â¢¸â£€â£€â£€â£€â£€â£€â£€â£€â£€â£€â£¸â£€â£€â£€â£€â£€â£€â£€â£€â£€â£¸â£€â£€â£€â£€â£€â£€â£€â£€â£€â£‡â£€â£€â£€â£€â£€â£€â£€â£€â£€#\r\n"
					+ "#â „â °â Ÿâ ›â¢¿â£†â „â¢¸â „â „â „â¢€â£¾â ›â¢»â£¦â „â „â¢¸â „â „â¢€â£¾â ›â »â£§â „â „â¢¸â „â „â£ â¡¿â ›â¢¿â¡„â „â „â¡‡â „â „â¢ â¡¾â ›â¢»â£¦â „â „#\r\n"
					+ "#â „â „â „â¢€â£¾â �â „â¢¸â „â „â „â£¿â¡‡â „â „â£¿â¡†â „â¢¸â „â „â¢¸â¡‡â „â „â£¿â¡†â „â¢¸â „â „â£¿â „â „â¢¸â£¿â „â „â¡‡â „â „â£¼â¡‡â „â¢¸â£¿â „â „#\r\n"
					+ "#â „â „â£´â¡Ÿâ �â „â „â¢¸â „â „â „â¢¿â£‡â „â¢ â£¿â �â „â¢¸â „â „â¢¸â£‡â „â „â£¿â �â „â¢¸â „â „â£¿â¡„â „â¢¸â¡Ÿâ „â „â¡‡â „â „â¢¹â¡‡â „â¢¸â£¿â „â „#\r\n"
					+ "#â „â ˜â ›â ›â ›â ›â „â¢¸â „â „â „â „â ›â ²â ›â �â „â „â¢¸â „â „â „â ›â ²â šâ ‹â „â „â¢¸â „â „â ˆâ ›â ¶â ›â �â „â „â¡‡â „â „â ˆâ ›â ¶â ›â �â „â „#\r\n" 
					+ "#â ‰â ‰â ‰â ‰â ‰â ‰â ‰â¢¸â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â¢¹â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â¢¹â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â¡�â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰â ‰#\r\n"
					+ "#â „â¢ â£´â£¶â£¦â¡„â „â¢¸â „â „â „â „â£¤â£¶â£¦â¡„â „â „â¢¸â „â „â „â£¤â£¶â£¶â£„â „â „â¢¸â „â „â¢€â£¤â£¶â£¦â¡€â „â „â¡‡â „â „â „â¢ â£´â¡†â „â „â „#\r\n"
					+ "#â „â ˆâ „â¢€â£¸â ‡â „â¢¸â „â „â „â£¼â¡�â „â ˜â£¿â¡€â „â¢¸â „â „â¢¸â¡�â „â „â£¿â¡€â „â¢¸â „â „â£¾â ‹â „â¢¸â£·â „â „â¡‡â „â „â „â ‰â£¿â¡‡â „â „â „#\r\n"
					+ "#â „â „â ‰â ‰â¢»â£¦â „â¢¸â „â „â „â£¿â¡‡â „â „â£¿â ƒâ „â¢¸â „â „â¢¸â¡‡â „â „â£¿â ƒâ „â¢¸â „â „â£¿â¡€â „â¢¸â£¿â „â „â¡‡â „â „â „â „â£¿â¡‡â „â „â „#\r\n"
					+ "#â „â  â£¤â£¤â£¼â Ÿâ „â¢¸â „â „â „â ˜â¢¿â£¤â¡¼â Ÿâ „â „â¢¸â „â „â ˜â¢¿â£¤â£´â Ÿâ „â „â¢¸â „â „â ¹â£·â£¤â¡¼â ƒâ „â „â¡‡â „â „â „â£¤â£¿â£§â£¤â „â „#\r\n"
					+ "#â ¤â ¤â ¤â ¤â ¤â ¤â ¤â¢¸â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â¢¼â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â¢¼â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â¡§â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤â ¤#\r\n"
					+ "#â „â „â „â¢€â£€â¡€â „â¢¸â „â „â „â „â¢€â£€â£€â „â „â „â¢¸â „â „â „â¢€â£€â£€â¡€â „â „â¢¸â „â „â „â£€â£€â£€â „â „â „â¡‡â „â „â „â¢€â£€â£€â „â „â „#\r\n"
					+ "#â „â „â¢ â¡¼â¢»â¡‡â „â¢¸â „â „â „â£ â¡¿â ‰â »â£·â „â „â¢¸â „â „â¢ â¡¾â ‹â ™â£·â „â „â¢¸â „â „â£´â¡Ÿâ ‰â¢»â£†â „â „â¡‡â „â „â¢ â¡Ÿâ ‰â¢»â£·â „â „#\r\n"
					+ "#â „â¢ â �â �â¢¸â¡‡â „â¢¸â „â „â „â£¿â¡‡â „â „â£¿â¡‡â „â¢¸â „â „â¢¸â¡‡â „â „â£¿â¡‡â „â¢¸â „â „â£¿â „â „â¢¸â£¿â „â „â¡‡â „â „â£¾â¡‡â „â¢¸â£¿â „â „#\r\n"
					+ "#â „â »â ¿â ¿â¢¿â¡¿â „â¢¸â „â „â „â »â£§â „â£°â£¿â „â „â¢¸â „â „â ¸â£§â „â¢€â£¿â „â „â¢¸â „â „â¢¿â£†â „â£¸â¡�â „â „â¡‡â „â „â¢¸â£‡â „â£¸â¡¿â „â „#\r\n"
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
			System.out.println("VocÃª encontrou a obstruÃ§Ã£o na matriz!");
		System.out.println("");
		acertou = true;

		return acertou;
	}

	static Boolean minigame3() {

		int r = 0;
		int resposta = 3;

		Boolean acertou = false;

		System.out.println("Essa porta estÃ¡ dominada por virus, descubra a alternativa correta para limpar o sistema.");

		do {
			System.out.println("Sys***.out.*******(â€œTESTEâ€�); ");
			System.out.println("");
			System.out.println("int nomeArray [] = *** *** [*]; ");
			System.out.println("");
			System.out.println("1 - Sys.out.print(â€œTESTEâ€�);");
			System.out.println("2 - System.out.printf(â€œTESTEâ€�);");
			System.out.println("3 - System.out.println(â€œTESTEâ€�);");
			System.out.print("OpÃ§Ã£o: ");
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
