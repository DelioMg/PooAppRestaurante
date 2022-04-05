/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

import grupo.Grupo;
import java.util.List;
import produto.Produto;

/**
 *
 * @author PC
 */
public class Cliente extends Usuario {
    
    private List<Produto> preferencias;

    public Cliente(String nome, String email, String senha, Grupo grupo) {
        super(nome, email, senha, grupo);
        this.preferencias = new java.util.ArrayList<Produto>();
    }

    /**
     * @return the preferencias
     */
    public List<Produto> getPreferencias() {
        return preferencias;
    }

    /**
     * @param preferencias the preferencias to set
     */
    public void setPreferencias(Produto produto) {
        this.preferencias.add(produto);
    }
  
    @Override
       public String toString(){
       String user;
       user = "Dados da Cliente "+this.nome+ " email: "+this.email+ " senha: "+this.senha+" Grupo "+this.grupo;
      return user;
    }
}

