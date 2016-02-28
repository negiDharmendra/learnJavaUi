import javax.swing.*;
import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("First J Frame");
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.add(new Panel());
        jFrame.setVisible(true);
        jFrame.setSize(300,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.black);

    }
}
