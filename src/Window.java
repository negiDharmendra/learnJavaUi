import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by dharmenn on 28/02/16.
 */
public class Window extends JWindow {
    JPanel jPanel = new JPanel();

    public Window() {
        jPanel.setBackground(Color.CYAN);
        add(jPanel);
        JButton jButton = new JButton("Exit");
        jButton.setSize(40, 80);
        jButton.setAlignmentX(10);
        jButton.setAlignmentY(10);

        JButton btn;
        btn = new JButton("Exit");
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        btn.setMaximumSize(new Dimension(50,20));

        jPanel.add(btn);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Window window = new Window();
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
