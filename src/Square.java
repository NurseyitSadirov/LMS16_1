public class Square extends Shapes {
    private double height;
    private double with;

    public Square(double height, double with) {
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
        return "Square{" +
                "height=" + height +
                ", with=" + with +
                "} " + super.toString();
    }

    @Override
    public double findArea() {
        if (height == with) {
            return height * with;
        }
        return 0;
    }
}
