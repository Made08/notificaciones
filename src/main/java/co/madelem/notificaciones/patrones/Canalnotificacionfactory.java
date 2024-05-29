package co.madelem.notificaciones;

public class Canalnotificacionfactory {
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
