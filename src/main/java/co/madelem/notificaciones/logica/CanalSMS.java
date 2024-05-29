package co.madelem.notificaciones.logica;

import co.madelem.notificaciones.dominio.Usuario;

// Implementación del canal de notificación por SMS
public class CanalSMS implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando SMS a " + usuario.getNumeroTelefono() + ": " + mensaje);
    }
}