package AbstractFactory;

public class FabricaGamaBaja implements FabricaTelefonos{
    @Override
    public Telefono crearTelefono() {
        return new GamaBaja();
    }

    @Override
    public TelefonoEspecificaciones crearTelefonoEspecificaciones() {
        return new EspecificacionesGamaBaja();
    }
}
