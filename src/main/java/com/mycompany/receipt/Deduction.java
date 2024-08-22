/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.receipt;

/**
 *
 * @author XPG
 */
public class Deduction {
    // Método que calcula la deducción
    public float calculaDeduccion(float importeFactura, int porcentajeDeduccion) {
        return (importeFactura * porcentajeDeduccion) / 100;
    }
}

   