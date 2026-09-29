package com.carro.entity;

//classe carro
public class Carro {

    public String modelo;
    public double preco;


    public Carro(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;

    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

}
