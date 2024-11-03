package pedagio;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva");
        Tag tag1 = new Tag("TAG123", cliente1);
        PracaPedagio praca1 = new PracaPedagio("P001", "Rodovia Central");

        SistemaPedagio sistema = new SistemaPedagio();
        sistema.adicionarCliente(cliente1);

        sistema.registrarPassagem(new EventoPassagem(tag1, "10:00", "ABC-1234", praca1, 7.50));
        sistema.registrarPassagem(new EventoPassagem(tag1, "12:30", "ABC-1234", praca1, 7.50));

        double total = sistema.calcularTotalFinanceiro("TAG123");
        System.out.println("Total financeiro para a tag TAG123: R$ " + total);

        sistema.executarAnalytics();
        sistema.executarContabilidade();
    }
}
