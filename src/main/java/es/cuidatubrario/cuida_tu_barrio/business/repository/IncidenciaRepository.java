package es.cuidatubrario.cuida_tu_barrio.business.repository;

import es.cuidatubrario.cuida_tu_barrio.business.model.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> {
}
