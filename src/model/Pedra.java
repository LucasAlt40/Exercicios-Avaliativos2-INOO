package model;

public class Pedra extends Coisa{
    @Override
    public boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Tesoura;
    }
}
