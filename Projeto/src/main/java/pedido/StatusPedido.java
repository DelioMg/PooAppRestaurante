
package pedido;

public class StatusPedido {
    
            public enum Status {
        criado, confirmado, entregue, cancelado;
        }
        
        Status status;

    public StatusPedido(Status status) {
        this.status = status;
    }
}
