package ejercicioTres;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte generadorReportePDF = new ReportePDF();

        GestorReportes gestorReportes = new GestorReportes(generadorReportePDF);

        gestorReportes.generarMisReportes();
    }
}
