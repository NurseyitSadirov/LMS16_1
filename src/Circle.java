public class Circle extends Shapes {
    private double height;

    public Circle(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "height=" + height +
                "} " + super.toString();
    }

    @Override
    public double findArea() {
        System.out.println("Area: ");
        return Math.PI * (height * height);
    }
}
