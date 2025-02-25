package client.clientGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class clientGUI extends JFrame {
 
    public clientGUI() {
        super("Simple Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window
    }

    public void addComponents() {
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Click Me!");

        setLayout(new FlowLayout());
        add(label);
        add(textField);
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello, " + textField.getText());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                clientGUI gui = new clientGUI();
                gui.addComponents();
                gui.setVisible(true);
            }
        });
    }
}
