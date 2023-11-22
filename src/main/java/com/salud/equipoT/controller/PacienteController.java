package com.salud.equipoT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salud.equipoT.entidad.ObraSocial;
import com.salud.equipoT.service.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
   
    @Autowired
    PacienteService pacienteService;
    
    @GetMapping("/registrar")
    public String registrarPaciente(){
        return "registro.html";
    }    

    @PostMapping("/registro")
    public String registro(@RequestAttribute Long dni,@RequestAttribute  String nombre,@RequestAttribute  String email,@RequestAttribute  String password, ObraSocial obraSocial){

       pacienteService.crearPaciente(dni, nombre, email, password, obraSocial);;
        
        

        return "registro.html";
    }
}
