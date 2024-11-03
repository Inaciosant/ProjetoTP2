package pedagio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Tag> tags = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarTag(Tag tag) {
        tags.add(tag);
    }

    public String getNome() {
        return nome;
    }

    public List<Tag> getTags() {
        return tags;
    }
}
