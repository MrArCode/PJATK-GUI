import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Figura fig[] = new Figura[3];
        fig[0] = new Prostokat(1, 1, 4, 9);
        fig[1] = new Kolo(1, 1, 5);
        fig[2] = new Prostokat(2,2,6,6);


        for (Figura f : fig){
            System.out.print(f);
            System.out.println(f.getNumer());
//            System.out.println("Obwod: " + f.obwodFigury());
////            System.out.println("Pole: " + f.poleFigury());
            System.out.println();
        }
        System.out.println("=======================================");
        Arrays.sort(fig);
        for (Figura f : fig){
            System.out.print(f);
            System.out.println(f.getNumer());
//            System.out.println("Obwod: " + f.obwodFigury());
////            System.out.println("Pole: " + f.poleFigury());
            System.out.println();
        }





//        fig[0].pozycja(12, 12);
//        fig[1].pozycja(25, 30);
//        System.out.println();
//
//        Figura p2 = new Prostokat2(20, 20, 10, 5, '*');
//        System.out.println();
//        ((Prostokat2)p2).rysuj();
//        System.out.println();
//
//        Kolo2 k2 = new Kolo2(15, 20, 5);
//        k2.przesunDo(50, 40);
//        System.out.println(k2);
//
//        k2.powrot();
//        System.out.println(k2);




    }
}