package es.cuidatubrario.cuida_tu_barrio.controller;

import es.cuidatubrario.cuida_tu_barrio.business.dto.LoginDTO;
import es.cuidatubrario.cuida_tu_barrio.business.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class LoginController {
    @Autowired
    private LoginService loginService;

    //Comprueba dni y contraseña para el login
    @PostMapping("/login")
    public ResponseEntity registrarUsario(@RequestBody LoginDTO loginDTO){
        return loginService.login(loginDTO);
    }
}
