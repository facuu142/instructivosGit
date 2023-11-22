package com.salud.equipoT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salud.equipoT.entidad.Consulta;
import com.salud.equipoT.entidad.ObraSocial;
import com.salud.equipoT.entidad.Paciente;
import com.salud.equipoT.entidad.Rol;
import com.salud.equipoT.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public void crearPaciente(Long dni, String nombre, String email, String password, ObraSocial obraSocial) {
        Paciente paciente = new Paciente();
        paciente.setDni(dni);
        paciente.setNombre(nombre);
        paciente.setEmail(email);
        paciente.setPassword(password);
        paciente.setObraSocial(obraSocial);
        paciente.setRol(Rol.PACIENTE);
        
        pacienteRepository.save(paciente);

    }
    public void modificarPaciente(Paciente paciente){
    

    }
    public void eliminarPaciente(Paciente paciente){
        pacienteRepository.delete(paciente);
    }

    public Paciente buscarPaciente(Long dni){

        return pacienteRepository.findById(dni).orElse(null);
    }
    public List<Consulta> buscarHistoriaClinica(Long dni){

        return pacienteRepository.findHistoriClinica(dni);

}
public List<Paciente> listarPacientesObraSocial(ObraSocial obraSocial){

return pacienteRepository.findByObraSocial(obraSocial.getId());
}

}
