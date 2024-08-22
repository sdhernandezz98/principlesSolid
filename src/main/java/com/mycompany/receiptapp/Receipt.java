/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.receiptapp;

import java.util.Date;

/**
 *
 * @author XPG
 */
  


public class Receipt {
    private String code;
    private Date dateEmission;
    private float amountInvoice;
    private float amountIVA;
    private float amountDeduction;
    private float amountTotal;
    private float percentageDeduction;

    private DeductionCalculator deductionCalculator = new DeductionCalculator();
    private IVACalculator ivaCalculator = new IVACalculator();

        public Receipt (String code, Date dateEmission, float amountInvoice, float percentageDeduction) {
        this.code = code;
        this.dateEmission = dateEmission;
        this.amountInvoice = amountInvoice;
        this.percentageDeduction = percentageDeduction;
    }

    public void calculateTotal() {
        amountDeduction = deductionCalculator.calculateDeduction(amountInvoice, percentageDeduction);
        amountIVA = ivaCalculator.calculateIVA(code, amountInvoice);
        amountTotal = (amountInvoice - amountDeduction) + amountIVA;
    }

    public void showReceipt() {
        System.out.println("Código: " + code);
        System.out.println("Fecha de Emisión: " + dateEmission);
        System.out.println("Importe Factura: " + amountInvoice);
        System.out.println("Importe Deducción: " + amountDeduction);
        System.out.println("Importe IVA: " + amountIVA);
        System.out.println("Importe Total: " + amountTotal);
    }
}

   
