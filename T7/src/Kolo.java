public class Kolo extends Figura {
    private int promien;

    public Kolo(int x, int y, int promien) {
        super(x, y);
        this.promien = promien;
    }

    @Override
    String nazwaFigury() {
        return "Koło";
    }

    @Override
    public void pozycja(int x, int y) {
        double odleglosc = Math.sqrt(Math.pow((getX() - x), 2) + Math.pow((getX() - y), 2));
        if (odleglosc <= promien) {
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się wewnątrz koła.");
        } else {
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się na zewnątrz koła.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Środek: " + "- (" + getX() + "," + getY() + ")\n" + "Promień - " + promien+"\n";
    }

    @Override
    public double poleFigury() {
        return 3.14 * Math.pow(promien,2);
    }

    @Override
    public double obwodFigury() {
        return 2*3.14*promien;
    }

    public int getPromien() {
        return promien;
    }


}
