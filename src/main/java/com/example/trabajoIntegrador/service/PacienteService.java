package com.example.trabajoIntegrador.service;
import com.example.trabajoIntegrador.entity.Domicilio;
import com.example.trabajoIntegrador.entity.Paciente;


import java.util.List;

public interface PacienteService {

    List<Paciente>obtenerTodos();
    Paciente obtener(Long id);
    Paciente agregar(Paciente paciente);
    Paciente modificar(Paciente paciente, Long id);
    void eliminar(Long id);

}
