package es.cuidatubrario.cuida_tu_barrio.controller;

import es.cuidatubrario.cuida_tu_barrio.business.dto.ComentarioDTO;
import es.cuidatubrario.cuida_tu_barrio.business.dto.PublicarComentarioDTO;
import es.cuidatubrario.cuida_tu_barrio.business.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    //Registra comentario
    @PostMapping("/nuevo")
    public ResponseEntity comentar(@RequestBody PublicarComentarioDTO publicarComentarioDTO){
        return comentarioService.comentar(publicarComentarioDTO);
    }

    //Devuelve los comentarios de la bd
    @GetMapping("/lista")
    public ResponseEntity obtenerComentarios(){
        return comentarioService.obtenerComentarios();
    }
}
