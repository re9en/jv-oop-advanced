package core.basesyntax;

public class Square extends Figure {
    private int side;
    private int sideTwo;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea()
                + "units, side: "
                + side
                + "Color: "
                + color);
    }
}
