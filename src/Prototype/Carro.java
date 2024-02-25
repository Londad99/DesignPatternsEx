package Prototype;

public class Carro extends Vehiculo{

    private int capacidadMotor;
    private int numeroPuertas;

    public Carro(String marca, String modelo, String color, int precio, int capacidadMotor, int numeroPuertas) {
        super(marca, modelo, color, precio);
        this.capacidadMotor = capacidadMotor;
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadMotor() {
        return capacidadMotor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setCapacidadMotor(int capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public Vehiculo clone() {
        return new Carro(getMarca(), getModelo(), getColor(), getPrecio(), this.capacidadMotor, this.numeroPuertas);
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad Motor: " + capacidadMotor + ", Numero Puertas: " + numeroPuertas;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Carro) {
            Carro carro = (Carro) obj;
            return super.equals(obj) && capacidadMotor == carro.capacidadMotor && numeroPuertas == carro.numeroPuertas;
        }
        return false;
    }

}
