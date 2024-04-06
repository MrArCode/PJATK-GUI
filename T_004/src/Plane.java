public class Plane implements Flyable,Speakable {
    @Override
    public String drive() {
        return "Engine";
    }

    @Override
    public double distance() {
        return 1000.0;
    }

    @Override
    public String speak() {
        return "Roar";
    }
}
