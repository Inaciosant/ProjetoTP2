package pedagio;

public class PracaPedagio {
    private String codigo;
    private String localizacao;

    public PracaPedagio(String codigo, String localizacao) {
        this.codigo = codigo;
        this.localizacao = localizacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
