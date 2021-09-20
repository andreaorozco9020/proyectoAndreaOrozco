package com.example.trabajoIntegrador.service;
import com.example.trabajoIntegrador.entity.Odontologo;

import java.util.List;


public interface OdontologoService {

    List<Odontologo>obtenerTodos();
    Odontologo obtener (Long id);

    Odontologo agregar(Odontologo odontologo);

    Odontologo modificar(Odontologo odontologo, Long id);


}