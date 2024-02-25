package Prototype;

public class Moto extends Vehiculo{

    private int cilindraje;
    private String tipo;

    public Moto(String marca, String modelo, String color, int precio, int cilindraje, String tipo) {
        super(marca, modelo, color, precio);
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Vehiculo clone() {
        return new Moto(getMarca(), getModelo(), getColor(), getPrecio(), cilindraje, tipo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindraje: " + cilindraje + ", Tipo: " + tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Moto) {
            Moto moto = (Moto) obj;
            return super.equals(obj) && cilindraje == moto.cilindraje && tipo.equals(moto.tipo);
        }
        return false;
    }

}
