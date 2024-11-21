package ejercicioDos;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void obtenerArchivo(String nombreArchivo) {
        almacenamiento.recuperarArchivo(nombreArchivo);
    }

    public void guardarArchivo(String nombreArchivo) {
        almacenamiento.guardarArchivo(nombreArchivo);
    }
}
