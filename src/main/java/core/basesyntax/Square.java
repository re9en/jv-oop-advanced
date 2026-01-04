package core.basesyntax;

public class Square extends Figure {
    private final int side;

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
                + String.format("%.2f", getArea())
                + " sq. units, side: "
                + side
                + " color: "
                + color);
    }
}
