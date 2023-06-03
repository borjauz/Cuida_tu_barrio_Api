package es.cuidatubrario.cuida_tu_barrio.business.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    private String dni;
    private String usuario, password;
    public Usuario(String dni, String usuario, String password) {
        this.dni = dni;
        this.usuario = usuario;
        this.password = password;
    }
    public Usuario() {

    }
}
