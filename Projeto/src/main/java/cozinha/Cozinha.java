/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cozinha;

/**
 *
 * @author PC
 */
public class Cozinha {
 
    private String nome;
    public enum Tipocozinha {
    pizzaria, lachonte, restaurante, churraco, vegado;
    }

    public Cozinha(String nome) {
        this.nome = nome;
    }

    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
