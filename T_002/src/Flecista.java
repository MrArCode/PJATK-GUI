public class Flecista extends Muzyk{
    public Flecista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    public String instrument() {
        return new String("flet");
    }

    @Override
    public double stawka() {
        return 300.;
    }
}
