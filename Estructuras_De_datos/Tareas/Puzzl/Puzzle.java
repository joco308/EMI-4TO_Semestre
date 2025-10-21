import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Puzzle {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Puzzle");
        ventana.setSize(660, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setVisible(true);

        JPanel panel = new JPanel(new GridLayout(3,3));

        JPanel[][] grit = new JPanel[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                grit[i][j] = new JPanel(new GridLayout(1,1));
                panel.add(grit[i][j],BorderLayout.CENTER);
            }
        }

        grit[1][1].add(new JButton("1"));
        grit[0][0].add(new JButton("2"));
        ventana.add(panel);

        ventana.setVisible(true);
    }
}
