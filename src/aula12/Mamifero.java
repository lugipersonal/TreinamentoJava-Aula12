/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author lucio.rodrigues
 */
public class Mamifero extends Animal {

    //**Atributos
    private String corPelo;

    //**Métodos Especiais
    public void mamifero() {

    }

    public String getcorPelo() {
        return corPelo;
    }

    public void setcorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //**Métodos Públicos
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

}
