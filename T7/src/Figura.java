public abstract class Figura implements Obliczanie, Comparable<Figura>{
    private int x;
    private int y;
    private static int licznik = 1;
    private int numer;


    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
        this.numer = licznik;
        licznik++;

    }

    abstract String nazwaFigury();

    abstract void pozycja(int x, int y);

    public String toString(){
        return "Figura: " + nazwaFigury() +"\n";
    };

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double poleFigury() {
        return 0;
    }

    @Override
    public double obwodFigury() {
        return 0;
    }

    public static int getLicznik() {
        return licznik;
    }

    public static void setLicznik(int licznik) {
        Figura.licznik = licznik;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    @Override
    public int compareTo(Figura o) {
        if (poleFigury() != o.poleFigury()) {
            return Double.compare(poleFigury(), o.poleFigury());
        } else if (obwodFigury() != o.obwodFigury()) {
            return Double.compare(obwodFigury(), o.obwodFigury());
        } else {
            return Integer.compare(numer, o.numer);
        }
    }
}
