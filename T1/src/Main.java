public class Main {

    public static void main(String[] args) {

        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(0, 3),
                new ZRectangle(4, 'a', 'e'),
                new ZRectangle(5, 3, '*', '+'),
                new ZRectangle(1, 2, 'a', 'a'),
                new ZRectangle(3, 3, '+', 'x'),
                new ZRectangle(1, 2, 'x', 'y'),
                new ZRectangle(3, 4, '^', '$')
        };

        for (Rectangle rectangle : rectangles)
            try {
                rectangle.draw();
            } catch (RectangleException e) {
                System.out.println(e.getMessage());
            }

    }
}
