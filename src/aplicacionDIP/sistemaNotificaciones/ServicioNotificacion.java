package aplicacionDIP.sistemaNotificaciones;

public interface ServicioNotificacion {
    void enviarMensaje(String destinatario, String mensaje);
}
