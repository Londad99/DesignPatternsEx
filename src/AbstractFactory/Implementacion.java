package AbstractFactory;

public class Implementacion {
    public static void main(String[] args) {
        FabricaTelefonos fabricaGamaAlta = new FabricaGamaAlta();
        Telefono telefonoGamaAlta = fabricaGamaAlta.crearTelefono();
        TelefonoEspecificaciones especificacionesGamaAlta = fabricaGamaAlta.crearTelefonoEspecificaciones();

        telefonoGamaAlta.ensamblar();
        especificacionesGamaAlta.mostrarEspecificaciones();

        FabricaTelefonos FabricaGamaBaja = new FabricaGamaBaja();
        Telefono telefonoGamaMedia = FabricaGamaBaja.crearTelefono();
        TelefonoEspecificaciones especificacionesGamaMedia = FabricaGamaBaja.crearTelefonoEspecificaciones();

        telefonoGamaMedia.ensamblar();
        especificacionesGamaMedia.mostrarEspecificaciones();
    }
}
