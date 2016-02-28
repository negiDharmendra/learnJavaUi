import javax.swing.*;
import java.awt.*;

/**
 * Created by dharmenn on 28/02/16.
 */
public class Try {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Trails");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton btn;
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.Y_AXIS));
        btn = new JButton("Exit");
        secondPanel.add(btn);

        frame.setContentPane(secondPanel);

        frame.setSize(520, 600);
        frame.setMinimumSize(new Dimension(520, 600));
        frame.setVisible(true);
    }
}
