package Builder;

public class Carro {

    private TipoCarro tipo;
    private int asientos;
    private Motor motor;
    private int baterias;
    private boolean convertible;
    private boolean carroElectrico;

    public Carro(TipoCarro tipo, int asientos, Motor motor, int baterias, boolean convertible, boolean carroElectrico) {
        this.tipo = tipo;
        this.asientos = asientos;
        this.motor = motor;
        this.baterias = baterias;
        this.convertible = convertible;
        this.carroElectrico = carroElectrico;
    }


    public TipoCarro getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarro tipo) {
        this.tipo = tipo;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getBaterias() {
        return baterias;
    }

    public void setBaterias(int baterias) {
        this.baterias = baterias;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isCarroElectrico() {
        return carroElectrico;
    }

    public void setCarroElectrico(boolean carroElectrico) {
        this.carroElectrico = carroElectrico;
    }

    @Override
    public String toString() {
        return "Carro{" + "tipo=" + this.tipo + ", asientos=" + asientos + ", Capacidad motor=" + motor.getCapacidadMotor() + ", baterias=" + baterias + ", convertible=" + convertible + ", carroElectrico=" + carroElectrico + '}';
    }

}
