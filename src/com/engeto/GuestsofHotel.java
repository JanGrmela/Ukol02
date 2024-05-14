package com.engeto;


import java.time.LocalDate;

public class GuestsofHotel {
    String name;
    String surname;
    LocalDate birthdate;

    public GuestsofHotel(String name, String surname,LocalDate birthdate ) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate() {
        this.birthdate = birthdate;
    }


}


