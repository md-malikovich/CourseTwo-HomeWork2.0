public class Square extends  Figure implements Drawable  {

    private double sideA;

    public Square (double sideA) {
        super("Square");
        this.sideA = sideA;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideA;                     // P = 4a
    }

    public Square() {
        super("Square");
    }

    public String draw() {
        return "\u2B1B";
    }
}
