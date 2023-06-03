package es.cuidatubrario.cuida_tu_barrio.business.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class LoginDTO {

    private String password, dni;

    public LoginDTO(String password, String dni) {
        this.password = password;
        this.dni = dni;
    }

    public LoginDTO() {
    }
}
