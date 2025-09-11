package Estructuras_De_datos.Codigos_Clases.clase3;
import java.util.Scanner;

public class Game 
{
    public static void main(String[] args)
    {
        boolean inGame = true;
        Tablero tablero = new Tablero();
        Scanner sc = new Scanner(System.in);
        tablero.limpiarPantalla();
        while (inGame)
        {
            tablero.print_tablero();
            System.out.println("Tu juada:");
            String move = sc.next();
            int[] pos = tablero.ts_move(move);
            tablero.mover_peon(pos[0],pos[1]);
            tablero.limpiarPantalla();  
        }
        sc.close();
    }
    
}