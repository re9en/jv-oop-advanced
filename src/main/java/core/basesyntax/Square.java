package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private int sideOne;
    private int sideTwo;

    public Square(int sideOne, int sideTwo, String color) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public String draw() {
        return "Figure: Square, area: "
                + getArea()
                + "units, sideOne: "
                + sideOne
                + "sideTwo: "
                + sideTwo
                + "Color: "
                + color;

    }
}
