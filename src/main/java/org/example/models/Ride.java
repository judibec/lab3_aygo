package org.example.models;

public class Ride {
    private Long id;
    private Position origin;
    private Position destination;
    private User user;
    private Driver driver;
    private Payment payment;
    private String state;

    public Ride() {
    }

    public Ride(Long id, Position origin, Position destination, User user, Driver driver, Payment payment, String state) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.user = user;
        this.driver = driver;
        this.payment = payment;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Position getOrigin() {
        return origin;
    }

    public void setOrigin(Position origin) {
        this.origin = origin;
    }

    public Position getDestination() {
        return destination;
    }

    public void setDestination(Position destination) {
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
