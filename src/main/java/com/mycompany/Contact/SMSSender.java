/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Contact;

/**
 *
 * @author XPG
 */
public class SMSSender {

    public static void sendSMS(Contact c, String message) {
        // Envía un mensaje SMS al teléfono del Contacto c.
        System.out.println("Enviando SMS a " + c.getTelephone());
        System.out.println("Mensaje: " + message);
    }
}

