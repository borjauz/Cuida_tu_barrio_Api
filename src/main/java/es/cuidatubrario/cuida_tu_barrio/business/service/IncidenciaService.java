package es.cuidatubrario.cuida_tu_barrio.business.service;

import es.cuidatubrario.cuida_tu_barrio.business.dto.IncidenciaDTO;
import org.springframework.http.ResponseEntity;

public interface IncidenciaService {
    ResponseEntity nuevaIncidencia(IncidenciaDTO incidenciaDTO);
}
