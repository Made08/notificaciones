package co.madelem.notificaciones.logica;

import co.madelem.complejo.dominio.Usuario;
import co.madelem.complejo.dominio.TipoNotificacion;

import java.util.List;

public class ServicioNotificaciones {

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

}
