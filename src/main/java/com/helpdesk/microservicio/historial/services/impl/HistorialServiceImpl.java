package com.helpdesk.microservicio.historial.services.impl;

import com.helpdesk.microservicio.historial.models.Historial;
import com.helpdesk.microservicio.historial.repositories.historialRepository;
import com.helpdesk.microservicio.historial.services.HistorialService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HistorialServiceImpl implements HistorialService {

    @Autowired
    private historialRepository historialRepository;
    @Override
    @Transactional
    public List<Historial> findAll() {
        return historialRepository.findAll();
    }

    @Override
    public Optional<Historial> findById(Long id) {
        return historialRepository.findById(id);
    }

    @Override
    public Historial save(Historial usuario) {
        return historialRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        historialRepository.deleteById(id);
    }
}
