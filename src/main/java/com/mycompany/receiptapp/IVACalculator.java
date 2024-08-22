/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.receiptapp;

/**
 *
 * @author XPG
 */
public class IVACalculator {
    
    private static final float IVA_PORCENTAJE = 0.16f;  // Cambia este valor a 0.18f si cambia el IVA

    public float calculateIVA(String code, float amountInvoice) {
        if ("0".equals(code)) {
            return 0;
        }
        return amountInvoice * IVA_PORCENTAJE;
    }
}

    

