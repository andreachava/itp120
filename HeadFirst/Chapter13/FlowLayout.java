import javax.swing.*;
import java.awt.*;

public class FlowLayout {
    public static void main (String[] args) {
        FlowLayout gui = new FlowLayout();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shock me");
        //JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        //panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
