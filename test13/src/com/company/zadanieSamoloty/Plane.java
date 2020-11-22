package com.company.zadanieSamoloty;


/*
    Justyna Makaruk
    Dany jest plik samoloty.txt w formacie:
    Justyna Makaruk
    nazwa_samolotu ; kolor : maksymalna prędkość ; opis
    Justyna Makaruk
    na podstawie pliku zaiwerającego informację o 5 samolotach, stwórz obiekty klasy Plane i wypisz je do konsoli
    Justyna Makaruk
    każda linia w pliku określa nowy samolot
 */


import java.util.Objects;

public class Plane {
    private String name;
    private String colour;
    private String maxSpeed;
    private String description;

    public Plane(String name, String colour, String maxSpeed, String description) {
        this.name = name;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toSaveString() {
        return  name + ';' + colour + ';' + maxSpeed + ';' + description;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return name.equals(plane.name) &&
                colour.equals(plane.colour) &&
                maxSpeed.equals(plane.maxSpeed) &&
                description.equals(plane.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour, maxSpeed, description);
    }
}
