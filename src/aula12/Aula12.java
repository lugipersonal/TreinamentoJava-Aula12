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
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();

        mamifero.setPeso(85.3f);
        mamifero.setIdade(8);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        System.out.println("-------------------------------------------------");

        peixe.setPeso(0.35f);
        peixe.setIdade(1);
        peixe.setMembros(0);
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        peixe.soltarBolha();

        System.out.println("-------------------------------------------------");

        ave.setPeso(0.89f);
        ave.setIdade(2);
        ave.setMembros(2);
        ave.locomover();
        ave.alimentar();
        ave.emitirSom();
        ave.fazerNinho();

        System.out.println("-------------------------------------------------");

        canguru.setPeso(15);
        canguru.setIdade(6);
        canguru.setMembros(2);
        canguru.setcorPelo("Amarelo");
        canguru.locomover();
        
        System.out.println("-------------------------------------------------");
        
        cachorro.setPeso(55.30f);
        cachorro.setIdade(4);
        cachorro.setMembros(3);
        cachorro.setcorPelo("Amarelo");
        cachorro.enterrarOsso();
        cachorro.abanarRabo();
        cachorro.emitirSom();

    }

}
