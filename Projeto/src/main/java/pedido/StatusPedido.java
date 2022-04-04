/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

/**
 *
 * @author PC
 */
public class StatusPedido {
    
            public enum Status {
        criado, confirmado, entregue, cancelado;
        }
        
        Status status;

    public StatusPedido(Status status) {
        this.status = status;
    }
}
