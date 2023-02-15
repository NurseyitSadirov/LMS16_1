import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle(10, 10);
        Rectangle rectangle = new Rectangle(34, 23);
        Circle circle = new Circle(53);
        Square square = new Square(32, 32);
        while (true) {
            System.out.println("""
                    1 - triangle | 2 - rectangle
                    3 - circle   | 4 - square""");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(triangle.findArea());
                    break;
                case 2:
                    System.out.println(rectangle.findArea());
                    break;
                case 3:
                    System.out.println(circle.findArea());
                    break;
                case 4:
                    System.out.println(square.findArea());
                    break;
            }
        }
    }
}