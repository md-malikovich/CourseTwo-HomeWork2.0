public class Triangle extends  Figure  implements Drawable  {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;                               // P = a + b + c
    }

    public Triangle() {
        super("Triangle");
    }

    public String draw() {
        return "\ud83d\udd3a";
    }
}
