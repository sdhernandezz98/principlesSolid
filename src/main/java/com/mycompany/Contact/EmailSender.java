/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Contact;

/**
 *
 * @author XPG
 */
public class EmailSender {
        public static void sendEmail(Contact c, String message) {
        // Envía un mensaje a la dirección de correo del Contacto c.
        System.out.println("Enviando correo a " + c.getEmailAddress());
        System.out.println("Mensaje: " + message);
    }
}
