import java.util.Iterator;

public class IterNap implements Iterable<Character>{
    private String tekst;
    private int poczatek;
    private int krok;

    public IterNap(String text) {
        this.tekst = text;
        this.poczatek = 0;
        this.krok = 1;
    }

    public void ustawPoczatek(int poczatek){
        this.poczatek = poczatek;
    }

    public void ustawKrok(int krok){
        this.krok = krok;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<>() {
            private int aktualnyIndex = poczatek;

            @Override
            public boolean hasNext() {
                return aktualnyIndex < tekst.length();
            }

            @Override
            public Character next() {
                char znak = tekst.charAt(aktualnyIndex);
                aktualnyIndex += krok;
                return znak;
            }
        };
    }
}
