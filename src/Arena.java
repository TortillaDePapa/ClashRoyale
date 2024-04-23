import java.util.Arrays;

public class Arena {


    public Arena(){

    }

    public static String[][] seleccionDeArena(int eleccion){
        String[][] tamañoArena = new String[0][0];
        switch (eleccion){
            case 1:
                tamañoArena = new String[10][10];
                for (int i = 0; i <tamañoArena.length ; i++) {
                    Arrays.fill(tamañoArena[i],"*");
                }

                break;
            case 2:
                tamañoArena = new String[15][10];
                for (int i = 0; i <tamañoArena.length ; i++) {
                    Arrays.fill(tamañoArena[i],"*");
                }
                break;
            case 3:
                tamañoArena = new String[30][15];
                for (int i = 0; i <tamañoArena.length ; i++) {
                    Arrays.fill(tamañoArena[i],"*");
                }
                break;
            default:
                tamañoArena = new String[10][10];

        }
        return tamañoArena;
    }

}
