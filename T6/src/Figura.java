public abstract class Figura implements Obliczanie{
    private int x;
    private int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
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
}
