package lisson.gb;
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{
    Frame(){
        setTitle("Чат");
        setSize(new Dimension(400,400));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        BigTextPanel bigTextPanel = new BigTextPanel();
        SendPanel sendPanel = new SendPanel(bigTextPanel.getTextArea());
        add(bigTextPanel, BorderLayout.CENTER);
        add(sendPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
