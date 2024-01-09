package com.helpdesk.microservicio.historial.repositories;

import com.helpdesk.microservicio.historial.models.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface historialRepository extends JpaRepository<Historial, Long> {
}
