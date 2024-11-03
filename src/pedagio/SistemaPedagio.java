package pedagio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaPedagio {
    private List<EventoPassagem> eventos = new ArrayList<>();
    private Map<String, Cliente> clientes = new HashMap<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getNome(), cliente);
    }

    public void registrarPassagem(EventoPassagem evento) {
        eventos.add(evento);
        notificarCliente(evento);
    }

    private void notificarCliente(EventoPassagem evento) {
        System.out.println("Notificação para " + evento.getTag().getCliente().getNome() + ": " + evento);
    }

    public double calcularTotalFinanceiro(String codigoTag) {
        return eventos.stream()
                .filter(e -> e.getTag().getCodigo().equals(codigoTag))
                .mapToDouble(EventoPassagem::getValorTarifa)
                .sum();
    }

    public void executarAnalytics() {
        System.out.println("Executando analytics de passagens...");
    }

    public void executarContabilidade() {
        System.out.println("Executando contabilidade de passagens...");
    }
}
