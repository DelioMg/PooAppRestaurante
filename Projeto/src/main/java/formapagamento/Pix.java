/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formapagamento;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Pix extends Formapagamento implements Pagavel,Recebivel{
  
    public enum Chaves{
CPF, CNPJ, TELEFONE, EMAIL, CHAVEALEATORIA;
}
    private BigDecimal valor;
    private Date data;
    private Chaves tipo;
    
    @Override
    public  void receber(BigDecimal valor){
        
    }

    public Pix(BigDecimal valor, Date data, String descricao,Chaves tipo) {
        super(descricao);
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }

    @Override
    public void pagar(BigDecimal valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the valor
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
}
