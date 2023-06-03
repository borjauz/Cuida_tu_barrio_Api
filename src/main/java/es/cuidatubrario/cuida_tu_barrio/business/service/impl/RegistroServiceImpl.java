package es.cuidatubrario.cuida_tu_barrio.business.service.impl;

import es.cuidatubrario.cuida_tu_barrio.business.dto.RegistroDTO;
import es.cuidatubrario.cuida_tu_barrio.business.model.Usuario;
import es.cuidatubrario.cuida_tu_barrio.business.repository.UsuarioRepository;
import es.cuidatubrario.cuida_tu_barrio.business.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistroServiceImpl implements RegistroService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public ResponseEntity registroUsuario(RegistroDTO registroDTO) {
        boolean existe = usuarioRepository.existsByDni(registroDTO.getDni());

        if (existe){
            return new ResponseEntity<>("DNI en uso", HttpStatus.BAD_REQUEST);
        } else {
            Usuario usuario = new Usuario(registroDTO.getDni(), registroDTO.getUsuario(), registroDTO.getPassword());
            try{
                usuarioRepository.save(usuario);
                return new ResponseEntity<>(HttpStatus.CREATED);
            } catch (Exception exception){
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        }
    }
}
