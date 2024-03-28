public class Virus implements Flyable{
    @Override
    public String drive() {
        return "Air";
    }

    @Override
    public double distance() {
        return 10.0;
    }
}
