package es.cuidatubrario.cuida_tu_barrio.business.service.impl;

import es.cuidatubrario.cuida_tu_barrio.business.dto.ComentarioDTO;
import es.cuidatubrario.cuida_tu_barrio.business.dto.PublicarComentarioDTO;
import es.cuidatubrario.cuida_tu_barrio.business.model.Comentario;
import es.cuidatubrario.cuida_tu_barrio.business.model.Usuario;
import es.cuidatubrario.cuida_tu_barrio.business.repository.ComentarioRepository;
import es.cuidatubrario.cuida_tu_barrio.business.repository.UsuarioRepository;
import es.cuidatubrario.cuida_tu_barrio.business.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public ResponseEntity comentar(PublicarComentarioDTO publicarComentarioDTO) {
        String dni;
        try{
            dni = publicarComentarioDTO.getDniUsuario();
        } catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        if (usuarioRepository.existsByDni(dni)){
            try{
                Usuario usuario = usuarioRepository.findByDni(dni);
                Comentario comentario = new Comentario(publicarComentarioDTO.getComentario(), usuario, new Date());
                comentarioRepository.save(comentario);
                return new ResponseEntity<>(HttpStatus.CREATED);
            } catch (Exception exception){
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    @Override
    public ResponseEntity obtenerComentarios() {
        List<Comentario> listaComentarios = comentarioRepository.findAllByOrderByDateDesc();
        List<ComentarioDTO> listaComentarioDTO = new ArrayList<>();
        for(Comentario comentario : listaComentarios){
            Usuario usuario = comentario.getUsuario();
            ComentarioDTO comentarioDTO = new ComentarioDTO(usuario.getUsuario(), usuario.getDni(), comentario.getComentario());
            listaComentarioDTO.add(comentarioDTO);
        }
        return new ResponseEntity<>(listaComentarioDTO, HttpStatus.OK);
    }

}
