package co.madelem.notificaciones.logica;

import co.madelem.notificaciones.dominio.Usuario;

public interface CanalNotificacion {
    void enviarNotificacion(String mensaje, Usuario usuario);
}