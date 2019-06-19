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
public abstract class Animal {

    //**Atributos
    private float peso;
    private int idade;
    private int membros;

    //**Métodos Especiais
    public Animal() {
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //**Métodos Públicos
    public void locomover() {

    }

    public void alimentar() {

    }

    public void emitirSom() {

    }

}
