package aplicacionDIP.sistemaPago;

public class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }
}
