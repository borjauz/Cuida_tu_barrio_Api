package es.cuidatubrario.cuida_tu_barrio.business.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comentario;
    @ManyToOne
    private Usuario usuario;
    @Column(name ="fecha_comentario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Comentario(String comentario, Usuario usuario, Date date) {
        this.comentario = comentario;
        this.usuario = usuario;
        this.date = date;
    }
}
