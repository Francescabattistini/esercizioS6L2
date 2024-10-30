package francescaBattistini.esercizioS6L2.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AuthorPayload {
    private  String nome;
    private   String cognome;
    private  String email;
    private LocalDate dataDiNascita;

}
