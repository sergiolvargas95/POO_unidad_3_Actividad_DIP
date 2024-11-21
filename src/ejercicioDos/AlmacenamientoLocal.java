package ejercicioDos;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo) {
        System.out.println("Guardar archivo de manera local.");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperar archivo de manera local.");
    }
}
