public class Prostokat2 extends Prostokat implements Rysowanie{
    private char znak;

    public Prostokat2(int x, int y, int szerokosc, int wysokosc,char znak) {
        super(x, y, szerokosc, wysokosc);
        this.znak = znak;
        rysuj();
    }

    @Override
    public void rysuj() {
        for(int i = 0; i < getWysokosc();i++){
            for (int j = 0; j < getSzerokosc();j++){
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
