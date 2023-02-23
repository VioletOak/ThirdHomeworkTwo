package com.example.thirdhomeworktwo;

public class ChildTicket extends Ticket {

    private float ticketDiscount;

    public ChildTicket(float ticketPrice, int numberOfTickets, int ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public ChildTicket(float price, String departureDate, String arrivalDate, int distance, String departurePoint, String arrivalPoint, String travelTime, int numberOfTickets) {
        super(price, departureDate, arrivalDate, distance, departurePoint, arrivalPoint, travelTime, numberOfTickets);
    }

    public float countTicketPrice() {
        return (getPrice() * getNumberOfTickets() * (100 - ticketDiscount)) / 100;
    }
}