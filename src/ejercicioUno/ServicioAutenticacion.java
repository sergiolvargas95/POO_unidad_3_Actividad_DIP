package ejercicioUno;

public class ServicioAutenticacion {
    private GestorAutenticacion gestorAutenticacion;

    public ServicioAutenticacion(GestorAutenticacion gestorAutenticacion) {
        this.gestorAutenticacion = gestorAutenticacion;
    }

    public void autenticar(String username, String password) {
        gestorAutenticacion.gestionarAutenticacion(username, password);
    }
}
