package Repaso1;

public class SalaVIP extends Sala{
    protected String beneficios;

    public SalaVIP(String beneficios) {
        this.beneficios = beneficios;
    }

    public SalaVIP(int numero, int capacidad, String beneficios) {
        super(numero, capacidad);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
