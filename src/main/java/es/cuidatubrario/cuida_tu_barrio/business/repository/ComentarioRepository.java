package es.cuidatubrario.cuida_tu_barrio.business.repository;

import es.cuidatubrario.cuida_tu_barrio.business.model.Comentario;
import es.cuidatubrario.cuida_tu_barrio.business.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    List<Comentario> findAllByOrderByDateDesc();
}
