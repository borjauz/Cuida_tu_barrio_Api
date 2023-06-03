package es.cuidatubrario.cuida_tu_barrio.business.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter @Entity @ToString
public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private double longitud, latitud;

    @Column(name ="fechaPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imagen;

    @ManyToOne
    private Usuario usuario;

}
