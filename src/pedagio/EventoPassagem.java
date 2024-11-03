package pedagio;

public class EventoPassagem {
    private Tag tag;
    private String horario;
    private String placaVeiculo;
    private PracaPedagio praca;
    private double valorTarifa;

    public EventoPassagem(Tag tag, String horario, String placaVeiculo, PracaPedagio praca, double valorTarifa) {
        this.tag = tag;
        this.horario = horario;
        this.placaVeiculo = placaVeiculo;
        this.praca = praca;
        this.valorTarifa = valorTarifa;
    }

    public Tag getTag() {
        return tag;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    @Override
    public String toString() {
        return "Tag: " + tag.getCodigo() + ", Horário: " + horario + ", Placa: " + placaVeiculo +
                ", Praça: " + praca.getCodigo() + ", Valor: R$ " + valorTarifa;
    }
}
