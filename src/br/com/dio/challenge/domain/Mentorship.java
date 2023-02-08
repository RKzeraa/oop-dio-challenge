package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentorship extends Contents{

    private LocalDate date;

    public Mentorship() {
    }

    @Override
    public double calculateXp() {
        return XP_DEFAULT + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title=" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

}
