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
    


public class Main {
    public static void main(String[] args) {
        Receipt receipt = new Receipt("1", new Date(), 15000, 5);
        receipt.calculateTotal();
        receipt.showReceipt();

        Receipt receiptWithoutIVA = new Receipt("0", new Date(), 8000, 5);
        receiptWithoutIVA.calculateTotal();
        receiptWithoutIVA.showReceipt();
    }
}

    
