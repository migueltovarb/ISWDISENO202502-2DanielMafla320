package sistemaReservas;

import java.util.ArrayList;


public class Sala {

    private String numeroSala;  
    private Integer capacidad;
    private Boolean disponibilidad;  


    public Sala(String numeroSala, Integer capacidad, Boolean disponibilidad) {
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
    }


    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    @Override
    public String toString() {
        return "Sala [numeroSala=" + numeroSala + ", capacidad=" + capacidad + ", disponibilidad=" + disponibilidad + "]";
    }


    public static void registrarSala(ArrayList<Sala> listaSalas, String numeroSala, Integer capacidad, Boolean disponibilidad) {
        Sala nuevaSala = new Sala(numeroSala, capacidad, disponibilidad);
        listaSalas.add(nuevaSala);
        System.out.println("Se registró la sala " + numeroSala + " exitosamente.");
    }


    public static void mostrarSalasDisponibles(ArrayList<Sala> listaSalas) {
        System.out.println("Salas disponibles:");
        for (Sala sala : listaSalas) {
            if (sala.getDisponibilidad()) {
                System.out.println(sala.toString());
            }
        }
    }
}

