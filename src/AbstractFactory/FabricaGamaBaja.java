package AbstractFactory;

public class FabricaGamaBaja implements FabricaTelefonos{
    @Override
    public Telefono crearTelefono() {
        return new TelefonoGamaBaja();
    }

    @Override
    public TelefonoEspecificaciones crearTelefonoEspecificaciones() {
        return new EspecificacionesGamaBaja();
    }
}
