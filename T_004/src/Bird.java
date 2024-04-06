public class Bird implements Flyable,Speakable{
    @Override
    public String drive() {
        return "Wings";
    }

    @Override
    public double distance() {
        return 650.0;
    }

    @Override
    public String speak() {
        return "Tweet, Tweet";
    }
}
