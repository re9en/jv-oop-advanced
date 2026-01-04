package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int baseTop;
    private int baseBottom;
    private int height;

    public IsoscelesTrapezoid(int baseTop, int baseBottom, int height, String color) {

        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseBottom + baseTop) * height;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, area: "
                + getArea()
                + "units, baseTop: "
                + baseTop
                + "baseBottom: "
                + baseBottom
                + "height: "
                + height
                + "Color: "
                + color;
    }
}
