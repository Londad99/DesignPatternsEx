package AbstractFactory;

public class EspecificacionesGamaBaja implements TelefonoEspecificaciones {
    @Override
    public void mostrarEspecificaciones() {
        System.out.println("Especificaciones de un telefono de gama baja");
    }
}
