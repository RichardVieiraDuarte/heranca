package main.model.personagem.concreto;

import main.model.personagem.Personagem;

public class Guerreira extends Personagem {
    public Guerreira(String nome) {
        super(nome);
    }

    private int escudo = 3;

    public boolean defender() {
        escudo--;
        if (escudo > 0) {
            return true;
        }
        return false;
    }
}
