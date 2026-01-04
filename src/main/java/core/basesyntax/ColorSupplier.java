package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();

        ColorEnum[] values = ColorEnum.values();
        ColorEnum randomColor = values[random.nextInt(values.length)];

        return randomColor.name();
    }
}
