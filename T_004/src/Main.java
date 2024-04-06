public class Main {
    public static void main(String[] args) {
        Flyable f1 = new Bird();
        Flyable f2 = new Plane();
        Flyable f3 = new UFO();
        Flyable f4 = new Virus();

        Flyable h1 = Flyable.hybrid(new Bird(), new Plane());
        Flyable h2 = Flyable.hybrid(new UFO(), new Virus());

        Flyable[] flyables = {f1, f2, f3, f4, h1, h2};

        for (Flyable obj : flyables) {
            System.out.println(obj.distance());
            System.out.println(obj.drive());
            System.out.println();
        }

        Speakable s1 = new Bird();
        Speakable s2 = new Speakable() {
            @Override
            public String speak() {
                return "New sound";
            }
        };
        Speakable s3 = () -> "Hello";

        Speakable[] speakables = {s1, s2, s3};

        for (Speakable obj : speakables) {
            System.out.println(obj.speak());
            System.out.println();
        }

        Flyable theShortestDistance = theShortestDistance(flyables);
        System.out.print("The shortest distance: ");
        System.out.println(theShortestDistance.distance());
        System.out.println();

        Speakable theLoudestObj = theLoudest(speakables);
        System.out.print("The loudest object is: ");
        System.out.println(theLoudestObj.speak());
    }

    public static Flyable theShortestDistance(Flyable[] flyables) {
        if (flyables == null || flyables.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        Flyable shortestDistanceObj = flyables[0];
        for (Flyable obj : flyables) {
            if (shortestDistanceObj.distance() > obj.distance()) {
                shortestDistanceObj = obj;
            }
        }
        return shortestDistanceObj;
    }

    public static Speakable theLoudest(Speakable[] speakables) {
        if (speakables == null || speakables.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        Speakable theLoudestObj = speakables[0];
        for (Speakable obj : speakables) {
            if (theLoudestObj.speak().length() < obj.speak().length()) {
                theLoudestObj = obj;
            }
        }
        return theLoudestObj;
    }
}
