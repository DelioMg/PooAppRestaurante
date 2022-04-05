/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

/**
 *
 * @author PC
 */
public class Lanche extends Produto {
    private String pao;
    private String recheio;

    public Lanche(String pao, String recheio, String nome, Boolean ativo) {
        super(nome, ativo);
        this.pao = pao;
        this.recheio = recheio;
    }

    /**
     * @return the pao
     */
    public String getPao() {
        return pao;
    }

    /**
     * @param pao the pao to set
     */
    public void setPao(String pao) {
        this.pao = pao;
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
    
    
}
