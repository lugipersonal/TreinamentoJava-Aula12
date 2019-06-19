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
public class Ave extends Animal {

    //**Atributos
    private String corPena;

    //**Métodos Especiais
    public Ave() {

    }

    public String getcorPena() {
        return corPena;
    }

    public void setcorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Fazendo Ninho...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

}
