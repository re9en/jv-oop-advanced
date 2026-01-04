package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    static final int Min_Size = 1;
    static final int Max_Size = 100;
    static final double Default_Radius = 10;
    static final int Figure_Count = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int randomSize() {
        return random.nextInt(Max_Size - Min_Size + 1) + Min_Size;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(Figure_Count);
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
        return new Circle(Default_Radius, ColorEnum.WHITE.name());
    }
}
