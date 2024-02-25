package AbstractFactory;

public class FabricaGamaAlta implements FabricaTelefonos{
    @Override
    public Telefono crearTelefono() {
        return new TelefonoGamaAlta();
    }

    @Override
    public TelefonoEspecificaciones crearTelefonoEspecificaciones() {
        return new EspecificacionesGamaAlta();
    }

}
