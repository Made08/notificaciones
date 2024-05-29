package co.madelem.notificaciones.logica;

import co.madelem.notificaciones.dominio.Usuario;

// Implementación del canal de notificación por correo electrónico
public class CanalEmail implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando email a " + usuario.getEmail() + ": " + mensaje);
    }
}