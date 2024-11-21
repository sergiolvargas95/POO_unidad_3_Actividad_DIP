package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();

        GestorArchivos gestorArchivos = new GestorArchivos(almacenamientoNube);

        gestorArchivos.guardarArchivo("actividad_unidad_1");

    }
}
