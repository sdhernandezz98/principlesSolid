/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.receiptapp;

/**
 *
 * @author XPG
 */
public class DeductionCalculator {
    
    public float calculateDeduction(float amountInvoice, float percentageDeduction) {
        if (amountInvoice > 10000) {
            return (amountInvoice * (percentageDeduction + 3)) / 100;
        } else {
            return (amountInvoice * percentageDeduction) / 100;
        }
    }

    
}
