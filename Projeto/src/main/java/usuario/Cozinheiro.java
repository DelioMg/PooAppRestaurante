/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

import cozinha.Cozinha.Tipocozinha;
import grupo.Grupo;
import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class Cozinheiro extends Funcionario {
     
    private Tipocozinha tipo; 
    public Cozinheiro(String nome, String email, String senha, Grupo grupo) {
        super(nome, email, senha, grupo);
    }
  
    @Override
    public BigDecimal calcularSalario() {
         return super.getSalario();
    }
   
    @Override
       public String toString(){
       String user;
       user = "Dados do Cozinheiro "+this.nome+ " email: "+this.email+ " senha: "+this.senha+" Salario: "+this.calcularSalario();
      return user;
    }
       
     
}
