import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Aciones implements ActionListener {
    Ventana vista;

    Aciones(Ventana vista){
        this.vista = vista;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Double a = Logica.check_input(this.vista.a.getText());
        Double b = Logica.check_input(this.vista.b.getText());

        Double r = Logica.calc_imc(a, b);

        if(r==null){
            this.vista.r.setText("Error");
            return;
        }

        this.vista.r.setText(Double.toString(Math.round(r)));

    }
    
}

public class Controlador {
    Ventana vista;
    
    Controlador(Ventana vista){
        this.vista =  vista;

        this.vista.calc.addActionListener(new Aciones(vista));
    }
    
}