/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedrapapeltesoura;

import java.util.Scanner;

/**
 *
 * @author 182220008
 */
public class PedraPapelTesoura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcao1, opcao2;
        String result= null;
        
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Jogador 1 escolhe");
        System.out.println("1-Pedra, 2-Papel, 3- Tesoura");
        
        opcao1 = ent.nextInt();
        if(opcao1 < 0 && opcao1 > 3)
        System.out.println("Jogador 1 escolha uma opção valida");
        System.out.println("1-Pedra, 2-Papel, 3- Tesoura");
        
    
        System.out.println("Jogador 2 escolhe");
        System.out.println("1-Pedra, 2-Papel, 3- Tesoura");
        opcao2 = ent.nextInt();
        
        
        
        switch (opcao1) {
            case 1:
                switch (opcao2){
                    case 1: result = "Empate";
                    break;
                    case 2: result = "Jogador 2 venceu";
                    break;
                    case 3: result = "Jogador 1 venceu";
                    break;
                }
            case 2:
                switch (opcao2){
                    case 1: result = "Jogador 1 venceu";
                    break;
                    case 2: result = "Empate";
                    break;
                    case 3: result = "Jogador 2 venceu";
                    break;
                }
            case 3:
                switch (opcao2){
                    case 1: result = "Jogador 2 venceu";
                    break;
                    case 2: result = "Jogador 1 venceu";
                    break;
                    case 3: result = "Empate";
                    break;
                }
                            
        }
        System.out.println("Resultado: " + result);
    }
    
}
