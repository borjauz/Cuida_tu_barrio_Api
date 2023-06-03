package es.cuidatubrario.cuida_tu_barrio.business.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class PublicarComentarioDTO {

    private String dniUsuario, comentario;

    public PublicarComentarioDTO(String dniUsuario, String comentario) {
        this.dniUsuario = dniUsuario;
        this.comentario = comentario;
    }

    public PublicarComentarioDTO() {
    }
}
