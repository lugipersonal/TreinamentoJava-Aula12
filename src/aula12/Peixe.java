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
public class Peixe extends Animal {

    //**Atributos
    private String corEscama;

    //**Métodos Especiais
    public Peixe() {

    }

    public String getcorEscama() {
        return corEscama;
    }

    public void setcorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha() {
        System.out.println("Soltou uma Bolha");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som...");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias...");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

}
