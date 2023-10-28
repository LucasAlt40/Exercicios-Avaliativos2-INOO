package model;

public class Tesoura extends Coisa{

    @Override
    public boolean ganhaDe(Coisa coisa) {
        return coisa instanceof Papel;
    }
}
