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
public class Reptil extends Animal {

    //**Atributos
    private String corEscama;

    //**Métodos Especiais
    public Reptil() {

    }

    public String getcorEscama() {
        return corEscama;
    }

    public void setcorEscama(String corEscama) {
        this.setcorEscama(corEscama);
    }

    //**Métodos Públicos
    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais...");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

}
