/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

import grupo.Grupo;
import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class Entregador extends Funcionario{

    private String placa;
    private String telefone;
    private BigDecimal taxaentrega; 
    
    public Entregador(BigDecimal taxaentrega, String placa, String telefone, String nome, String email, String senha, Grupo grupo) {
        super(nome, email, senha, grupo);
        this.placa = placa;
        this.telefone = telefone;
        this.taxaentrega = taxaentrega;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public BigDecimal calcularSalario() {
     Float soma = super.getSalario().floatValue() + this.taxaentrega.floatValue();
     return new BigDecimal(soma);
    }
    
      public String toString(){
       String user;
       user = "Dados da Entregador "+this.nome+ " email: "+this.email+ " senha: "+this.senha+ " Placa da moto: "+this.placa+" telefone:"+this.telefone+" Grupo "+this.grupo;
      return user;
    }
}
