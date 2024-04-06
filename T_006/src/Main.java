public class Main {
    public static void main(String[] args)
    {
        Figura fig[] = new Figura[2];
        fig[0] = new Kolo(10, 10, 5);
        fig[1] = new Prostokat(20, 20, 15, 10);


        for (Figura f : fig){
            System.out.print(f);
            System.out.println("Obwod: " + f.obwodFigury());
            System.out.println("Pole: " + f.poleFigury());
            System.out.println();
        }
        fig[0].pozycja(12, 12);
        fig[1].pozycja(25, 30);
        System.out.println();

        Figura p2 = new Prostokat2(20, 20, 10, 5, '*');
        System.out.println();
        ((Prostokat2)p2).rysuj();
        System.out.println();

        Kolo2 k2 = new Kolo2(15, 20, 5);
        k2.przesunDo(50, 40);    // przesunięcie środka koła do punktu (50, 40)
        System.out.println(k2);

        k2.powrot();                    // powrót do poprzedniej pozycji (bezpośrednio przed przesunięciem) środka koła
        System.out.println(k2);




    }
}