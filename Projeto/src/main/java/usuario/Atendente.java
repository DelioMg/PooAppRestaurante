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
public class Atendente extends Funcionario {
    
    private String ramal;

    public Atendente(String ramal, String nome, String email, String senha, Grupo grupo) {
        super(nome, email, senha, grupo);
        this.ramal = ramal;
    }

    /**
     * @return the ramal
     */
    public String getRamal() {
        return ramal;
    }

    /**
     * @param ramal the ramal to set
     */
    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public BigDecimal calcularSalario() {
         return super.getSalario();
    }
    
}
//realizar pedido.
//cadastrar cliente 
//registra pedido
//selecionar produto