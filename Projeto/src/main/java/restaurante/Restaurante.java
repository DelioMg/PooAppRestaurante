/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

import cozinha.Cozinha;
import endereco.Endereco;
import formapagamento.Formapagamento;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.List;
import pedido.ItemPedido;
import pedido.Pedido;
import pedido.StatusPedido;
import usuario.Usuario;

/**
 *
 * @author PC
 */
public class Restaurante {
   
   private String nome;
   private BigDecimal taxaFrete;
   private Boolean ativo;
   private Boolean aberto;
   private DateTimeFormatter dataCadastro;
   private DateTimeFormatter dataAtualizacao;
   private Endereco endereco;
   private Cozinha cozinha;
   private List <Usuario> usuarios;
   private List <Formapagamento> formapagamento;
   private List <Pedido> pedidos;

    public Restaurante(String nome, Boolean ativo, Endereco endereco) {
        this.nome = nome;
        this.ativo = ativo;
        this.endereco = endereco;
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
     * @return the taxaFrete
     */
    public BigDecimal getTaxaFrete() {
        return taxaFrete;
    }

    /**
     * @param taxaFrete the taxaFrete to set
     */
    public void setTaxaFrete(BigDecimal taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    /**
     * @return the ativo
     */
    public Boolean getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the aberto
     */
    public Boolean getAberto() {
        return aberto;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
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
     * @return the dataAtualizacao
     */
    public DateTimeFormatter getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * @param dataAtualizacao the dataAtualizacao to set
     */
    public void setDataAtualizacao(DateTimeFormatter dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cozinha
     */
    public Cozinha getCozinha() {
        return cozinha;
    }

    /**
     * @param cozinha the cozinha to set
     */
    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    /**
     * @return the usuarios
     */
    public List <Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List <Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the formapagamento
     */
    public List <Formapagamento> getFormapagamento() {
        return formapagamento;
    }

    /**
     * @param formapagamento the formapagamento to set
     */
    public void setFormapagamento(List <Formapagamento> formapagamento) {
        this.formapagamento = formapagamento;
    }

    /**
     * @return the pedidos
     */
    public List <Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(List <Pedido> pedidos) {
        this.pedidos = pedidos;
    }
        public Pedido fazerPedido(List<ItemPedido> itens, Usuario usuario, Restaurante restaurante){
        /*
        O código do pedido é sequencial, simulação para teste
        */
        StatusPedido st = new StatusPedido(StatusPedido.Status.criado);
        Pedido pedido = new Pedido("1", restaurante, st, usuario,  itens);
        return pedido;
        
    }  
}
