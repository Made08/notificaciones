package co.madelem.notificaciones.patrones;

import co.madelem.notificaciones.dominio.TipoNotificacion;
import co.madelem.notificaciones.logica.CanalEmail;
import co.madelem.notificaciones.logica.CanalSMS;
import co.madelem.notificaciones.logica.CanalPush;
import co.madelem.notificaciones.logica.CanalNotificacion;

public class FabricaCanalNotificacion {
    public static CanalNotificacion crearCanal(TipoNotificacion tipo) {
        switch (tipo) {
            case EMAIL:
                return new CanalEmail();
            case SMS:
                return new CanalSMS();
            case PUSH:
                return new CanalPush();
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado.");
        }
    }
}
