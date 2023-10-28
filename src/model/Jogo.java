package model;

public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private boolean melhorDeTres;

    public Jogo(boolean melhorDeTres) {
        this.jogador1 = new Jogador();
        this.jogador2 = new Jogador(true);
        this.melhorDeTres = melhorDeTres;
    }

    private boolean jogadorVencedor(Jogador jogador) {
        return (melhorDeTres) ? jogador.getPontos() == 3 : jogador.getPontos() == 1;
    }

    public void confronto() {
        if(jogador1.getCoisaEscolhida().ganhaDe(jogador2.getCoisaEscolhida())) {
            jogador1.setPontos(jogador1.getPontos() + 1);
        } else {
            jogador2.setPontos(jogador2.getPontos() + 1);
        }
    }


}
