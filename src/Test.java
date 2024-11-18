import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        Email email = new Email();
        WhatsApp zap = new WhatsApp();

        // new Pedido(Arrays.asList(email, zap));
        List<Observer> observadores = Arrays.asList(email, zap);
        Pedido pedido = new Pedido(observadores);

        pedido.mudancaStatus(StatusPedido.PAGAMENTO_PENDENTE);

        Thread.sleep(1500);

        pedido.mudancaStatus(StatusPedido.PAGAMENTO_APROVADO);

        Thread.sleep(2000);

        pedido.mudancaStatus(StatusPedido.EM_TRANSPORTE);

        Thread.sleep(3000);

        pedido.mudancaStatus(StatusPedido.ENTREGUE);
    }
}
