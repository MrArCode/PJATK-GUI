public class Student {
    private String nazwisko;
    private String imie;
    private int rokUrodzenia;
    private static int licznik = 1;
    private int numerStudenta;
    private String grupaStudenta;

    public Student(String nazwisko, String imie, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.numerStudenta = licznik;
        licznik++;
        grupaStudenta = "";
    }

    public String toString() {
        return "(" + numerStudenta + ")" + imie + " " + nazwisko + ", " + rokUrodzenia;
    }

    public String getGrupaStudenta() {
        return grupaStudenta;
    }

    public void setGrupaStudenta(String grupaStudenta) {
        this.grupaStudenta = grupaStudenta;
    }
}
