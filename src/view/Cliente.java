package view;

import model.Jogador;
import model.Jogo;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nomeJogador1 = scanner.nextLine();
        Jogador jogador1 = new Jogador(nomeJogador1);

        boolean melhorDeTres = true;
        Jogo jogo = new Jogo(melhorDeTres, jogador1);

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");

        jogo.iniciarJogo();

        System.out.println("O jogo acabou. Obrigado por jogar!");
        scanner.close();
    }
}
