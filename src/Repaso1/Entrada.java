package Repaso1;

public class Entrada {
    private Double precio;
    private  String asiento;

    public Entrada(Double precio, String asiento) {
        this.precio = precio;
        this.asiento = asiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
}
