package Repaso1;

import java.util.List;

public class Funcion {
    private String horario;
    private Pelicula pelicula;
    private List<Entrada> entradas;

    public Funcion(String horario, Pelicula pelicula) {
        this.horario = horario;
        this.pelicula = pelicula;
    }

    public Funcion(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
