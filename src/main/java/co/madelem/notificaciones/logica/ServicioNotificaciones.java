package co.madelem.notificaciones.logica;

import co.madelem.notificaciones.dominio.Usuario;
import co.madelem.notificaciones.dominio.TipoNotificacion;
import co.madelem.notificaciones.patrones.FabricaCanalNotificacion;

import java.util.List;

// Clase que gestiona el envío de notificaciones a los usuarios
public class ServicioNotificaciones {
    public void notificarUsuario(String mensaje, Usuario usuario) {
        List<TipoNotificacion> preferencias = usuario.getPreferenciasNotificacion();
        for (TipoNotificacion tipo : preferencias) {
            CanalNotificacion canal = FabricaCanalNotificacion.crearCanal(tipo);
            canal.enviarNotificacion(mensaje, usuario);
        }
    }
}