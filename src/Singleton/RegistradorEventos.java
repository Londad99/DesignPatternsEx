package Singleton;

import java.util.ArrayList;
import java.util.List;

public class RegistradorEventos {
    private static RegistradorEventos instance;
    private List<Evento> eventos;

    private RegistradorEventos() {
        eventos = new ArrayList<>();
    }

    public static synchronized RegistradorEventos getInstance() {
        if (instance == null) {
            instance = new RegistradorEventos();
        }
        return instance;
    }

    public void registrarEvento(String descripcion) {
        eventos.add(new Evento(descripcion));
    }

    public void mostrarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento.getDescripcion());
        }
    }

}
