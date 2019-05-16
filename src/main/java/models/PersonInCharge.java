/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * Clase que contiene los metodos y el metodo constructor del objeto persona encargada.
 * @author Karen Lopez
 * @version  1.0
 * @since Control_customer 1.0
 */
public class PersonInCharge {

    private int id;
    private String firstName;
    private String lastName;
    private String kinship;
    private String numberPhone;

    public PersonInCharge(int id, String firstName, String lastName, String kinship, String numberPhone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.kinship = kinship;
        this.numberPhone = numberPhone;
    }

    public PersonInCharge(String firstName, String lastName, String kinship, String numberPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.kinship = kinship;
        this.numberPhone = numberPhone;
    }

    public PersonInCharge(int id, String firstName, String lastName, String numberPhone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKinship() {
        return kinship;
    }

    public void setKinship(String kinship) {
        this.kinship = kinship;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

}
