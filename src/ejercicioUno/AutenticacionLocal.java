package ejercicioUno;

public class AutenticacionLocal implements GestorAutenticacion {
    @Override
    public void gestionarAutenticacion(String username, String password) {
        System.out.println("Autenticando de manera local.");
    }

}
