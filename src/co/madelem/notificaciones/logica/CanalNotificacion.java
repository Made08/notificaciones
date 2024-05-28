package co.madelem.notificaciones.logica;

import co.madelem.complejo.dominio.Usuario;

public interface CanalNotificacion {
    void enviarNotificacion(String mensaje, Usuario usuario);
}

// Implementación del canal de notificación por correo electrónico
public class CanalEmail implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando email a " + usuario.getEmail() + ": " + mensaje);
    }
}

// Implementación del canal de notificación por SMS
public class CanalSMS implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando SMS a " + usuario.getNumeroTelefono() + ": " + mensaje);
    }
}

// Implementación del canal de notificación push
public class CanalPush implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando notificación push a " + usuario.getNombreUsuario() + ": " + mensaje);
    }
}
