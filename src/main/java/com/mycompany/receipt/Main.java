/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.receipt;
import java.util.Date;
/**
 *
 * @author XPG
 */
public class Main {





    public static void main(String[] args) {
        // Creación de una factura de ejemplo
        Receipt factura = new Receipt("FAC001", new Date(), 1000.0f, 10);

        // Cálculo del total de la factura
        factura.calcularTotal();

        // Imprimir los detalles de la factura
        System.out.println("Código de factura: " + factura.getCodigo());
        System.out.println("Fecha de emisión: " + factura.getFechaEmision());
        System.out.println("Importe de la factura: " + factura.getImporteFactura());
        System.out.println("Importe deducción: " + factura.getImporteDeduccion());
        System.out.println("Importe IVA: " + factura.getImporteIVA());
        System.out.println("Importe total: " + factura.getImporteTotal());
    }
}

    
