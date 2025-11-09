/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._question1_exam_prep;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kalis
 */
public class MovieTicketsTest {
     @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        // Arrange
        MovieTickets mt = new MovieTickets();
        int[] movieTicketSales = {3000, 1500, 1700}; // Example sales for one movie
        int expectedTotal = 3000 + 1500 + 1700; // 6200

        // Act
        int actualTotal = mt.TotalMovieSales(movieTicketSales);

        // Assert
        assertEquals(expectedTotal, actualTotal, "The total movie sales should be correctly calculated.");
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        // Arrange
        MovieTickets mt = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300}; // Totals for each movie
        String expectedTopMovie = "Oppenheimer";

        // Act
        String actualTopMovie = mt.TopMovie(movies, totalSales);

        // Assert
        assertEquals(expectedTopMovie, actualTopMovie, "The top performing movie should be correctly identified.");
    }
}
