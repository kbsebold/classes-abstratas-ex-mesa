package com.company;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "bocejar";
    }

    public String subirArvores(){
        return "Subi na árvore";
    }
}
