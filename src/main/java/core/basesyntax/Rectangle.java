package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private int height;
    private int base;

    public Rectangle(int base, int height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * base * 0.5;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, area: "
                + getArea()
                + "units, base: "
                + base
                + "height: "
                + height
                + "Color: "
                + color;
    }
}
