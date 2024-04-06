public class Skrzypek extends Muzyk{
    public Skrzypek(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    public String instrument() {
        return new String("skrzypce");
    }

    @Override
    public double stawka() {
        return 200.0;
    }
}
