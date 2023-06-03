package es.cuidatubrario.cuida_tu_barrio.business.service;

import es.cuidatubrario.cuida_tu_barrio.business.dto.RegistroDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface RegistroService {
    ResponseEntity registroUsuario(RegistroDTO registroDTO);
}
