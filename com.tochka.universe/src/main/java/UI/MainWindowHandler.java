package UI;

import javax.swing.*;
import java.awt.*;

public class MainWindowHandler {
    private static MainWindowHandler instance;
    private final JFrame mainWindow = new JFrame("Tochka Universe");
    private final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public static MainWindowHandler appWindow() {
        if (instance == null) {
            instance = new MainWindowHandler();
        }
        return instance;
    }

    public JFrame getMainWindow() {
        return mainWindow;
    }

    private MainWindowHandler() {
        this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWindow.setVisible(true);
        //TODO size to props
        this.mainWindow.setSize(804, 804);
        this.centerMainWindow();
    }

    private void centerMainWindow() {
        this.mainWindow.setLocation(
                this.dim.width / 2 - this.mainWindow.getSize().width / 2,
                this.dim.height / 2 - this.mainWindow.getSize().height / 2);
    }


}
