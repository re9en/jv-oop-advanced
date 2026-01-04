package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    private int randomSize() {
        return random.nextInt(1,100);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 0:
                return new Circle(randomSize(),
                        ColorSupplier.getRandomColor());
            case 1:
                return new Rectangle(randomSize(),
                        randomSize(),
                        ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(randomSize(),
                        randomSize(),
                        ColorSupplier.getRandomColor());
            case 3:
                return new Square(randomSize(),
                        randomSize(),
                        ColorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(randomSize(),
                        randomSize(),
                        randomSize(),
                        ColorSupplier.getRandomColor());
            default:
                throw new RuntimeException("Unknown error");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, ColorEnum.WHITE.name());
    }
}
