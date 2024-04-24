import java.util.Arrays;
import java.util.Random;

public class Arena {

    public static  String[][] tamañoArena ;
    public Arena(int eleccion){

        Random azar = new Random();
        int aleatorio, aleatorio2 ;
        switch (eleccion){
            case 1:
                tamañoArena = new String[10][10];
                aleatorio =  azar.nextInt(tamañoArena.length-1);
                for (int i = 0; i <tamañoArena.length ; i++) {
                    Arrays.fill(tamañoArena[i],"*");
                }
                tamañoArena[tamañoArena.length-1][tamañoArena.length-1] = "J";
                tamañoArena[0][0] = "M";
                for (int i =0; i < 4; i++){
                    if (tamañoArena[aleatorio][aleatorio]!= "J" && tamañoArena[aleatorio][aleatorio]!= "M" && tamañoArena[aleatorio][aleatorio]!= "O") {
                        tamañoArena[aleatorio][aleatorio] ="O";
                    }else{
                        aleatorio =  azar.nextInt(tamañoArena.length-1);
                        i--;
                    }
                }

                break;
            case 2:
                tamañoArena = new String[15][10];
                aleatorio =  azar.nextInt(tamañoArena.length);
                aleatorio2 = azar.nextInt(tamañoArena[0].length);
                for (int i = 0; i <tamañoArena.length ; i++) {
                    Arrays.fill(tamañoArena[i],"*");
                }
                tamañoArena[tamañoArena.length-1][tamañoArena[0].length-1] = "J";
                tamañoArena[0][0] = "M";
                for (int i =0; i < 8; i++){
                    if (tamañoArena[aleatorio][aleatorio2]!= "J" && tamañoArena[aleatorio][aleatorio2]!= "M" && tamañoArena[aleatorio][aleatorio2]!= "O") {
                        tamañoArena[aleatorio][aleatorio2] ="O";
                    }else{
                        aleatorio =  azar.nextInt(tamañoArena.length);
                        aleatorio2 = azar.nextInt(tamañoArena[0].length);
                        i--;
                    }
                }

                break;
            case 3:
                tamañoArena = new String[30][15];
                aleatorio =  azar.nextInt(tamañoArena.length);
                aleatorio2 = azar.nextInt(tamañoArena[0].length);
                for (int i = 0; i <tamañoArena.length ; i++) {
                    Arrays.fill(tamañoArena[i],"*");
                }
                tamañoArena[tamañoArena.length-1][tamañoArena[0].length-1] = "J";
                tamañoArena[0][0] = "M";
                for (int i =0; i < 12; i++){
                    if (tamañoArena[aleatorio][aleatorio2]!= "J" && tamañoArena[aleatorio][aleatorio2]!= "M" && tamañoArena[aleatorio][aleatorio2]!= "O") {
                        tamañoArena[aleatorio][aleatorio2] ="O";
                    }else{
                        aleatorio =  azar.nextInt(tamañoArena.length);
                        aleatorio2 = azar.nextInt(tamañoArena[0].length);
                        i--;
                    }
                }

                break;
            default:
                aleatorio =  azar.nextInt(tamañoArena.length);
                for (int i = 0; i <tamañoArena.length ; i++) {
                    Arrays.fill(tamañoArena[i],"*");
                }
                tamañoArena[tamañoArena.length-1][tamañoArena.length-1] = "J";
                tamañoArena[0][0] = "M";
                for (int i =0; i < 2; i++){
                    if (tamañoArena[aleatorio][aleatorio]!= "J" && tamañoArena[aleatorio][aleatorio]!= "M" && tamañoArena[aleatorio][aleatorio]!= "O") {
                        tamañoArena[aleatorio][aleatorio] ="O";
                    }else{
                        aleatorio =  azar.nextInt(tamañoArena.length);
                        i--;
                    }
                }

                break;

        }

    }





    public static void mostrarArena(){
        for (int i = 0; i <tamañoArena.length ; i++) {
            for (int j = 0; j <tamañoArena[0].length ; j++) {
                System.out.print(tamañoArena[i][j]);
            }
            System.out.println();
        }

    }

}
