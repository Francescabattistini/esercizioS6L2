package francescaBattistini.esercizioS6L2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Author {
    private  int id;
    private  String nome;
    private   String cognome;
    private  String email;
    private  LocalDate dataDiNascita;
    private  String avatar;

    public Author(String nome, String cognome, String email, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
    }
}
