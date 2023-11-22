package com.salud.equipoT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.salud.equipoT.entidad.Consulta;
import com.salud.equipoT.entidad.Paciente;

import java.util.List;
import java.util.Optional;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long>{

    Optional<Paciente> findById(Long dni);
    
    @Query("SELECT Paciente From Paciente P WHERE P.email =: 'email'")
    Paciente findByEmail(@Param ("email") String email);

    @Query("SELECT HistoriClinica FROM Paciente P WHERE P.id = :id")
    List<Consulta> findHistoriClinica(@Param ("id") Long dni);
    
    @Query("SELECT * FROM Paciente P WHERE P.obraSocial = :obraSocial")
    List<Paciente> findByObraSocial(@Param ("obraSocial") Long obraSocial);
}
