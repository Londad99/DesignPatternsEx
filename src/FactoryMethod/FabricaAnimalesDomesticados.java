package FactoryMethod;

public class FabricaAnimalesDomesticados implements FabricaSonido{

    public FabricaAnimalesDomesticados() {
        super();
    }

    @Override
    public Sonido Gato() {
        return new Gato();
    }

    @Override
    public Sonido Perro() {
        return new Perro();
    }
}
