package tsduhn;
import java.util.Scanner;
import java.util.Random;

public class jogooo {
	private static final int BOARD_SIZE = 30;
	private static final Random rand = new Random();
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int p1p = 0;
		int p2p = 0;
		boolean p1t = true;
		
		System.out.println("Bem-vindo ao Jogo de tabuleiro: Detroit: Become Human! ");
		
		do {
			System.out.println((p1t ? "Kara" : "Markus") + ", é sua vez! Pressione Enter para rolar o dado! ");
			scanner.nextLine();
			int diceRoll = rollDice();
			System.out.println("Você rolou um " + diceRoll + "!");
			
			if (p1t) {
				p1p += diceRoll;
				p1p = checkSpecialTile(p1p);
				System.out.println("Kara está na posição: " + p1p);
			} else {
				p2p += diceRoll;
				p2p = checkSpecialTile(p2p);
				System.out.println("Markus está na posição: " + p2p);
			}
			if (p1p >= BOARD_SIZE) {
				System.out.println("Kara venceu o jogo alcançamdo a casa 30! ");
				break;
			} else if (p2p >= BOARD_SIZE) {
				System.out.println("Markus venceu o jogo alcançando a casa 30! ");
				break;
			}
			p1t = !p1t;
		} while (p1p < BOARD_SIZE && p2p < BOARD_SIZE);
		System.out.println("Fim do jogo!");
	}
	private static int rollDice() {
		return rand.nextInt(6) + 1;
	}
private static int checkSpecialTile(int position) {
	if (position > BOARD_SIZE) {
		return BOARD_SIZE;
	}
	switch (position) {
	case 1:
		System.out.println("Kara e Markus escapam de seus respectivos destinos.");
		position += 0;
		break;
	case 2:
		System.out.println("Esconda-se de seus perseguidores, casa sem efeito.");
		position += 0;
		break;
	case 5:
		System.out.println("Passe despercebido, casa sem efeito.");
		position += 0;
		break;
	case 8:
		System.out.println("Tome cuidado! Zona de risco, casa sem efeito.");
		position += 0;
		break;
	case 11:
		System.out.println("Lar temporário, casa sem efeito.");
		position += 0;
		break;
	case 14:
		System.out.println("Momento de descanso, casa sem efeito.");
		position += 0;
		break;
	case 17:
		System.out.println("Caminho tranquilo, casa sem efeito.");
		position += 0;
		break;
	case 20:
		System.out.println("Navegando por um complexo industrial, casa sem efeito,");
		position += 0;
		break;
	case 23:
		System.out.println("Organizando manifestação, casa sem efeito.");
		position += 0;
		break;
	case 26:
		System.out.println("Refugiam-se no subsolo, casa sem efeito.");
		position += 0;
		break;
	case 29:
		System.out.println("Caminho final! Casa sem efeito.");
		position += 0;
		break;
	case 3:
		System.out.println("Você encontrou recursos, avance 2 casas.");
		position += 3;
		break;
	case 6:
		System.out.println("Conheceu um amigo android. Avance 3 casas.");
		position += 3;
		break;
	case 9:
		System.out.println("Achou um esconderijo! Avance 3 casas.");
		position += 3;
		break;
	case 12:
		System.out.println("Encontrou androides! Avance 3 casas.");
		position += 3;
		break;
	case 15:
		System.out.println("Hackeou um terminal! Avance 3 casas.");
		position += 3;
		break;
	case 18:
		System.out.println("Recursos! Avance 3 casas.");
		position += 3;
		break;
	case 21:
		System.out.println("Encontrou abrigo! Avance 3 casas.");
		position += 3;
		break;
	case 24:
		System.out.println("Achou informações valiosas! Avance 3 casas.");
		position += 3;
		break;
	case 27:
		System.out.println("Recebem ajuda! Avance 3 casas.");
		position += 3;
		break;
	case 4:
		System.out.println("Uma patrulha policial! Volte ao início. ");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 7:
		System.out.println("Foi capturado! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 10:
		System.out.println("Perdeu um aliado! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 13:
		System.out.println("Caiu na armadilha! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 16:
		System.out.println("Traídos por um informante! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 19:
		System.out.println("Patrulha policial! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 22:
		System.out.println("Confronto com policiais! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 25:
		System.out.println("Bloqueio policial nas ruas! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	case 28:
		System.out.println("Perdeu comunicação! Volte 2 casas.");
		position -= 2;
		if(position < 0) {
			position = 0;
		} break;
	
		
	
	}
	return position;
}
}
