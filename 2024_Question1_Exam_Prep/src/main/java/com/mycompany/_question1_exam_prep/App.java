/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._question1_exam_prep;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kalis
 */
public class App {
    public static int total;
    
    public static void main(String[] args) {
        //Declaring and populating 1D arrays
        String[] month = {"JAN", "FEB", "MAR"};
        String[] movie = {"Napoleon", "Oppenheimer"};
       
        //Populating 2D array
        int[][] movieTicketSales = {{3000, 1500, 1700},
                               {3500, 1200, 1600}};
        
        display(month, movie, movieTicketSales);   
    }
    
    public static int[] splittingMethod(int[][] movieTicketSales){
        List<Integer> values = new ArrayList<>();
        
        for (int i = 0; i < movieTicketSales.length; i++) {         
            for (int j = 0; j < movieTicketSales[i].length; j++) {
                values.add(movieTicketSales[i][j]); 
            }
        }
        int[] totalSales = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            totalSales[i] = values.get(i);
        }
        return totalSales;
    } 
    
    public static void display(String[] month, String[] movie, int[][] movieTicketSales){
        //Creating an instance of the movie tickets class
        MovieTickets tms = new MovieTickets();
        
        //Display
        System.out.println("MOVIE TICKET SALES REPORT - 2024\n"); 
        for (int i = 0; i < month.length; i++) {
            System.out.print("\t\t" + month[i]);
        }
        System.out.println("\n" + "-".repeat(72));    
        
        int[] totalSalesPerMovie = new int[movie.length];
        
        for (int i = 0; i < movie.length; i++) {
            if (movie[i].length() > 8) {
                System.out.print(movie[i] + "\t");  
            }else{
                System.out.print(movie[i] + "\t\t"); 
            }
            
            total = 0;
            for (int j = 0; j < movieTicketSales[i].length; j++) {
                System.out.print(movieTicketSales[i][j] + "\t\t");
                total += movieTicketSales[i][j];
            }
            totalSalesPerMovie[i] = total;
            System.out.println();
        } 
        
        System.out.println();
        for (int i = 0; i < movie.length; i++) {
//            totalSalesPerMovie[i] = total;
            System.out.println("Total movie ticket sales for " + movie[i] + " " + totalSalesPerMovie[i]);
        }
        
        System.out.println();
        System.out.println("Top performing movie: " + tms.TopMovie(movie, totalSalesPerMovie));
    }    
}
