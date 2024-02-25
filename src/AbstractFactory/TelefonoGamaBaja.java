package AbstractFactory;

public class TelefonoGamaBaja implements Telefono{
    @Override
    public void ensamblar() {
        System.out.println("Ensamblado de un telefono de gama baja");
    }

}
