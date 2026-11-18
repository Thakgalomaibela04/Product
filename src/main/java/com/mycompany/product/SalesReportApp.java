/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;
/**
 *
 * @author Student
 */
import java.util.Scanner;

public class SalesReportApp {
    public static void main(String[] args) {
        // Single-dimensional array for product names
        try (Scanner scanner = new Scanner(System.in)) {
            // Single-dimensional array for product names
            String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
            
            // Two-dimensional array to store sales [3 products][3 months]
            int[][] sales = new int[3][3];
            
            // Input loop
            for (int i = 0; i < products.length; i++) {
                for (int month = 0; month < 3; month++) {
                    System.out.print("Enter number of sales for month " + (month + 1) + " for " + products[i] + " mattress: ");
                    sales[i][month] = scanner.nextInt();
                }
            }
            
            // Create Product object
            Product product = new Product(sales, products);
            PrintProduct printer = new PrintProduct();
            
            // Print Report
            System.out.println("\nPRODUCT SALES REPORT - 2026");
            System.out.println("*************************************************");
            printer.PrintTotalSales(product);
            printer.PrintAverageSales(product);
            printer.PrintMostPopularProduct(product);
        }
    }
}