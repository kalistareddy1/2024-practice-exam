/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany._question2_exam_prep;

/**
 *
 * @author kalis
 */
public interface IMovieTickets {
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice); 
    boolean ValidateData(MovieTickets movieTicketData);
}
