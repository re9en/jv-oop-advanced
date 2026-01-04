package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int base;

    public Rectangle(int base, int height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + getArea()
                + "units, base: "
                + base
                + "height: "
                + height
                + "Color: "
                + color);
    }
}
