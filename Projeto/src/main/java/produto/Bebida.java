package produto;

import java.math.BigDecimal;


public class Bebida extends Produto {
    private String Tipo;
    private String Sabor;
    private BigDecimal tamanho;

    public Bebida(String Tipo, String Sabor, BigDecimal tamanho, String nome, Boolean ativo) {
        super(nome, ativo);
        this.Tipo = Tipo;
        this.Sabor = Sabor;
        this.tamanho = tamanho;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Sabor
     */
    public String getSabor() {
        return Sabor;
    }

    /**
     * @param Sabor the Sabor to set
     */
    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    /**
     * @return the tamanho
     */
    public BigDecimal getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(BigDecimal tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public BigDecimal calcularPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

//pensar na quantidade