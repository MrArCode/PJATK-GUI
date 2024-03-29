public abstract class Singer implements Comparable<Singer>{
    private String surname;
    private int number;
    private static int nextNumber = 1;

    public Singer(String surname) {
        this.surname = surname;
        this.number = nextNumber;
        nextNumber++;
    }

    public abstract String sing();

    public String toString() {
        return new String("("+this.number + ") " + this.surname + ": " + this.sing());
    }

    public static String loudest(Singer[] singers) {
        int maxLetter = 0;
        int maxDigit = 0;
        int[] results = new int[singers.length];

        for (int i = 0; i < singers.length; i++) {
            String currentName = singers[i].getSurname();
            for (int j = 0; j < singers[i].surname.length(); j++) {
                char currentChar = currentName.charAt(j);
                if (Character.isDigit(currentChar)) {
                    if (maxDigit < currentChar) {
                        maxDigit = currentChar;
                    }
                } else {
                    if (maxLetter < currentChar) {
                        maxLetter = currentChar;
                    }
                }
            }
            int tmpSum = maxDigit + maxLetter;
            results[i] = tmpSum;
        }
        int winner = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] > results[winner]) {
                winner = i;
            }
        }
        return singers[winner].toString();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int compareTo(Singer o) {
        if (sing().length() != o.sing().length()) {
            return Integer.compare(o.sing().length(), sing().length());
        } else if (surname.charAt(0) != o.surname.charAt(0)) {
            return Character.compare(surname.charAt(0), o.surname.charAt(0));
        } else {
            return Integer.compare(number, o.number);
        }
    }
}
