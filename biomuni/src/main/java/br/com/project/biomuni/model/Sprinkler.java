package br.com.project.biomuni.model;

import com.sun.istack.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Weather {

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
    private String status;
}
