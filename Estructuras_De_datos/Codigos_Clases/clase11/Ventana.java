import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener{
    JLabel entrada;
    JButton[] buttons;
    JPanel principal,panelbuttons,panelEntrada;

    Ventana(){
        setTitle("Calculadora");
        setSize(350,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.entrada = new JLabel(" ");
        this.entrada.setFont(new Font("Arial", ABORT,60));
        

        String[] buttomsS = {"C", "+","-","x","7", "8","9","/","4", "5","6","=","1","2","3","0","."}; 
        this.buttons = new JButton[buttomsS.length];

        for(int i = 0; i < buttomsS.length; i++){
            this.buttons[i] = new JButton(buttomsS[i]);
        }

        this.principal = new JPanel();
        this.principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));

        this.panelbuttons = new JPanel();
        this.panelbuttons.setLayout(new GridLayout(5,4));

        for(JButton i : buttons){
            this.panelbuttons.add(i);
        }

        this.principal.add(this.entrada);
        this.principal.add(panelbuttons);

        this.add(principal);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String t = this.entrada.getText();
        JButton botonPrecionado = (JButton) e.getSource();
    }
    
}
