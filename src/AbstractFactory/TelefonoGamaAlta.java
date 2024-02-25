package AbstractFactory;

public class TelefonoGamaAlta implements Telefono{
    @Override
    public void ensamblar() {
        System.out.println("Ensamblado de un telefono de gama alta");
    }
}
