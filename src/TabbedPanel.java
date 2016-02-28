import javax.swing.*;

/**
 * Created by dharmenn on 28/02/16.
 */
public class TabbedPanel extends JFrame {
    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    JLabel firstLable = new JLabel("First");
    JLabel secondLable = new JLabel("Second");
    JTabbedPane jTabbedPane = new JTabbedPane();

    public TabbedPanel(){
        firstPanel.add(firstLable);
        secondPanel.add(secondLable);
        jTabbedPane.add("First",firstPanel);
        jTabbedPane.add("First",secondPanel);
        add(jTabbedPane);
    }

    public static void main(String[] args) {
        TabbedPanel tabbedPanel = new TabbedPanel();
        tabbedPanel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabbedPanel.setSize(400,400);
        tabbedPanel.setVisible(true);
    }
}
