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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dni")
    private Long dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @OneToOne()
    @JoinColumn(name = "obraSocial_id" ,referencedColumnName = "id")
    private ObraSocial obraSocial;
    @OneToOne()
    @JoinColumn(name = "historiaClinica_id" ,referencedColumnName = "id")
    private HistoriaClinica hitoriaClinica;
    @Enumerated(EnumType.STRING)
    private Rol rol;



    
}