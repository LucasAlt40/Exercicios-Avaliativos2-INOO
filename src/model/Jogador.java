package model;

import java.util.Random;

public class Jogador {
    private boolean ehMaquina;
    private Coisa coisaEscolhida;
    private Integer pontos;
    private String nome;

    public Jogador() {}

    public Jogador(boolean ehMaquina) {
        this.pontos = 0;
        this.ehMaquina = ehMaquina;
        this.nome = "Máquina";
        if(ehMaquina) {
            Random random = new Random();
            escolheCoisa(random.nextInt(1, 3));
        }
    }

    public Jogador(String nome) {
        this.pontos = 0;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Coisa getCoisaEscolhida() {
        return coisaEscolhida;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void escolheCoisa(int cod) {
        switch (cod) {
            case 1:
                this.coisaEscolhida = new Tesoura();
                break;
            case 2:
                this.coisaEscolhida = new Papel();
                break;
            case 3:
                this.coisaEscolhida = new Pedra();
                break;
            default:
                break;
        }
    }
}
