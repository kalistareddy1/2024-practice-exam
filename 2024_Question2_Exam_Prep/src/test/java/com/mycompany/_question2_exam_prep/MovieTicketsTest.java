/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._question2_exam_prep;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kalis
 */
public class MovieTicketsTest {
    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        // Arrange
        MovieTickets mt = new MovieTickets(5, 100, "Napoleon");
        double expectedTotal = 5 * 100 * 1.14; // including 14% VAT

        // Act
        double actualTotal = mt.CalculateTotalTicketPrice(5, 100);

        // Assert
        assertEquals(expectedTotal, actualTotal, 0.001, "Total ticket price should be calculated correctly including VAT.");
    }

 @Test
    public void ValidateData_InvalidMovieName_ReturnsFalse() {
        // Arrange
        MovieTickets mt = new MovieTickets(3, 100, "InvalidMovie");

        // Act
        boolean isValid = mt.ValidateData(mt);

        // Assert
        assertFalse(isValid, "Validation should fail for invalid movie name.");
    }

    @Test
    public void ValidateData_InvalidNumberOfTickets_ReturnsFalse() {
        // Arrange
        MovieTickets mt = new MovieTickets(0, 100, "Napoleon");

        // Act
        boolean isValid = mt.ValidateData(mt);

        // Assert
        assertFalse(isValid, "Validation should fail when number of tickets is 0.");
    }

    @Test
    public void ValidateData_InvalidTicketPrice_ReturnsFalse() {
        // Arrange
        MovieTickets mt = new MovieTickets(3, -50, "Oppenheimer");

        // Act
        boolean isValid = mt.ValidateData(mt);

        // Assert
        assertFalse(isValid, "Validation should fail when ticket price is negative.");
    }

    @Test
    public void ValidateData_ValidData_ReturnsTrue() {
        // Arrange
        MovieTickets mt = new MovieTickets(2, 120, "Damsel");

        // Act
        boolean isValid = mt.ValidateData(mt);

        // Assert
        assertTrue(isValid, "Validation should succeed for valid movie, ticket number, and price.");
    }
}