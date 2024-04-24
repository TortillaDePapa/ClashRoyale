import java.util.InputMismatchException;
import java.util.Scanner;

public class ClashRoyale{


    public ClashRoyale(){

    }

    public static void jugar(){
        int eleccion;
        boolean eleccionArena = false;
        System.out.println("Elija la dificultad:");
        while (!eleccionArena){ // Le pedimos al usuario que elija una de las 3 dificultades
            Scanner sc = new Scanner(System.in);
            System.out.println(" 1.Chica (10X10). \n 2.Mediana (15X10). \n 3.Grande (30X15). ");
            try {
                eleccion = sc.nextInt();
                if (eleccion<1 || eleccion> 3){
                    System.out.println("Por favor elija un valor entre el 1 y el 3.");

                }else {
                    Arena arena = new Arena(eleccion);
                    eleccionArena = true;
                }
            }catch (InputMismatchException e){
                System.out.println("El valor introducido no es aceptado");
            }


        }

        Arena.mostrarArena();// Mostramos la arena seleccionada por el jugador
        boolean hayGanador = false;
        System.out.println("Con las teclas WASD te mueves como en cualquier otro juego pero solo una casilla a la vez y Q con atacas.\n");
        while (!hayGanador){
            for (int i = 0; i <=1 ; i++) {
                if (i ==0){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Jugador elije tu siguiente movimiento:");
                    String movimiento = sc.next();
                    Jugador.movimiento(movimiento);
                    Arena.mostrarArena();
                }
            }
        }




    }


}
