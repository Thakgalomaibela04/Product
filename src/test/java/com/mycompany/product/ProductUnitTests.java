/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductUnitTests {

    // Sample Data matching the screenshot
    String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    int[][] data = {
        {25, 18, 20}, // Cozy Nights = 63
        {15, 10, 12}, // Restonic = 37
        {18, 15, 20}  // Sealy = 53
    };

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product p = new Product(data, names);
        // Expected total: 63 + 37 + 53 = 153
        assertEquals(153, p.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product p = new Product(data, names);
        // Expected average: 153 / 9 = 17.0
        assertEquals(17.0, p.GetAverageProductSold(), 0.01);
    }
}