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
public class Cozinheiro extends Funcionario {

    public Cozinheiro(String nome, String email, String senha, Grupo grupo) {
        super(nome, email, senha, grupo);
    }

    @Override
    public BigDecimal calcularSalario() {
         return super.getSalario();
    }
    
}
