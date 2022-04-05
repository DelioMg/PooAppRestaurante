/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package formapagamento;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public interface Pagavel {
    public abstract void pagar(BigDecimal valor);
}
