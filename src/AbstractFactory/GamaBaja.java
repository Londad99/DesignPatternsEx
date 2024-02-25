package AbstractFactory;

public class GamaBaja implements Telefono{
    @Override
    public void ensamblar() {
        System.out.println("Ensamblado de un telefono de gama baja");
    }

}
