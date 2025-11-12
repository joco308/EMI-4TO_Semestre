import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    JLabel dato1, dato2,result;
    JTextField a,b,r;
    JButton suma,resta,division,multiplicacion,cociente,residuo;
    JPanel panel;

    Ventana(){
        this.dato1 = new JLabel("Dato 1: ");
        this.dato2 = new JLabel("Dato 2: ");
        this.result = new JLabel("Resultado : ");

        this.a = new JTextField(20);
        this.b = new JTextField(20);
        this.r = new JTextField(20);

        this.suma = new JButton("Suma");
        this.division = new JButton("Division");
        this.resta = new JButton("Resta");
        this.multiplicacion = new JButton("Multiplicacion");
        this.residuo = new JButton("Residuo");
        this.cociente = new JButton("Cociente");
        
        this.panel = new JPanel();
        this.panel.add(this.dato1);
        this.panel.add(this.a);
        this.panel.add(this.dato2);
        this.panel.add(this.b);
        this.panel.add(this.suma);
        this.panel.add(this.resta);
        this.panel.add(this.multiplicacion);
        this.panel.add(this.division);
        this.panel.add(this.cociente);
        this.panel.add(this.residuo);
        this.panel.add(this.result);
        this.panel.add(this.r);
        
        this.getContentPane().add(this.panel);

        this.setSize(300,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    
}