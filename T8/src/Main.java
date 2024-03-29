import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Singer s1 = new Singer("Darrey") {
            @Override
            public String sing() {
                return "eeae";
            }
        };

        Singer s2 = new Singer("Darrey") {
            public String sing() {
                return "bebe";
            }
        };

        Singer s3 = new Singer("Houston") {
            public String sing() {
                return "aabbccdefgh";
            }
        };

        Singer s4 = new Singer("Carrey") {
            @Override
            public String sing() {
                return "xyzt123";
            }
        };
        Singer s5 = new Singer("Madonna") {
            @Override
            public String sing() {
                return "aAa";
            }
        };

        Singer[] singers = {s1, s2, s3, s4, s5};
        Arrays.sort(singers);

        for (Singer s : singers)
            System.out.println(s);

        System.out.println("\n" + Singer.loudest(singers));
    }
}
