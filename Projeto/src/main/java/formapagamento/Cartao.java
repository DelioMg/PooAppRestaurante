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
public class Cartao extends FormaPagamento implements Pagavel,Recebivel {

    private String numero;
    private Date datavencimento;
    private String nomedono;

    public Cartao(String numero, Date datavencimento, String nomedono, String descricao) {
        super(descricao);
        this.numero = numero;
        this.datavencimento = datavencimento;
        this.nomedono = nomedono;
    }
  
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public String getNomedono() {
        return nomedono;
    }

    public void setNomedono(String nomedono) {
        this.nomedono = nomedono;
    }
    
    
    @Override
    public void pagar(BigDecimal valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receber(BigDecimal valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
