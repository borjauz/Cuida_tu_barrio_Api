package es.cuidatubrario.cuida_tu_barrio.controller;

import es.cuidatubrario.cuida_tu_barrio.business.dto.RegistroDTO;
import es.cuidatubrario.cuida_tu_barrio.business.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class RegistroController {
    @Autowired
    private RegistroService registroService;
    //registra un nuevo usuario en bd
    @PostMapping("/registro")
    public ResponseEntity registrarUsario(@RequestBody RegistroDTO registroDTO){
        return registroService.registroUsuario(registroDTO);
    }
}
