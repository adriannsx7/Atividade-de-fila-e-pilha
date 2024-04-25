import java.util.LinkedList;
import java.util.Stack;

public class Pilha{
    public static void main(String[] args) {
        System.out.println("Pilha de carros:");

        Stack<String> carros = new Stack();

        carros.push("Golf");
        carros.push("Brasília");
        carros.push("Classic");
        carros.push("Fiat");

        System.out.println("Topo da pilha: " + carros.peek());
        System.out.println("Topo da pilha: " + carros.pop());
        System.out.println(carros);
        carros.clear();
        System.out.println(carros.empty()?"A pilha está vazia":"A pilha tem carros");

    }
}
