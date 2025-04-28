package Repaso1;

public class ClienteVIP extends Cliente {
    protected float descuento;

    public ClienteVIP(float descuento) {
        this.descuento = descuento;
    }
    public ClienteVIP(String nombre, String email, float descuento) {
        super(nombre, email); // super -> Llama al constructor de Cliente
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = (float) descuento;
    }
}
