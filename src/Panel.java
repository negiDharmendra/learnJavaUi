import javax.swing.*;
import java.awt.*;

/**
 * Created by dharmenn on 28/02/16.
 */
public class Panel extends JPanel{

    public Panel() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.gray);
        g.fill3DRect(10,10,50,50,true);
    }
}
