import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    JLabel peso,altura,imc;
    JTextField a,b,r;
    JButton calc;
    JPanel principal;

    Ventana(){
        this.setSize(300, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.peso = new JLabel("Peso:");
        this.peso.setFont(new Font("Arial", Font.BOLD, 30));
        this.altura = new JLabel("Altura:");
        this.altura.setFont(new Font("Arial", Font.BOLD, 30));
        this.imc = new JLabel("IMC:");
        this.imc.setFont(new Font("Arial", Font.BOLD, 30));

        this.a = new JTextField();
        this.a.setFont(new Font("Arial", Font.BOLD, 30));
        this.b = new JTextField();
        this.b.setFont(new Font("Arial", Font.BOLD, 30));
        this.r = new JTextField();
        this.r.setFont(new Font("Arial", Font.BOLD, 30));
        this.r.setEditable(false);

        this.calc =  new JButton("Calcular");

        this.principal = new JPanel();
        this.principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));
        
        this.principal.add(this.peso);
        this.principal.add(this.a);
        this.principal.add(this.altura);
        this.principal.add(this.b);
        this.principal.add(this.calc);
        this.principal.add(this.imc);
        this.principal.add(this.r);

        this.add(principal);
        this.setVisible(true);
    }
}