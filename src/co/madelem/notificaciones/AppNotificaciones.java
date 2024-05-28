package co.madelem.notificaciones;

import co.madelem.dominio.Usuario;
import co.madelem.dominio.TipoNotificacion;

import java.util.Arrays;

public class AppNotificaciones {
    // Clase principal que ejecuta un ejemplo de uso del sistema de notificaciones
    public class Principal {
        public static void main(String[] args) {
            Usuario usuario = new Usuario("Madelem Chico", "madelenchicovelasco@gmail.com", "1234567890", Arrays.asList(TipoNotificacion.EMAIL, TipoNotificacion.SMS));
            ServicioNotificaciones servicioNotificaciones = new ServicioNotificaciones();
            servicioNotificaciones.notificarUsuario("Este es un mensaje de prueba", usuario);
        }
    }
    
}
