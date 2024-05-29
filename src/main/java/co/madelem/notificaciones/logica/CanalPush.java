package co.madelem.notificaciones.logica;

import co.madelem.notificaciones.dominio.Usuario;

// Implementación del canal de notificación push
public class CanalPush implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando notificación push a " + usuario.getNombreUsuario() + ": " + mensaje);
    }
}