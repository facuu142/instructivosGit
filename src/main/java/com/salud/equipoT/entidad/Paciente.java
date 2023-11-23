package com.salud.equipoT.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "paciente")
public class Paciente {

    
    @Id
    private Long id;
    private String nombre;
    private String email;
    private String password;
    @OneToOne()
    private ObraSocial obrasocial;
    @OneToOne()
    private HistoriaClinica historiaclinica;
    @Enumerated(EnumType.STRING)
    private Rol rol;



    
}