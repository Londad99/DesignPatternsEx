package Singleton;

public class Implementacion {

    public static void main(String[] args) {
        RegistradorEventos registrador = RegistradorEventos.getInstance();

        registrador.registrarEvento("Evento 1");
        registrador.registrarEvento("Evento 2");
        registrador.registrarEvento("Evento 3");

        registrador.mostrarEventos();
    }

}
