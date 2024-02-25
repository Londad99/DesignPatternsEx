package Builder;

public class ConstructorCarro implements Constructor{

    private TipoCarro tipo;
    private int asientos;
    private Motor motor;
    private int baterias;
    private boolean convertible;
    private boolean carroElectrico;

    public ConstructorCarro() {
    }

    @Override
    public void setTipoCarro(TipoCarro tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setBaterias(int baterias) {
        this.baterias = baterias;
    }

    @Override
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public void setCarroElectrico(boolean carroElectrico) {
        this.carroElectrico = carroElectrico;
    }

    public Carro getResult() {
        return new Carro(tipo, asientos, motor, baterias, convertible, carroElectrico);
    }

}
