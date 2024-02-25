package AbstractFactory;

public class FabricaGamaAlta implements FabricaTelefonos{
    @Override
    public Telefono crearTelefono() {
        return new GamaAlta();
    }

    @Override
    public TelefonoEspecificaciones crearTelefonoEspecificaciones() {
        return new EspecificacionesGamaAlta();
    }

}
