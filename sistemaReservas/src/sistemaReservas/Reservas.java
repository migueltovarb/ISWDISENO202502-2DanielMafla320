package sistemaReservas;

import java.util.ArrayList;

public class Reservas {
    private Estudiante estudiante;
    private Sala sala;
    private String fecha;  
    private String hora;   


    public Reservas(Estudiante estudiante, Sala sala, String fecha, String hora) {
        this.estudiante = estudiante;
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
    }


    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Sala getSala() {
        return sala;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }


    public static boolean realizarReserva(ArrayList<Reservas> reservas, Estudiante estudiante, Sala sala, String fecha, String hora) {

        for (Reservas reserva : reservas) {
            if (reserva.getSala().getNumeroSala().equals(sala.getNumeroSala()) && reserva.getFecha().equals(fecha) && reserva.getHora().equals(hora)) {
                System.out.println("¡La sala ya está reservada para ese horario!");
                return false; 
            }
        }

        reservas.add(new Reservas(estudiante, sala, fecha, hora));
        System.out.println("Reserva exitosa para " + estudiante.getNombre() + " en la sala " + sala.getNumeroSala() + " el " + fecha + " a las " + hora);
        return true;
    }
}
