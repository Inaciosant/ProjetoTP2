package pedagio;

public class Tag {
    private String codigo;
    private Cliente cliente;

    public Tag(String codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        cliente.adicionarTag(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
