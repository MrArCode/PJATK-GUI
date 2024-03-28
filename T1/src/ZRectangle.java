public class ZRectangle extends Rectangle {
    private char char1;
    private char char2;

    private static int rectangleNumber = 1;
    private static int squareNumber = 1;
    private int number;

    private String figureType;

    public ZRectangle(int height, char char1, char char2) {
        this(height, height, char1, char2);
    }

    public ZRectangle(int height, int width, char char1, char char2) {
        super(height, width);
        if (height == width) {
            figureType = "Square";
            number = squareNumber++;
        } else {
            figureType = "Rectangle";
            number = rectangleNumber++;
        }
        this.char1 = char1;
        this.char2 = char2;
    }

    public void draw() throws RectangleException {
        if (((getHeight() == 1 || getHeight() == 2) || (getWidth() == 1 || getWidth() == 2)) && (char1 != char2)) {
            System.out.println(figureType + " (" + number + ") size " + getHeight() + " X " + getWidth());
            System.out.println("Invalid rectangle");
            System.out.println();
        } else if (((getHeight() == 1 || getHeight() == 2) || (getWidth() == 1 || getWidth() == 2))
                && (char1 == char2)) {
            System.out.println(figureType + " (" + number + ") size " + getHeight() + " X " + getWidth() + ", " + char1 + " = " + getWidth() * getHeight());
            for (int i = 0; i < getWidth(); i++) {
                for (int j = 0; j < getHeight(); j++) {
                    System.out.print(char1);
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println(figureType + " (" + number + ") size " + getHeight() + " X " + getWidth()
                    + ", " + char1 + " = " + (((getHeight() - 2) * (getWidth() - 2))) + ", " + char2
                    + " = "
                    + ((2 * getWidth()) + (2 * (getHeight() - 2))));
            for (int i = 0; i < getHeight(); i++) {
                System.out.print(char2 + " ");
            }
            System.out.println();
            for (int i = 0; i < getWidth() - 2; i++) {
                System.out.print(char2 + " ");
                for (int j = 0; j < getHeight() - 2; j++) {
                    System.out.print(char1 + " ");
                }
                System.out.println(char2);
            }
            for (int i = 0; i < getHeight(); i++) {
                System.out.print(char2 + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
