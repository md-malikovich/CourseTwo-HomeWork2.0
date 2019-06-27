public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        //Figure[] figures = {new Circle(), new Square(), new Rectangle(), new Triangle(), new Circle(), new Square()};

        Dog dog = new Dog();
        System.out.println(dog.draw() + " " + dog.getName());
        System.out.println(circle.draw() + " " + circle.getName());
        System.out.println(square.draw() + " " + square.getName());
        System.out.println(triangle.draw() + " " + triangle.getName());
        System.out.println(rectangle.draw() + " " + rectangle.getName());
        System.out.println(dog.callSound());
        System.out.println("__________________________");

        Rectangle rectangle1 = new Rectangle(2.5, 4.5);
        System.out.println("Периметр Прямоугольника " + rectangle.draw() + " со сторонами 2.5 см и 4.5 см = " + rectangle1.calculatePerimeter() + " см.");

        Square square1 = new Square(4.0);
        System.out.println("Периметр Квадрата " + square.draw() + " со сторононами 4.0 см = " + square1.calculatePerimeter() + " см.");

        Triangle triangle1 = new Triangle(2.3, 4.6, 6.8);
        System.out.println("Периметр Треугольника " + triangle.draw() + " со сторонами 2.3 см, 4.6 см и 6.8 см = " + triangle1.calculatePerimeter() + " см.");

        Circle circle1 = new Circle(5.0);
        System.out.println("Площадь Круга " + circle.draw() + " с радиусом 5.0 см = " + circle1.calculatePerimeter() + " см.");
        System.out.println("__________________________");

        Figure[] figures1 = {new Circle(), new Square(), new Rectangle(), new Triangle()};
        figures1[0] = new Rectangle(2.5, 4.5);
        figures1[1] = new Square(4.0);
        figures1[2] = new Triangle(2.3, 4.6, 6.8);
        figures1[3] = new Circle(5.0);
        for(int i = 0; i < figures1.length; i++) {
            System.out.println("Периметр/Площадь " + figures1[i].getClass().getSimpleName()
                    + " " + ((Drawable) figures1[i]).draw() + " = " + figures1[i].calculatePerimeter() + " см.");
        }
    }
}



