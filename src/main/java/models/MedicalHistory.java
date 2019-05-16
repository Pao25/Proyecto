/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Clase que contiene los metodos y el metodo constructor del objeto historial medico.
 * @author Karen Lopez
 * @version  1.0
 * @since Control_customer 1.0
 */
public class MedicalHistory {

    private int id;
    private String disease;
    private String description;

    public MedicalHistory(int id, String disease, String description) {
        this.id = id;
        this.disease = disease;
        this.description = description;
    }

    public MedicalHistory(String disease, String description) {
        this.disease = disease;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
