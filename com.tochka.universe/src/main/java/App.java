import UI.DotFigure;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static UI.MainWindowHandler.appWindow;

public class App {
    public static void main(String[] args) {
        DotFigure dotFigure= new DotFigure(Color.BLACK, 0);
        DotFigure dotFigure1= new DotFigure(Color.GRAY, 0);
        DotFigure dotFigure2= new DotFigure(Color.MAGENTA, 0);
        dotFigure.setBounds(10, 40, 15, 15);
        dotFigure1.setBounds(15, 50, 20, 15);
        dotFigure2.setBounds(20, 60, 30, 15);
        JLayeredPane lp = appWindow().getMainWindow().getLayeredPane();
        lp.add(dotFigure, JLayeredPane.PALETTE_LAYER);
        lp.add(dotFigure1, JLayeredPane.PALETTE_LAYER);
        lp.add(dotFigure2, JLayeredPane.PALETTE_LAYER);

        double x = 1.0;

        System.out.println(x);
        for (int i = 0; i < 100; i++) {
            x=x+0.1;
            System.out.println(new BigDecimal(x).setScale(2, RoundingMode.HALF_UP).doubleValue());

        }

    }




}
