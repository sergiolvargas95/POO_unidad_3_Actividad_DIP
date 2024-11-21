package ejercicioUno;

public class AutenticacionOAuth implements GestorAutenticacion{
    @Override
    public void gestionarAutenticacion(String username, String password) {
        System.out.println("Gestionando contraseñá por OAuth");
    }
}

