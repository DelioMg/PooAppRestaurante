/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class Produto {
    
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Boolean ativo;
    private FotoProduto fotoproduto;

    public Produto(String nome, Boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public FotoProduto getFotoproduto() {
        return fotoproduto;
    }

    public void setFotoproduto(FotoProduto fotoproduto) {
        this.fotoproduto = fotoproduto;
    }

}
