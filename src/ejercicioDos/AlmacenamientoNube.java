package ejercicioDos;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo) {
        System.out.println("Guardando archivo en la nube.");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando archivo en la nube.");
    }
}
