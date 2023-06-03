package es.cuidatubrario.cuida_tu_barrio.business.repository;

import es.cuidatubrario.cuida_tu_barrio.business.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    boolean existsByDni(String dni);
    Usuario findByDni(String dni);
}
