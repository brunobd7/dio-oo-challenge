package br.com.challenge.domain;

import java.time.LocalDate;

public class Mentorship {

    private String tittle;
    private String description;
    private LocalDate date;


    public Mentorship() {
    }

    public Mentorship(String tittle, String description, LocalDate date) {
        this.tittle = tittle;
        this.description = description;
        this.date = date;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
