/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.liskovproject;

/**
 *
 * @author XPG
 */
public class LiskovProject {

    public static void main(String[] args) {
        Configuration configuracion = new Configuration();

        // Registrando las configuraciones
        configuracion.registerConfiguration(new SystemConfiguration());
        configuracion.registerConfiguration(new UserConfiguration());
        configuracion.registerConfiguration(new HourlyConfiguration());

        // Cargar y guardar las configuraciones
        configuracion.chargeConfiguration();
        configuracion.saveConfiguration();

        // Notificar los cambios realizados en las configuraciones que lo soportan
        configuracion.notificarCambios();
    }
}
