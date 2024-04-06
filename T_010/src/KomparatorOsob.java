import java.util.Comparator;

public class KomparatorOsob implements Comparator<Osoba> {
    Kryterium typSortowania;

    public KomparatorOsob(Kryterium typSortowania) {
        this.typSortowania = typSortowania;
    }

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return switch (typSortowania){
            case imie -> String.CASE_INSENSITIVE_ORDER.compare(o1.getImie(),o2.getImie());
            case wiek -> Integer.compare(o1.getWiek(),o2.getWiek());
        };
    }
}
