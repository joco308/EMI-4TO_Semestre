import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    
    JLabel salida;
    String[] textButtoms = {"7","8","9","+","4","5","6","-","1","2","3","x","0",".","=","/","DEL"};
    JButton[] buttons;
    JPanel principal,grillaBotones;

    Ventana(){
        this.setSize(500, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.salida = new JLabel(" ");
        this.salida.setFont(new Font("Arial",Font.BOLD, 70));

        this.buttons = new JButton[17];
        for(int  i = 0 ; i < 17 ; i++){
            this.buttons[i] = new JButton(textButtoms[i]);
            this.buttons[i].setActionCommand(textButtoms[i]);
        }


        this.grillaBotones = new JPanel(new GridLayout(5, 4));
        this.principal = new JPanel();
        this.principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));

        this.principal.add(this.salida);
        this.principal.add(this.grillaBotones);

        for(JButton i : this.buttons){
            this.grillaBotones.add(i);
        }

        this.add(this.principal);

        this.setVisible(true);
    }
    
}