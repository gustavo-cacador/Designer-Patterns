public class WhatsApp implements Observer{

    @Override
    public void notificar(StatusPedido statusPedido) {
        System.out.println("Enviando WhatsApp... Status: " + statusPedido.name());
    }

}
