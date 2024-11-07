package org.example.models;

public class User {
    private Long id;
    private String name;
    private String lastname;
    private Position position;
    private String number;
    private String hasCard;
    private String cardNumber;

    public User(Long id, String name, String lastname, Position position, String number, String hasCard, String cardNumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.number = number;
        this.hasCard = hasCard;
        this.cardNumber = cardNumber;
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

    public String getHasCard() {
        return hasCard;
    }

    public void setHasCard(String hasCard) {
        this.hasCard = hasCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
