public class Main {
    public static void main(String[] args) {
        Singer s1 = new Singer("Dietrich") {
            @Override
            public String sing() {
                return "oooooo6oooooo";
            }
        };

        Singer s2 = new Singer("Piaf") {
            public String sing() {
                return "a4iBBiii";
            }
        };

        Singer s3 = new Singer("Adele") {
            public String sing() {
                return "aAa";
            }
        };

        Singer[] singers = {s2, s1, s3};

        for (Singer s : singers)
            System.out.println(s);

        System.out.println("\n" + Singer.loudest(singers));
    }
}
