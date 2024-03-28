public interface Flyable {


    String drive();

    double distance();

    static Flyable hybrid(Flyable ob1, Flyable ob2) {
        return new Flyable() {
            @Override
            public String drive() {
                return ob1.drive() + " " + ob2.drive();
            }

            @Override
            public double distance() {
                return ob1.distance() + ob2.distance();
            }
        };
    }

}
