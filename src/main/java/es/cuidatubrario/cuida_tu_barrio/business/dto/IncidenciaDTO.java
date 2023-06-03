package es.cuidatubrario.cuida_tu_barrio.business.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class IncidenciaDTO {

    private String dni, descripcion;
    private double latitud, longitud;
    private byte[] imagen;

    public IncidenciaDTO(String dni, String descripcion, double latitud, double longitud, byte[] imagen) {
        this.dni = dni;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.imagen = imagen;
    }

    public IncidenciaDTO() {
    }
}
