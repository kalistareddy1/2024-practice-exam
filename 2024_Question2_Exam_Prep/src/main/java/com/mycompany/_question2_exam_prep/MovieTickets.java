/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question2_exam_prep;

/**
 *
 * @author kalis
 */
public class MovieTickets implements IMovieTickets{
    private int numberOfTickets;
    private double ticketPrice;
    private String movieName;
    
    public MovieTickets(int numberOfTickets, double ticketPrice, String movieName) {
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
        this.movieName = movieName;
    }
    
    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double vat = 0.14; // 14% VAT
        double totalPrice = numberOfTickets * ticketPrice;
        return totalPrice + (totalPrice * vat);
    }

    @Override
    public boolean ValidateData(MovieTickets movieTicketData) {
        // Use the getters from MovieTicketData directly
        String movie = movieTicketData.getMovieName();
        int tickets = movieTicketData.getNumberOfTickets();
        double price = movieTicketData.getTicketPrice();

        boolean validMovie = movie.equalsIgnoreCase("Napoleon") ||
                         movie.equalsIgnoreCase("Oppenheimer") ||
                         movie.equalsIgnoreCase("Damsel");

        boolean validValues = tickets > 0 && price > 0;
    return validMovie && validValues;
    }
}
