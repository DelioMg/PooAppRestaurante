package projeto;

import cidade.Cidade;
import endereco.Endereco;
import estado.Estado;
import grupo.Grupo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import pedido.ItemPedido;
import permissao.Permissao;
import produto.Produto;
import restaurante.Restaurante;
import usuario.Atendente;
import usuario.Cliente;
import usuario.Cozinheiro;
import usuario.Entregador;
import usuario.Funcionario;
import usuario.Gerente;
import usuario.Usuario;

/**
 *
 * @author PC
 */
public class Projeto {
   
    public static void main(String[] args) {

        Estado estado = new Estado("Bahia");
        Estado estado2 = new Estado("Pernambuco");

        Cidade cidade = new Cidade("Juazeiro", estado);
        Cidade cidade2 = new Cidade("Petrolina", estado2);
        
        Endereco endereco = new Endereco("56302-905", "Avenida Guararapes", "100", "A", "Centro", cidade2);
        Endereco end = new Endereco("48903010", "RUA JOSE PETITINGA", "22", "B", "CENTRO", cidade);
        
        Permissao permcli = new Permissao("cliente","escolher");
        Grupo grupcli = new Grupo("cliente",permcli);
        
        Permissao permfun = new Permissao("Funcionario", "Editar");
        Grupo grupfun = new Grupo("Funcionario", permfun);
        
           

        java.util.List<restaurante.Restaurante>  restaurantes;
        restaurantes = new ArrayList();

        Restaurante restaurante1 = new Restaurante("Dona Maria", true, endereco);
        Restaurante restaurante2 = new Restaurante("Dona Flor", true, end);
        restaurantes.add(restaurante1);
        restaurantes.add(restaurante2);
        
        java.util.List<usuario.Usuario>  usuarios;
        usuarios = new ArrayList();
        
        Funcionario mario    = new Gerente(new BigDecimal(800), "Mario", "ma@gmail.com", "mar3210", grupfun);
        Funcionario daniel   = new Entregador(new BigDecimal(50),"ppp-0000","8799996666", "Daniel", "da@gmail.com", "dan3210", grupfun);
        Funcionario fernanda = new Atendente("1", "Fernanda", "fe@gmail.com", "fe1234", grupfun);
        Funcionario juliana  = new Cozinheiro("Juliana", "ju@gmail.com", "1234ju", grupfun);
        Usuario maria    = new Cliente("Maria","ma@gmail.com", "ma2456", grupcli);
        Usuario cleiton  = new Cliente("Cleiton","ma@gmail.com", "ma2456", grupcli);
        
        usuarios.add(mario);
        usuarios.add(daniel);
        usuarios.add(fernanda);
        usuarios.add(juliana);
        usuarios.add(maria);
        usuarios.add(cleiton);
        
        List<ItemPedido> itens = new ArrayList();
        /*
        Simulação da criação do produto
        */
        Produto produto = new Produto("produto A", true) {

        };
        
        /*
        Simulação do itemPedido
        */
 
        ItemPedido item = new ItemPedido(1, new BigDecimal(10.00), "nada", produto);
        
          
        itens.add(item);
        /*
        Simulação da escolha do restaurante. O usuário o restaruante A.
        */
        restaurante1.fazerPedido(itens, maria, restaurante1);
        
        mario.calcularSalario();
        fernanda.calcularSalario();
        daniel.calcularSalario();
        
        System.out.println(mario.toString());
        System.out.println(daniel.toString());
        System.out.println(fernanda.toString());
        System.out.println(maria.toString());
        System.out.println(cleiton.toString());
        
        
        System.out.println("Todos os pacotes foram implementados com sucesso");
    }
}
