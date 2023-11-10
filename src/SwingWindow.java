package src;
import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class SwingWindow extends JFrame {

    public SwingWindow(String text) {
        super(text);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        setSize(screenSize.width/2, screenSize.height/2);
        setLocation(screenSize.width/4, screenSize.height/4);
        System.out.println(screenSize.width);

        /* 
         * Notes - Here is where we can define JButtons, JTextFields, JComboBoxes, JCheckBoxes, JPasswordFields, JRadioButtons, JMenu stuff...
         * I've set up a grid layout for now but idk what we're gonna use so we can discuss that in our next meeting
         * I'll also upgrade the JPanel when necessary.
         */

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        addButton(panel, "Button1");


        this.add(panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private void addButton(JPanel panel, String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Monospaced", Font.BOLD, 22));
        panel.add(button);
    }
}
