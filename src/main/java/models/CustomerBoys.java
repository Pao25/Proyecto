/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Clase que contiene los metodos y el metodo constructor del objeto niño.
 *
 * @author Karen Lopez
 * @version 1.0
 * @since Control_customer 1.0
 */
import java.sql.Date;
import java.time.LocalDate;

public class CustomerBoys {

    private int id;
    private String firstNamec;
    private String lastNamec;
    private LocalDate birdthDate;
    private LocalDate dateAdmission;
    private int idPersonInCharge;
    private String firstName;
    private String lastName;
    private String kinship;
    private int idMedical;
    private String disease;
    private String description;

    //Metodo del contructor CustomerBoys contiene los datos para agregar.
    public CustomerBoys(int id, String firstNamec, String lastNamec, LocalDate birdthDate, LocalDate dateAdmission, int idPersonInCharge, int idMedical) {
        this.id = id;
        this.firstNamec = firstNamec;
        this.lastNamec = lastNamec;
        this.birdthDate = birdthDate;
        this.dateAdmission = dateAdmission;
        this.idPersonInCharge = idPersonInCharge;
        this.idMedical = idMedical;
    }

    public CustomerBoys(String firstNamec, String lastNamec, Date birdthDate, Date dateAdmission, int idPersonInCharge, int idMedical) {
        this.firstNamec = firstNamec;
        this.lastNamec = lastNamec;
        this.birdthDate = birdthDate.toLocalDate();
        this.dateAdmission = dateAdmission.toLocalDate();
        this.idPersonInCharge = idPersonInCharge;
        this.idMedical = idMedical;
    }

    public CustomerBoys(int idPersonInCharge, int idMedical, String firstNamec, String lastNamec, LocalDate birdthDate, LocalDate dateAdmission) {
        this.idPersonInCharge = idPersonInCharge;
        this.idMedical = idMedical;
        this.firstNamec = firstNamec;
        this.lastNamec = lastNamec;
        this.birdthDate = birdthDate;
        this.dateAdmission = dateAdmission;
    }

    public CustomerBoys(int idPersonInCharge, int idMedical, String firstNamec, String lastNamec, Date birdthDate, Date dateAdmission) {
        this.idPersonInCharge = idPersonInCharge;
        this.idMedical = idMedical;
        this.firstNamec = firstNamec;
        this.lastNamec = lastNamec;
        this.birdthDate = birdthDate.toLocalDate();
        this.dateAdmission = dateAdmission.toLocalDate();
    }

    public CustomerBoys(int id, String firstNamec, String lastNamec, Date birdthDate, Date dateAdmission, int idPersonInCharge, String firstName, String lastName, int idMedical, String disease) {
        this.id = id;
        this.firstNamec = firstNamec;
        this.lastNamec = lastNamec;
        this.birdthDate = birdthDate.toLocalDate();
        this.dateAdmission = dateAdmission.toLocalDate();
        this.idPersonInCharge = idPersonInCharge;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idMedical = idMedical;
        this.disease = disease;
    }

    public CustomerBoys(int id, String firstNamec, String lastNamec, int idPersonInCharge, String firstName, String lastName, String kinship, int idMedical, String disease, String description) {
        this.id = id;
        this.firstNamec = firstNamec;
        this.lastNamec = lastNamec;
        this.idPersonInCharge = idPersonInCharge;
        this.firstName = firstName;
        this.lastName = lastName;
        this.kinship = kinship;
        this.idMedical = idMedical;
        this.disease = disease;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getFirstNamec() {
        return firstNamec;
    }

    public void setFirstNamec(String firstNamec) {
        this.firstNamec = firstNamec;
    }

    public String getLastNamec() {
        return lastNamec;
    }

    public void setLastNamec(String lastNamec) {
        this.lastNamec = lastNamec;
    }

    public LocalDate getBirdthDate() {
        return birdthDate;
    }

    public String getDateString() {
        return birdthDate.toString();
    }

    public void setBirdthDate(LocalDate birdthDate) {
        this.birdthDate = birdthDate;
    }

    public LocalDate getDateAdmission() {
        return dateAdmission;
    }

    public String getDateAString() {
        return dateAdmission.toString();
    }

    public void setDateAdmission(LocalDate dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public int getIdPersonInCharge() {
        return idPersonInCharge;
    }

    public void setIdPersonInCharge(int idPersonInCharge) {
        this.idPersonInCharge = idPersonInCharge;
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

    public int getIdMedical() {
        return idMedical;
    }

    public void setIdMedical(int idMedical) {
        this.idMedical = idMedical;
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
