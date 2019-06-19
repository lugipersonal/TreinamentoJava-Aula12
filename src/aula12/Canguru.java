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
public class Canguru extends Mamifero {
    
    //**Métodos Públicos
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando...");
    }
    
}
