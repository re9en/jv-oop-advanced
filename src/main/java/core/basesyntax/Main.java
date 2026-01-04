package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] randomArray = new String[] {
                figureSupplier.getRandomFigure().draw(),
                figureSupplier.getRandomFigure().draw(),
                figureSupplier.getRandomFigure().draw(),
                figureSupplier.getDefaultFigure().draw(),
                figureSupplier.getDefaultFigure().draw(),
                figureSupplier.getDefaultFigure().draw()
        };
        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }
    }
}

