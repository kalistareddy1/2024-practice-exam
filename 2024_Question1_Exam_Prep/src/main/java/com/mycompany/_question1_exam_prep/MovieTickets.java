/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question1_exam_prep;

/**
 *
 * @author kalis
 */
public class MovieTickets implements IMovieTickets{
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int saleTotal = 0;
        for (int sale : movieTicketSales) {
            saleTotal += sale;
        }
        return saleTotal;
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int maxSales = totalSales[0];
        int topIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topIndex = i;
            }
        }
        return movies[topIndex];
    } 
}
