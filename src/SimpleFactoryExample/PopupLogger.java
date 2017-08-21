package SimpleFactoryExample;

import javax.swing.*;

public class PopupLogger extends Logger {
    @Override
    public void LogError(Throwable ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }
}
