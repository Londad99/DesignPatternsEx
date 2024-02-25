package Prototype;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private int precio;

    public Vehiculo(String marca, String modelo, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public abstract Vehiculo clone();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Precio: " + precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehiculo) {
            Vehiculo vehiculo = (Vehiculo) obj;
            return marca.equals(vehiculo.marca) && modelo.equals(vehiculo.modelo) && color.equals(vehiculo.color) && precio == vehiculo.precio;
        }
        return false;
    }
}
