package FactoryMethod;

public class Perro implements Sonido{
    @Override
    public String reproducir() {
        return "Guau guau!";
    }
}
