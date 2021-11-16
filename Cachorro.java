package com.company;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
    return "AU AU";
    }

    public String correr(){
        return "correndo atras da moto";
    }
}
