package es.cuidatubrario.cuida_tu_barrio.business.service;

import es.cuidatubrario.cuida_tu_barrio.business.dto.ComentarioDTO;
import es.cuidatubrario.cuida_tu_barrio.business.dto.PublicarComentarioDTO;
import org.springframework.http.ResponseEntity;

public interface ComentarioService {
    ResponseEntity comentar(PublicarComentarioDTO publicarComentarioDTO);
    ResponseEntity obtenerComentarios();
}
