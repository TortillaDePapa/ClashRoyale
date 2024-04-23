import java.util.InputMismatchException;
import java.util.Scanner;

public class ClashRoyale{


    public ClashRoyale(){

    }

    public static void jugar(){
        int eleccion = 0;
        boolean eleccionArena = false;
        System.out.println("Elija la dificultad:");
        while (!eleccionArena){
            Scanner sc = new Scanner(System.in);
            System.out.println(" 1.Chica (10X10). \n 2.Mediana (15X10). \n 3.Grande (30X15). ");
            try {
                eleccion = sc.nextInt();
                if (eleccion<1 || eleccion> 3){
                    System.out.println("Por favor elija un valor entre el 1 y el 3.");

                }else {
                    Arena.seleccionDeArena(eleccion);
                    eleccionArena = true;
                }
            }catch (InputMismatchException e){
                System.out.println("El valor introducido no es aceptado");
            }


        }
        if (eleccionArena){

        }




    }


}
