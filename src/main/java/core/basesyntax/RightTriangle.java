package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + String.format("%.2f", getArea())
                + " sq. units, firstLeg: "
                + firstLeg
                + " secondLeg: "
                + secondLeg
                + " color: "
                + color);
    }
}
