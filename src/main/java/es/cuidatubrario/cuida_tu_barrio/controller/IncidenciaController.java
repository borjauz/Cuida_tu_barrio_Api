package es.cuidatubrario.cuida_tu_barrio.controller;

import es.cuidatubrario.cuida_tu_barrio.business.dto.IncidenciaDTO;
import es.cuidatubrario.cuida_tu_barrio.business.service.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/incidencias")
public class IncidenciaController {

    @Autowired
    private IncidenciaService incidenciaService;

    //Registra una nueva incidencia
    @PostMapping("/nueva")
    public ResponseEntity nuevaIncidencia(@RequestBody IncidenciaDTO incidenciaDTO){
        return incidenciaService.nuevaIncidencia(incidenciaDTO);
    }

}
