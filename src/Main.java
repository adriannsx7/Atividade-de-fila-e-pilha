public class Main {
    public static void main(String[] args) {
        String[][] minhaMatriz = {{"Al", "BA", "PB"},
                {"PE", "PI", "SE"},
                {"CE", "MA", "PB"}};

        System.out.println("Estados do Nordeste: ");
        for(String[] strings : minhaMatriz) {
            for(String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}



