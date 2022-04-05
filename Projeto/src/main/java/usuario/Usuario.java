/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

import grupo.Grupo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC
 */
public class Usuario{
    
    String nome;
    String email;
    String senha;
    private DateTimeFormatter dataCadastro;
    private LocalDateTime agora;
    Grupo grupo;

    public Usuario(String nome, String email, String senha, Grupo grupo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.grupo = grupo;
        agora = LocalDateTime.now();
    }

    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the dataCadastro
     */
    public DateTimeFormatter getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(DateTimeFormatter dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the grupos
     */
    public Grupo getGrupos() {
        return grupo;
    }

    /**
     * @param grupos the grupos to set
     */
    public void setGrupos(Grupo grupos) {
        this.grupo = grupo;
    }
}
