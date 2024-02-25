package AbstractFactory;

public class EspecificacionesGamaAlta implements TelefonoEspecificaciones{
    @Override
    public void mostrarEspecificaciones() {
        System.out.println("Especificaciones de un telefono de gama alta");
    }
}
