package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int randomColor = new Random().nextInt(Color.values().length);
        return Color.values()[randomColor].name();
    }
}