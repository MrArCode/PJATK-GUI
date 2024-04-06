public class IterNapTest {
    public static void main(String[] args) {
        IterNap napis = new IterNap("prOgrAmoWanIe ObiEktOwe i Gui");

        // iteracja po znakach napisu
        for (char z : napis)
            System.out.print(z + " ");
        System.out.println();

        napis.ustawPoczatek(2); // ustawienie początku iteracji
        napis.ustawKrok(3); // ustawienie kroku iteracji

        // iteracja po znakach napisu od ustalonego znaku, z określonym krokiem
        for (char z : napis)
            System.out.print(z + " ");

        System.out.println();

        // wywołanie metody forEach z argumentem będącym lambda-wyrażeniem w celu wyświetlenia znaków napisu
        napis.forEach(z -> System.out.print(Character.toLowerCase(z) + " "));
    }
}

