/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

import endereco.Endereco;
import formapagamento.Formapagamento;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.List;
import restaurante.Restaurante;
import usuario.Usuario;

/**
 *
 * @author PC
 */
public class Pedido {
        
    private String codigo;
    private BigDecimal subtotal;
    private BigDecimal taxaFrete;
    private BigDecimal valorTotal;
    private DateTimeFormatter dataCriacao;
    private DateTimeFormatter dataConfirmacao;
    private DateTimeFormatter dataEntrega;
    private DateTimeFormatter dataCancelamento;
    private Restaurante restaurante;
    private Formapagamento formaPagamento;
    private StatusPedido statusPedido;
    private Usuario cliente;
    private Endereco enderecoEntrega;
    private List<ItemPedido> itens;

    public Pedido(String codigo, Restaurante restaurante, StatusPedido statusPedido, Usuario cliente, List<ItemPedido> itens) {
        this.codigo = codigo;
        this.restaurante = restaurante;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
        this.itens = itens;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the subtotal
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
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
     * @return the valorTotal
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the dataCriacao
     */
    public DateTimeFormatter getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(DateTimeFormatter dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return the dataConfirmacao
     */
    public DateTimeFormatter getDataConfirmacao() {
        return dataConfirmacao;
    }

    /**
     * @param dataConfirmacao the dataConfirmacao to set
     */
    public void setDataConfirmacao(DateTimeFormatter dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    /**
     * @return the dataEntrega
     */
    public DateTimeFormatter getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(DateTimeFormatter dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the dataCancelamento
     */
    public DateTimeFormatter getDataCancelamento() {
        return dataCancelamento;
    }

    /**
     * @param dataCancelamento the dataCancelamento to set
     */
    public void setDataCancelamento(DateTimeFormatter dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    /**
     * @return the restaurante
     */
    public Restaurante getRestaurante() {
        return restaurante;
    }

    /**
     * @param restaurante the restaurante to set
     */
    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    /**
     * @return the formaPagamento
     */
    public Formapagamento getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(Formapagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the statusPedido
     */
    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    /**
     * @param statusPedido the statusPedido to set
     */
    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    /**
     * @return the cliente
     */
    public Usuario getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the enderecoEntrega
     */
    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    /**
     * @param enderecoEntrega the enderecoEntrega to set
     */
    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    /**
     * @return the itens
     */
    public List<ItemPedido> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }


    }
        
    //puxar subtotal
    //calcular o total