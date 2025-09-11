package Estructuras_De_datos.Codigos_Clases.clase3;

public class Tablero 
{
    String[][] tablero = new String[8][8];
    Peon peon = new Peon("fristPeon", "Banco");
    Dama dama = new Dama("fristDama","negra");

    public Tablero()
    {
        for(int e = 0 ; e < 8;e++)
        {
            for(int c = 0; c<8; c++ )
            {
                this.tablero[e][c]="☐";
            }
        }
        this.update_tablero();
    }

    public void update_tablero()
    {
        for(int e = 0 ; e < 8;e++)
        {
            for(int c = 0; c<8; c++ )
            {
                this.tablero[e][c]="☐";
            }
        }
        if(this.peon.mostrar()[1]==this.dama.mostrar()[1]&&this.peon.mostrar()[0]==this.dama.mostrar()[0])
        {
            this.tablero[3][1] = "G";
            this.tablero[3][2] = "A";
            this.tablero[3][3] = "M";
            this.tablero[3][4] = "E";
            this.tablero[4][3] = "O";
            this.tablero[4][4] = "V";
            this.tablero[4][5] = "E";
            this.tablero[4][6] = "R";

        }
        else
        {
            this.tablero[this.peon.mostrar()[1]][this.peon.mostrar()[0]] = "♙";
            this.tablero[this.dama.mostrar()[1]][this.dama.mostrar()[0]] = "♛";
        }
    }

    public void print_tablero()
    {
        this.update_tablero();
        for(String[] e : tablero)
        {
            for(String c : e)
            {
                System.out.print(c+"  ");
            }
            System.out.println();
        }
    }

    public void mover_peon(int posc, int pose)
    {
        peon.mover(posc, pose);
        dama.mover(dama.mostrar()[0], dama.mostrar()[1], posc, pose);
        this.update_tablero();
    }

    public void limpiarPantalla()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    int[] ts_move(String move)
    {
        int posC,posE;
        switch (Character.toLowerCase(move.charAt(0))) // uso toLowerCase para simplificar
        {
            case 'a':
                posC = 0;
                break;
            case 'b':
                posC = 1;
                break;
            case 'c':
                posC = 2;
                break;
            case 'd':
                posC = 3;
                break;
            case 'e':
                posC = 4;
                break;
            case 'f':
                posC = 5;
                break;
            case 'g':
                posC = 6;
                break;
            case 'h':
                posC = 7;
                break;
            default:
                posC = 0;
                break;
        }
        switch(move.charAt(1))
        {
            case '8':
                posE = 0;
                break;
            case '7':
                posE = 1;
                break;
            case '6':
                posE = 2;
                break;
            case '5':
                posE = 3;
                break;
            case '4':
                posE = 4;
                break;
            case '3':
                posE = 5;
                break;
            case '2':
                posE = 6;
                break;
            case '1':
                posE = 7;
                break;
            default:
                posE = 0;
                break;
        }

        return new int[]{posC,posE};
    }
}