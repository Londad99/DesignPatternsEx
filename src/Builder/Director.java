package Builder;

public class Director {

    public void crearCarroLujo(Constructor constructor) {
        constructor.setTipoCarro(TipoCarro.LUJO);
        constructor.setAsientos(4);
        constructor.setMotor(new Motor(2500));
        constructor.setBaterias(2);
        constructor.setConvertible(true);
        constructor.setCarroElectrico(false);
    }

    public void crearCarroDeportivo(Constructor constructor) {
        constructor.setTipoCarro(TipoCarro.DEPORTIVO);
        constructor.setAsientos(2);
        constructor.setMotor(new Motor(3000));
        constructor.setBaterias(1);
        constructor.setConvertible(true);
        constructor.setCarroElectrico(false);
    }

    public void crearCarroFamiliar(Constructor constructor) {
        constructor.setTipoCarro(TipoCarro.FAMILIAR);
        constructor.setAsientos(5);
        constructor.setMotor(new Motor(2000));
        constructor.setBaterias(1);
        constructor.setConvertible(false);
        constructor.setCarroElectrico(false);
    }

}
