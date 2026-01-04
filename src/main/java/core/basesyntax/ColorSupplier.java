package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        final Random random = new Random();

        ColorEnum[] values = ColorEnum.values();
        ColorEnum randomColor = values[random.nextInt(values.length)];

        return randomColor.name();
    }
}
