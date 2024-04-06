public class Rectangle {
    private int height;
    private int width;

    public void draw() throws RectangleException {
        if (this.height == 0 || this.width == 0) {
            System.out.println("Rectangle " + this.height + " X " + this.width);
            throw new RectangleException("Invalid rectangle!\n");

        } else {

            System.out.println("Simple rectangle " + this.height + " X " + this.width);
            System.out.println();
        }
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
