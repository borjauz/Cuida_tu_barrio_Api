package es.cuidatubrario.cuida_tu_barrio.business.service;

import es.cuidatubrario.cuida_tu_barrio.business.dto.LoginDTO;
import org.springframework.http.ResponseEntity;

public interface LoginService {
    ResponseEntity login(LoginDTO loginDTO);
}
