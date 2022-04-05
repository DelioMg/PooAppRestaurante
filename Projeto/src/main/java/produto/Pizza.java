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
public class Pizza extends Produto {
   
    private String sabor;
    private String borda;

    public Pizza(String sabor, String borda, String nome, Boolean ativo) {
        super(nome, ativo);
        this.sabor = sabor;
        this.borda = borda;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the borda
     */
    public String getBorda() {
        return borda;
    }

    /**
     * @param borda the borda to set
     */
    public void setBorda(String borda) {
        this.borda = borda;
    }

    @Override
    public BigDecimal calcularPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

//calcular preço
//tamanho pode ser sabor 