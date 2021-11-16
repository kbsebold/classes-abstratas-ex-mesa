package com.company;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
    return "Relinchar";
    }


    public String correr(){
        return "Correndo em jogos de aposta";
    }

}
