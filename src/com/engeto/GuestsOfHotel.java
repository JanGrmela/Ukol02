package com.engeto;

import java.time.LocalDate;

public class GuestsOfHotel {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;


    public GuestsOfHotel(String name, String surname, LocalDate dateOfBirth ) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setBirthdate() {
        this.dateOfBirth = dateOfBirth;
    }


}


