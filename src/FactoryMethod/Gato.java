package FactoryMethod;

public class Gato implements Sonido {
    @Override
    public String reproducir() {
        return "Miau miau!";
    }
}
