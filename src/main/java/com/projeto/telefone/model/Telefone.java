package com.exemplo.telefone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTelefone;

    private String numero;
    private String tipoTelefone;
    private String ddd;

    // Construtor sem argumentos
    public Telefone() {}

    // Construtor com argumentos
    public Telefone(int idTelefone, String numero, String tipoTelefone, String ddd) {
        this.idTelefone = idTelefone;
        this.numero = numero;
        this.tipoTelefone = tipoTelefone;
        this.ddd = ddd;
    }

    // Getters e Setters
    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
