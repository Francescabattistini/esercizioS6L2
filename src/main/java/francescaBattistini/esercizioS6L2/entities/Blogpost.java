package francescaBattistini.esercizioS6L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Blogpost {
     private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLetturo;

    public Blogpost(String categoria, String titolo, String contenuto, int tempoDiLetturo) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLetturo = tempoDiLetturo;
    }
}
