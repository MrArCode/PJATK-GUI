public class Prostokat extends Figura {
    private int szerokosc;
    private int wysokosc;

    public Prostokat(int x, int y, int szerokosc, int wysokosc) {
        super(x, y);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    String nazwaFigury() {
        return "Prostokat";
    }

    @Override
    public void pozycja(int x, int y) {
        if (x < getX() && x > getX() + szerokosc && y < getY() && y > getY() + wysokosc) {
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się wewnątrz prostokąta.");
        } else {
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się na zewnątrz prostokąta.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Lewy Górny - (" + getX() + "," + getY() + ")\n" + "Szerokosc: " + szerokosc + ", Wysokosc: " + wysokosc+"\n";
    }
}
