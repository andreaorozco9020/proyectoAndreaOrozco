package com.example.trabajoIntegrador.service;

import com.example.trabajoIntegrador.entity.Domicilio;
import com.example.trabajoIntegrador.repository.IDomicilioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //para decir que esta clase tiene el servicio y la logica y los metodos que se puedne llamar
public class DomicilioServiceImpl implements DomicilioService{
    private final IDomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(IDomicilioRepository domicilioRepository) {
        this.domicilioRepository = domicilioRepository;
    }

    /**------------------------METODOS--------------------------------*/
    @Override
    @Transactional(readOnly = true)
    public List<Domicilio> obtenerTodos() {
        return domicilioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Domicilio obtener(Long id) {
        return domicilioRepository.findById(id).get();
    }

    @Override
    @Transactional
    public Domicilio agregar(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }

    @Override
    public Domicilio modificar(Domicilio domicilio, Long id) {
        Domicilio domicilio1 = domicilioRepository.findById(id).orElseThrow(() -> new RuntimeException("Domicilio no encontrado"));
        domicilio1. setCalle(domicilio.getCalle());
        domicilio1.setNumero(domicilio.getNumero());
        domicilio1.setLocalidad(domicilio.getLocalidad());
        domicilio1.setProvincia(domicilio.getProvincia());
        return domicilioRepository.save(domicilio1);
    }

    @Override
    public void eliminar(Long id) {
    domicilioRepository.deleteById(id);
    }
}
