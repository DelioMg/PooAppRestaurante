package usuario;

import grupo.Grupo;
import java.math.BigDecimal;
import java.util.List;
import restaurante.Restaurante;

/**
 *
 * @author PC
 */
public class Gerente extends Funcionario {
    private List<Restaurante> restaurante;
    private BigDecimal adicionalmeta;


    public Gerente(BigDecimal adicionalmeta, String nome, String email, String senha, Grupo grupo) {
        super(nome, email, senha, grupo);
        this.restaurante = restaurante;
        this.adicionalmeta = adicionalmeta;
    }

    /**
     * @return the restaurante
     */
    public List<Restaurante> getRestaurante() {
        return restaurante;
    }

    /**
     * @param restaurante the restaurante to set
     */
    public void setRestaurante(List<Restaurante> restaurante) {
        this.restaurante = restaurante;
    }

        public BigDecimal getAdicionalmeta() {
        return adicionalmeta;
    }

    public void setAdicionalmeta(BigDecimal adicionalmeta) {
        this.adicionalmeta = adicionalmeta;
    }

    
    
    @Override
    public BigDecimal calcularSalario() {
     Float soma = super.getSalario().floatValue() + this.adicionalmeta.floatValue();
     return new BigDecimal(soma);
    }
    
       public String toString(){
       String user;
       user = "Dados do Gerente "+this.nome+ " email: "+this.email+ " senha: "+this.senha+" Salario: "+this.calcularSalario() +" Grupo "+this.grupo;
      return user;
    }
}

//cadastrar produtos
//cadastrar fucionario
//pensar no id administrador e funcionario
