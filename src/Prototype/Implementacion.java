package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Implementacion {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Carro carro = new Carro(
                "Chevrolet",
                "Aveo",
                "Blanco",
                30000000, 4,
                4);

        vehiculos.add(carro);

        Carro carro2 = (Carro) carro.clone();
        vehiculos.add(carro2);

        Moto moto = new Moto(
                "Yamaha",
                "FZ",
                "Negra",
                8000000,
                150,
                "Deportiva");

        vehiculos.add(moto);

        Moto moto2 = (Moto) moto.clone();
        vehiculos.add(moto2);

        System.out.println("Carros iguales: " + vehiculos.get(0).equals(vehiculos.get(1)));
        System.out.println("Motos iguales: " + vehiculos.get(2).equals(vehiculos.get(3)));

    }

}
