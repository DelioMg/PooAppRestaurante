/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class Salgados extends Produto {
     
    private String recheio;
    private String massa;

    public Salgados(String recheio, String massa, String nome, Boolean ativo) {
        super(nome, ativo);
        this.recheio = recheio;
        this.massa = massa;
    }

    /**
     * @return the recheio
     */
    public String getRecheio() {
        return recheio;
    }

    /**
     * @param recheio the recheio to set
     */
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    /**
     * @return the massa
     */
    public String getMassa() {
        return massa;
    }

    /**
     * @param massa the massa to set
     */
    public void setMassa(String massa) {
        this.massa = massa;
    }

    
    public BigDecimal calcularPreco(String recheio, String massa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
//pensar no caso de adicionar ingredientes list<>