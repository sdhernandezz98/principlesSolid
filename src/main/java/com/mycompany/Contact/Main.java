/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Contact;

/**
 *
 * @author XPG
 */
public class Main {
    public static void main(String[] args) {
        // Crear un objeto GmailAccount
        GmailAccount gmailAccount = new GmailAccount("Juan Pérez", "juan.perez@gmail.com");

        // Enviar un correo electrónico utilizando EmailSender
        EmailSender.sendEmail(gmailAccount, "Hola Juan, este es un correo de prueba.");

        // Si deseas también podrías probar el envío de un SMS (si se implementa el número de teléfono)
        gmailAccount.setTelephone("555-1234");
        SMSSender.sendSMS(gmailAccount, "Este es un mensaje de prueba vía SMS.");
    }
}
