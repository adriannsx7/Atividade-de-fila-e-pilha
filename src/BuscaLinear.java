public class BuscaLinear {
    public static int buscalinear(String[] array, String alvo) {

        for(int i=0; i<array.length; i++) {
            if(array[i].equals(alvo)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] Sorvete = {"chocolate", "morango", "creme", "baunilha"};

        String alvo = "morango";
        int indice = buscalinear(Sorvete, alvo);

        if (indice != -1) {
            System.out.println("O sabor do sorvete " + alvo + " foi encontrado no índice " + indice);
        } else {
            System.out.println("O sabor do sorvete " + alvo + " não foi encontrado no array");
        }
    }
}
