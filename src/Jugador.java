import java.util.Objects;

public class Jugador {

    public static void movimiento(String movimiento) {
        int movimientoX , movimientoY;
        int[] posicionJugador;
        System.out.println(movimiento);

        if (Objects.equals(movimiento, "W") || Objects.equals(movimiento, "w")){
            posicionJugador=Arena.posicionJugador();
             movimientoX = posicionJugador[0];
             movimientoY = posicionJugador[1];
             movimientoX -= 1;
             Arena.movimientoJugador(movimientoX,movimientoY);
        }else if (Objects.equals(movimiento, "S") || Objects.equals(movimiento, "s")){
            posicionJugador=Arena.posicionJugador();
            movimientoX = posicionJugador[0];
            movimientoY = posicionJugador[1];
            movimientoX += 1;
            Arena.movimientoJugador(movimientoX,movimientoY);
        } else if (Objects.equals(movimiento, "A") || Objects.equals(movimiento, "a")) {
            posicionJugador=Arena.posicionJugador();
            movimientoX = posicionJugador[0];
            movimientoY = posicionJugador[1];
            movimientoY -= 1;
            Arena.movimientoJugador(movimientoX,movimientoY);
        } else if (Objects.equals(movimiento, "D") || Objects.equals(movimiento, "d")) {
            posicionJugador=Arena.posicionJugador();
            movimientoX = posicionJugador[0];
            movimientoY = posicionJugador[1];
            movimientoY += 1;
            Arena.movimientoJugador(movimientoX,movimientoY);
        }
    }
}
