package com.example.trabajoIntegrador.repository;
import com.example.trabajoIntegrador.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository <Paciente, Long> {

}
