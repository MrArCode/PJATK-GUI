public class Kolo2 extends Kolo implements Transformacja {
    private int formerX;
    private int formerY;

    public Kolo2(int x, int y, int promien) {
        super(x, y, promien);
    }

    @Override
    public void przesunDo(int x, int y) {
        formerX = getX();
        formerY = getY();
        setX(x);
        setY(y);
    }

    @Override
    public void powrot() {
        setX(formerX);
        setY(formerY);
    }

}
