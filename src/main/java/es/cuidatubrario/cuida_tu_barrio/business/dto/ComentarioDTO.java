package es.cuidatubrario.cuida_tu_barrio.business.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ComentarioDTO {
    private String usuario, dni, comentario;

    public ComentarioDTO(String usuario, String dni, String comentario) {
        this.usuario = usuario;
        this.dni = dni;
        this.comentario = comentario;
    }

    public ComentarioDTO() {
    }
}
