public class Triangle extends Shapes {
    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return " " +
                " " + height +
                " " + width +
                " " + super.toString();
    }

    @Override
    public double findArea() {
        return (getHeight() * getWidth() * 0.5);
    }
}
