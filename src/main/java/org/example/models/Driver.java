package org.example.models;

public class Driver {
    private Long id;
    private String name;
    private String lastname;
    private Position position;
    private String number;
    private String carType;
    private String carColor;

    public Driver(Long id, String name, String lastname, Position position, String number, String carType, String carColor) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.number = number;
        this.carType = carType;
        this.carColor = carColor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
