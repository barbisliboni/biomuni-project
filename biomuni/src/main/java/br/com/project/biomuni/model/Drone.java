package br.com.project.biomuni.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "drone")
public class Drone {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String hour;

    @NotNull
    private String date;

    @NotNull
    private String country;

    @NotNull
    private boolean status;
}
