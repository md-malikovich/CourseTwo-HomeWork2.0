public class Circle extends  Figure implements Drawable {


    private double radius;
    private double area;

    public Circle (double radius) {
        super("Circle");
        this.radius = radius;
     }

    @Override
    public double calculatePerimeter() {
        return area = Math.PI * (radius * radius);
    }

    public Circle() {
        super("Circle");
    }

    public String draw() {
        return "\u26AB";
    }
}
