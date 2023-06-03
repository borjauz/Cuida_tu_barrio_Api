package es.cuidatubrario.cuida_tu_barrio.business.service.impl;

import es.cuidatubrario.cuida_tu_barrio.business.dto.LoginDTO;
import es.cuidatubrario.cuida_tu_barrio.business.model.Usuario;
import es.cuidatubrario.cuida_tu_barrio.business.repository.UsuarioRepository;
import es.cuidatubrario.cuida_tu_barrio.business.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public ResponseEntity login(LoginDTO loginDTO) {
        if (usuarioRepository.existsByDni(loginDTO.getDni())){
            Usuario usuario = usuarioRepository.findByDni(loginDTO.getDni());
            if(usuario.getPassword().equals(loginDTO.getPassword())){
                return new ResponseEntity<>(HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

}
