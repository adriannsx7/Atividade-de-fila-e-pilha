import java.util.Queue;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        System.out.println("Fila de carros:");

        Queue<String> carros = new LinkedList<>();

        carros.add("Golf");
        carros.add("Brasília");
        carros.add("Classic");
        carros.add("Fiat");

        System.out.println("Topo da fila: " + carros.peek());
        System.out.println(carros);
        System.out.println("Se o carro que for tirado for: " + carros.poll());
        System.out.println("O carro que estará no topo da fila será: " + carros.peek());
        System.out.println(carros.isEmpty()?"A fila está vazia":"A fila tem carros");

    }
}