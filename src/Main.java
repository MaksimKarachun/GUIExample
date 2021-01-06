import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GUIExample");
        frame.setSize(300, 200);

        frame.add(new MainForm().getMainPanel());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
