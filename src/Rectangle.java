public class Rectangle extends Shapes {

    private double height;
    private double with;

    public Rectangle(double height, double with) {
        this.height = height;
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", with=" + with +
                "} " + super.toString();
    }

    @Override
    public double findArea() {
        System.out.println("Area: ");
        return height * with;
    }
}
