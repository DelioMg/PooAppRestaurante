/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import cidade.Cidade;
import endereco.Endereco;
import estado.Estado;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import pedido.ItemPedido;
import produto.Produto;
import restaurante.Restaurante;
import usuario.usuario;

/**
 *
 * @author PC
 */
public class Projeto {
   
    public static void main(String[] args) {
        /*
        Criação do objeto estado
        */
        Estado estado = new Estado("Estado B");
        /*
        Criação do objeto cidade
        */
        Cidade cidade = new Cidade("cidade A", estado);
        
        /*
        Instanciação de um objeto endereço
        */
        Endereco endereco = new Endereco("123", "123", "12", "A", "B", cidade);
        Endereco end = new Endereco("1333", "1234", "22", "A", "C", cidade);
        
        /*
        Simulação da criação de uma lista de resturante
        */
        java.util.List<restaurante.Restaurante>  restaurantes;
        restaurantes = new ArrayList();
        /*
        Simulação da criação de dois restaurantes para teste
        */
        
        Restaurante restauranteA = new Restaurante("RU2022", true, endereco);
        Restaurante restauranteB = new Restaurante("RU2021", true, end);
        restaurantes.add(restauranteA);
        restaurantes.add(restauranteB);
        
        /*
        Simulação do usuário
        */
        usuario usuario = new usuario("Ana", "123");
        /*
        Simulação dos itens de pedido
        */
        List<ItemPedido> itens = new ArrayList();
        /*
        Simulação da criação do produto
        */
        Produto produto = new Produto("produto A", true);
        
        /*
        Simulação do itemPedido
        */
 
        ItemPedido item = new ItemPedido(1, new BigDecimal(10.00), "nada", produto);
        
        itens.add(item);
        /*
        Simulação da escolha do restaurante. O usuário o restaruante A.
        */
        restauranteA.fazerPedido(itens, usuario, restauranteA);
        System.out.println("Todos os pacotes foram implementados com sucesso");
    }
}
