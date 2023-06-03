package es.cuidatubrario.cuida_tu_barrio.business.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class RegistroDTO {

    private String dni, password, usuario;

    public RegistroDTO(String dni, String password, String usuario) {
        this.dni = dni;
        this.password = password;
        this.usuario = usuario;
    }

    public RegistroDTO() {
    }
}
