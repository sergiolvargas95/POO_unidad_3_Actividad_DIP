package ejercicioUno;

public class Main {
    public static void main(String[] args) {
        GestorAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        ServicioAutenticacion servicioAutenticacion = new ServicioAutenticacion(autenticacionOAuth);

        servicioAutenticacion.autenticar("redhood", "password1234");
    }
}
