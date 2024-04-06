public class UFO implements Flyable,Speakable{
    @Override
    public String drive() {
        return "Plasma Engine";
    }

    @Override
    public double distance() {
        return 100000.0;
    }

    @Override
    public String speak() {
        return "Hum";
    }
}
