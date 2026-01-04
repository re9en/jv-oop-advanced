package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int MIN_SIZE = 1;
    public static final int MAX_SIZE = 100;
    public static final double DEFAULT_RADIUS = 10;
    public static final int FIGURE_COUNT = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int randomSize() {
        return random.nextInt(MAX_SIZE - MIN_SIZE + 1) + MIN_SIZE;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(randomSize(),
                        colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(randomSize(),
                        randomSize(),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(randomSize(),
                        randomSize(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Square(randomSize(),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(randomSize(),
                        randomSize(),
                        randomSize(),
                        colorSupplier.getRandomColor());
            default:
                throw new RuntimeException("Unknown error");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, ColorEnum.WHITE.name());
    }
}
