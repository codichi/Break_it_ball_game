/**import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gamePlay = new GamePlay();

        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Break It Ball");


        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
}
}
*/