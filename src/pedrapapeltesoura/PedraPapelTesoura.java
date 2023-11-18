
package pedrapapeltesoura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 182220008
 */
public class PedraPapelTesoura {

  
  public static void main(String[] args) {

    int opcaoJogador, opcaoPc;
    int totalRodadas = 3;
    int rodadas = 0;
    int vitoriasJogador = 0;
    int vitoriasPc = 0;
    int empates = 0;

    Scanner ent = new Scanner(System.in);
    Random rn = new Random();

    while (rodadas < totalRodadas) {
      do {
        System.out.println("Jogador escolha entre pedra (1), papel (2) ou tesoura (3)");

        opcaoJogador = ent.nextInt();

        if (opcaoJogador < 1 || opcaoJogador > 3) {
          System.out.println("Escolha inválida, a opção deve ser entre 1 a 3");
        }

      } while (opcaoJogador < 1 || opcaoJogador > 3);

      opcaoPc = rn.nextInt(3) + 1;

      System.out.println("Jogador escolheu: " + opcaoJogador);
      System.out.println("Computador escolheu: " + opcaoPc);

      if (opcaoJogador == opcaoPc) {
        System.out.println("Empate");
        empates++;
      } else if ((opcaoJogador == 1 && opcaoPc == 3)
          || (opcaoJogador == 2 && opcaoPc == 1)
          || (opcaoJogador == 3 && opcaoPc == 2)) {

          {
            vitoriasJogador++;
            System.out.println("Jogador Venceu");
          }

        } else {
          System.out.println("Computador venceu");
          vitoriasPc++;

        }
      rodadas++;

    }
    System.out.println("----------------------------------------------------");
    System.out.println("Total de rodadas jogadas: " + totalRodadas);
    System.out.println("Total de empates: " + empates);
    System.out.println("Total de vitórias jogador: " + vitoriasJogador);
    System.out.println("Total de vitórias Computador: " + vitoriasPc);
    if (vitoriasJogador > vitoriasPc) {
      System.out.println("Jogador venceu!");
    } else
      System.out.println("Computador venceu!");
  }
}
