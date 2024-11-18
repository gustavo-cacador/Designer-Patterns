import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Observer> observadores = new ArrayList<>();
//  private final List<Observer> observadores;

    public Pedido(List<Observer> observadores) {
        this.observadores = observadores;
    }

    private void notificaObservadores(StatusPedido statusPedido) {
        observadores.forEach(observer -> observer.notificar(statusPedido));
    }

    public void mudancaStatus(StatusPedido statusPedido) {
        System.out.println("---------- MUDANÇA DE STATUS -----------");
        notificaObservadores(statusPedido);
    }
 }
