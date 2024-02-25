package Builder;

public class Implementacion {

    public static void main(String[] args) {
        Director director = new Director();

        ConstructorCarro constructor = new ConstructorCarro();

        director.crearCarroLujo(constructor);

        Carro carro = constructor.getResult();

        System.out.println(carro);
    }
}
