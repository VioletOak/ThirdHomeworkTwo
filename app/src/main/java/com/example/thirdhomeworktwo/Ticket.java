package com.example.thirdhomeworktwo;

import android.os.Bundle;

public class Ticket {
    private float price;
    private String departureDate;
    private String arrivalDate;
    private int distance;
    private String departurePoint;
    private String arrivalPoint;
    private String travelTime;
    private int numberOfTickets;

    public Ticket(float ticketPrice, int numberOfTickets) {
        this.price = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public Ticket(float price, String departureDate, String arrivalDate, int distance,
                  String departurePoint, String arrivalPoint, String travelTime, int numberOfTickets) {
        this.price = price;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.distance = distance;
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.travelTime = travelTime;
        this.numberOfTickets = numberOfTickets;
    }

    public float getPrice() {
        return price;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public int getDistance() {
        return distance;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public int getNumberOfTickets() { return numberOfTickets;}

    public float countTicketPrice() {
        return price * numberOfTickets;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", departureDate='" + departureDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", distance=" + distance +
                ", departurePoint='" + departurePoint + '\'' +
                ", arrivalPoint='" + arrivalPoint + '\'' +
                ", travelTime='" + travelTime + '\'' +
                ", numberOfTickets=" + numberOfTickets +
                '}';
    }

}
