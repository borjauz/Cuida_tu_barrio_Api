package es.cuidatubrario.cuida_tu_barrio.business.service.impl;

import es.cuidatubrario.cuida_tu_barrio.business.dto.IncidenciaDTO;
import es.cuidatubrario.cuida_tu_barrio.business.model.Incidencia;
import es.cuidatubrario.cuida_tu_barrio.business.model.Usuario;
import es.cuidatubrario.cuida_tu_barrio.business.repository.IncidenciaRepository;
import es.cuidatubrario.cuida_tu_barrio.business.repository.UsuarioRepository;
import es.cuidatubrario.cuida_tu_barrio.business.service.IncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class IncidenciaServiceImpl implements IncidenciaService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private IncidenciaRepository incidenciaRepository;

    @Override
    public ResponseEntity nuevaIncidencia(IncidenciaDTO incidenciaDTO) {

        if (usuarioRepository.existsByDni(incidenciaDTO.getDni())){
            Incidencia incidencia = new Incidencia();
            incidencia.setDescripcion(incidenciaDTO.getDescripcion());
            Usuario usuario = usuarioRepository.findByDni(incidenciaDTO.getDni());
            incidencia.setUsuario(usuario);
            incidencia.setLatitud(incidenciaDTO.getLatitud());
            incidencia.setLongitud(incidenciaDTO.getLongitud());
            incidencia.setImagen(incidenciaDTO.getImagen());
            incidencia.setDate(new Date());
            try{
                incidenciaRepository.save(incidencia);
                return new ResponseEntity<>(HttpStatus.CREATED);
            } catch (Exception exception){
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

    }
}
