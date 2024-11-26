package com.parkauto.rest.entity;


import jakarta.persistence.*;

@Entity
@Table(name="VEHICULE")
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idvehicule")
    private Long matricule;

    @Column(name="anneeModel")
    private int anneeModel;

    @Column(name="prix")
    private double prix;









}
