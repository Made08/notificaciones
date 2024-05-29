package co.madelem.notificaciones;

import co.madelem.notificaciones.dominio.Usuario;
import co.madelem.notificaciones.dominio.TipoNotificacion;
import co.madelem.notificaciones.logica.ServicioNotificaciones;

import java.util.Arrays;

// Clase principal que ejecuta un ejemplo de uso del sistema de notificaciones
public class Aplicacion {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Madelem Chico", "madelenchicovelasco@gmail.com", "1234567890", Arrays.asList(TipoNotificacion.EMAIL, TipoNotificacion.SMS));
        ServicioNotificaciones servicioNotificaciones = new ServicioNotificaciones();
        servicioNotificaciones.notificarUsuario("Este es un mensaje de prueba", usuario);
    }
}