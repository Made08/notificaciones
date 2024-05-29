package co.madelem.notificaciones;

import co.madelem.notificaciones.dominio.Usuario;
import co.madelem.notificaciones.dominio.TipoNotificacion;
import co.madelem.notificaciones.logica.ServicioNotificaciones;

import java.util.Arrays;

// Clase principal que ejecuta un ejemplo de uso del sistema de notificaciones
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| 📝 Validacion Patrones de Diseño, UCC 2024                 |");
        System.out.println("| 👩🏻 Madelem Chico Velasco, Developer                        |");
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 🔔 Caso 2: Sistemas de Notificaciones                      |");
        System.out.println("+------------------------------------------------------------+");

        System.out.println("🔥Inicio Ejecucion: Sistema de Notificaciones\n");

        Usuario usuario = new Usuario("Madelem Chico", "madelenchicovelasco@gmail.com", "1234567890", Arrays.asList(TipoNotificacion.EMAIL, TipoNotificacion.SMS));
        ServicioNotificaciones servicioNotificaciones = new ServicioNotificaciones();
        servicioNotificaciones.notificarUsuario("Este es un mensaje de prueba", usuario);

        System.out.println("\n");
        System.out.println("🎯Fin Ejecucion: Complejo Deportivo");
    }
}