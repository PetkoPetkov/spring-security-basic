package com.maistorat.model;

/**
 * Created by Petio on 26.2.2018 г..
 */
public class User {
    private Long id;
    private String firstName;
    private String surname;
    private String lastName;

    public User() {

    }
    public User(Long id) {
        this.id = id;
    }














    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
