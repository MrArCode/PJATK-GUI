import java.util.*;

public class Main {
    public static void main(String[] args) {
        // tworzenie listy osób
        List<Osoba> lista = Arrays.asList(
                new Osoba("Anna", 23),
                new Osoba("Maria", 22),
                new Osoba("Anna", 20),
                new Osoba("Wojciech", 21)
        );

        // sortowanie według podanego komparatora (po imię)
        Collections.sort(lista, new KomparatorOsob(Kryterium.imie));
        System.out.println(lista);

        // sortowanie według podanego komparatora (po wieku)
        Collections.sort(lista, (o1, o2) -> o1.getWiek() - o2.getWiek());
        System.out.println(lista);

        // sortowanie według porządku naturalnego określonego w klasie Osoba
        Collections.sort(lista);
        System.out.println(lista);
    }
}