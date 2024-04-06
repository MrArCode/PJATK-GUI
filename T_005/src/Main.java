public class Main {
    public static void main(String[] args)
    {
        Figura fig[] = new Figura[2];
        fig[0] = new Kolo(10, 10, 5);
        fig[1] = new Prostokat(20, 20, 15, 10);


        for (Figura f : fig)
            System.out.println(f);

        fig[0].pozycja(12, 12);
        fig[1].pozycja(25, 30);
    }
}