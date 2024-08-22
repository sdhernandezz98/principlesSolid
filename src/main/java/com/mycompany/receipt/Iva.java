/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.receipt;

/**
 *
 * @author XPG
 */
public class Iva {
  
    private static final float TASA_IVA = 0.21f; // Por ejemplo, 21%

    // Método que calcula el IVA
    public float calculaIva(float importeFactura) {
        return importeFactura * TASA_IVA;
    }
}

    
