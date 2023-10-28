package model;

import java.util.Scanner;

public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private boolean melhorDeTres;

    public Jogo(boolean melhorDeTres, Jogador jogador1) {
        this.jogador1 = jogador1;
        this.jogador2 = new Jogador(true);
        this.melhorDeTres = melhorDeTres;
    }

    private boolean jogadorVencedor(Jogador jogador) {
        return (melhorDeTres) ? jogador.getPontos() == 3 : jogador.getPontos() == 1;
    }

    public void confronto() {
        if (jogador1.getCoisaEscolhida().ganhaDe(jogador2.getCoisaEscolhida())) {
            jogador1.setPontos(jogador1.getPontos() + 1);
        } else {
            jogador2.setPontos(jogador2.getPontos() + 1);
        }
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(jogador1.getNome() + ", escolha sua coisa (1-Tesoura, 2-Papel, 3-Pedra):");
            int escolhaJogador1 = scanner.nextInt();
            jogador1.escolheCoisa(escolhaJogador1);

            jogador2.escolheCoisa(1 + (int) (Math.random() * 3));

            confronto();

            System.out.println(jogador1.getNome() + " escolheu: " + jogador1.getCoisaEscolhida().getClass().getSimpleName());
            System.out.println(jogador2.getNome() + " escolheu: " + jogador2.getCoisaEscolhida().getClass().getSimpleName());

            System.out.println("Placar: " + jogador1.getNome() + " " + jogador1.getPontos() + " - " + jogador2.getNome() + " " + jogador2.getPontos());

            if (jogadorVencedor(jogador1)) {
                System.out.println(jogador1.getNome() + " venceu o jogo!");
                break;
            } else if (jogadorVencedor(jogador2)) {
                System.out.println(jogador2.getNome() + " venceu o jogo!");
                break;
            }
        }
        scanner.close();
    }
}
