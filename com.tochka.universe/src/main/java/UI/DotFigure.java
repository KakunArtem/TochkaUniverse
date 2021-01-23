package UI;

import javax.swing.*;
import java.awt.*;

public class DotFigure extends JComponent {
    private Color color;
    private int type;

    public DotFigure(Color color, int type) {
        this.color = color;
        this.type = type;
        setOpaque(true);
    }
    public void paintComponent(Graphics g) {
        // прорисовка фигуры
        g.setColor(color);
        switch (type) {
            case 0: g.fillOval(0, 0, 10, 10); break;
            case 1: g.fillRect(0, 0, 70, 70); break;
        }
        g.setColor(Color.yellow);
    }


}
