import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

class ActionButtons implements ActionListener{
    static Double a = null;
    static Double b = null;
    static String opAnt = null;
    Ventana vista;

    ActionButtons(Ventana vista){
        this.vista = vista;
    } 


    @Override
    public void actionPerformed(ActionEvent e){
        String ant;
        String cmd = e.getActionCommand().trim();


        if(cmd.matches("[0-9\\.]")){
            ant = this.vista.salida.getText();
            this.vista.salida.setText(ant+e.getActionCommand());
            return;
        }

        if(cmd.equals("=") && ActionButtons.a!=null){
            try{
                ActionButtons.b = Double.parseDouble(this.vista.salida.getText());
                this.vista.salida.setText(Double.toString(Logic.operacion(ActionButtons.a, ActionButtons.b, ActionButtons.opAnt)));
                System.out.println(ActionButtons.a);
                System.out.println(ActionButtons.b);
                System.out.println(ActionButtons.opAnt);
                System.out.println(Logic.operacion(ActionButtons.a, ActionButtons.b, ActionButtons.opAnt));
                
            }catch (Exception i) {
                this.vista.salida.setText("Error");;
                this.del();
            }
            return;
        }

        if (cmd.equals("DEL")){
            this.del();
            return;
        }
        try{
            ActionButtons.a = Double.parseDouble(this.vista.salida.getText());
            this.vista.salida.setText(" ");
            ActionButtons.opAnt=cmd;
        }catch(Exception j){
            this.vista.salida.setText("Error");
        }
    }

    void del(){
        ActionButtons.a = null;
        ActionButtons.b = null;
        ActionButtons.opAnt = null;
        this.vista.salida.setText(" ");
    }
}

public class Accions {
    Ventana vista;
    Accions(Ventana vista){
        this.vista = vista;
        for(JButton btn : this.vista.buttons){
            btn.addActionListener(new ActionButtons(this.vista));
        }
    }
}