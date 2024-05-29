package co.madelem.notificaciones.dominio;

import java.util.List;

public class Usuario {
    private String nombreUsuario;
    private String email;
    private String numeroTelefono;
    private List<TipoNotificacion> preferenciasNotificacion;

    public Usuario(String nombreUsuario, String email, String numeroTelefono, List<TipoNotificacion> preferenciasNotificacion) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.preferenciasNotificacion = preferenciasNotificacion;

        System.out.println(this);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public List<TipoNotificacion> getPreferenciasNotificacion() {
        return preferenciasNotificacion;
    }

    @Override
    public String toString() {
        return "Usuario [nombreUsuario=" + nombreUsuario + ", email=" + email + ", numeroTelefono=" + numeroTelefono
                + ", preferenciasNotificacion=" + preferenciasNotificacion + "]";
    }
}