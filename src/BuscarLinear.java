public class BuscarLinear {
    public static String buscarLinear(String[][] sorvetes, String sabor) {
        for (int i = 0; i < sorvetes.length; i++) {
            if (sorvetes[i].equals(sabor)) {
                return sorvetes[i][1];
            }
        }
        return "sabor não encontrado";
    }

    public static void main(String[] args) {
        String[][] sorvetes = {
                {"Morango", "R$ 5,00"},
                {"Chocolate", "R$ 4,50"},
                {"Ovomaltine", "R$ 6,00"},
                {"Creme", "R$ 5,00"},
                {"Napolitano", "R$ 5,00"}
        };

        String saborBuscado = "Manga";

        String preco = buscarLinear(sorvetes, saborBuscado);

        System.out.println("Preço do sorvete de " + saborBuscado + ": " + preco);
    }
}