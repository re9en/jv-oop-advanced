package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + String.format("%.2f", getArea())
                + " sq. units, firstLeg: "
                + firstLeg
                + " secondLeg: "
                + secondLeg
                + " color: "
                + color);
    }
}
