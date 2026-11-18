/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.product;

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    private final int[][] salesData;
    private final String[] productNames;

    // Constructor accepts the 2D array and product names
    public Product(int[][] salesData, String[] productNames) {
        this.salesData = salesData;
        this.productNames = productNames;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] salesData1 : salesData) {
            for (int j = 0; j < salesData1.length; j++) {
                total += salesData1[j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        // Total number of entries = number of products * number of months
        int totalEntries = salesData.length * salesData[0].length;
        return (double) total / totalEntries;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        String mostPopular = "";
        
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            
            if (productTotal > maxSales) {
                maxSales = productTotal;
                mostPopular = productNames[i] + " (" + maxSales + ")";
            }
        }
        return mostPopular;
    }
}