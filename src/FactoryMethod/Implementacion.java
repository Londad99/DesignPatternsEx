package FactoryMethod;

public class Implementacion {

    public static void main(String[] args) {
        FabricaSonido fabrica = new FabricaAnimalesDomesticados();

        Sonido sonido = fabrica.Gato();
        System.out.println("Gato: "+ sonido.reproducir());

        sonido = fabrica.Perro();
        System.out.println("Perro: "+ sonido.reproducir());

        fabrica = new FabricaAnimalesCallejeros();

        sonido = fabrica.Gato();
        System.out.println("Gato callejero: "+ sonido.reproducir());

        sonido = fabrica.Perro();
        System.out.println("Perro callejero: "+ sonido.reproducir());
    }
}
