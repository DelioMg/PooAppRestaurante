/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

import grupo.Grupo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public abstract class Funcionario extends Usuario{
    
    private LocalDateTime admissao;
    private String matricula;
    BigDecimal salario;   
    
    public Funcionario(String nome, String email, String senha, Grupo grupo) {
        super(nome, email, senha, grupo);
    }

     /**
     * @return the admissao
     */
    public LocalDateTime getAdmissao() {
        return admissao;
    }

    /**
     * @param admissao the admissao to set
     */
    public void setAdmissao(LocalDateTime admissao) {
        this.admissao = admissao;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the salario
     */
    public BigDecimal getSalario() {
        salario = new BigDecimal(1000);
        return salario;
    }
    
    /**
     * @param salario the salario to set
     */
    public void setSalario(BigDecimal salario) {
     
      this.salario = salario;
    }
    
   
    public abstract BigDecimal calcularSalario();
       
}
