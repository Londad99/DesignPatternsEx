package FactoryMethod;

public class FabricaAnimalesCallejeros implements FabricaSonido{

        public FabricaAnimalesCallejeros() {
            super();
        }

        @Override
        public Sonido Gato() {
            return new GatoCallejero();
        }

        @Override
        public Sonido Perro() {
            return new PerroCallejero();
        }
}
