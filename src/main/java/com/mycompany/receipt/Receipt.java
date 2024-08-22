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
public class Receipt {
 

    private String codigo;
    private Date fechaEmision;
    private float importeFactura;
    private float importeIVA;
    private float importeDeduccion;
    private float importeTotal;
    private int porcentajeDeduccion;

    public Receipt(String codigo, Date fechaEmision, float importeFactura, int porcentajeDeduccion) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.importeFactura = importeFactura;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        Deduction deduccion = new Deduction();
        importeDeduccion = deduccion.calculaDeduccion(importeFactura, porcentajeDeduccion);

        // Calculamos el IVA
        Iva iva = new Iva();
        importeIVA = iva.calculaIva(importeFactura);

        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public float getImporteFactura() {
        return importeFactura;
    }

    public float getImporteIVA() {
        return importeIVA;
    }

    public float getImporteDeduccion() {
        return importeDeduccion;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public int getPorcentajeDeduccion() {
        return porcentajeDeduccion;
    }
}

   
