package model;

public class Papel extends Coisa{
    @Override
    public boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Pedra;
    }
}
