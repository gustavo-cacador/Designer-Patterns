public class Email implements Observer{

    @Override
    public void notificar(StatusPedido statusPedido) {
        System.out.println("Enviando email... STATUS: " + statusPedido.name());
    }
    
}
