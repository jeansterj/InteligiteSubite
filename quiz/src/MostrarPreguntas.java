import java.util.Objects;

public class MostrarPreguntas {

    public static Boolean MostrarPreguntasRapidas(int preguntasParaHacer, int[] indice, String[] preguntas, String[] respuestasBloqueUno
            , String[] respuestasBloqueDos, String[] respuestasBloqueTres, int[] respuestasCorrectas) {

        boolean salir = false;
        int respuestaUsuario, incorrecto = 0;
        double puntajePor, totalAciertos = preguntasParaHacer, puntajeDecimalDos = 0;

        String

                MENSAJETODOCORRECTO = "Felicidades todo bien, todo correcto y yo que me alegro," +
                " Has respondido todas las preguntas correctamente" + "\n";

        String red="\033[31m", reset="\u001B[0m";

        int i = 0;
        do {




                ImprimirPantalla.imprimirString("\n" + preguntas[indice[i]]);
                ImprimirPantalla.imprimirString("\n" + "1-" + respuestasBloqueUno[indice[i]]);
                ImprimirPantalla.imprimirString("2-" + respuestasBloqueDos[indice[i]]);
                ImprimirPantalla.imprimirString("3-" + respuestasBloqueTres[indice[i]]);
                ImprimirPantalla.imprimirString("\n" + "Elige el numero de tu respuesta");


                    respuestaUsuario = SolicitudesAlUsuario.pedirRespuestaUsuario();

                    if (respuestaUsuario ==  respuestasCorrectas[indice[i]]) {
                        ImprimirPantalla.imprimirString("\n" + "Correcto");
                        incorrecto=0;


                    } else {
                        ImprimirPantalla.imprimirString("\n" + "Incorrecto");
                        incorrecto += 1;
                        totalAciertos -= 1;

                    }


                if (incorrecto==3){
                    salir= true;
                }
                i++;


        } while (!salir && i < preguntasParaHacer);

        if (incorrecto==3){

            ImprimirPantalla.imprimirString("Game Over");

        } else if (totalAciertos == preguntasParaHacer) {

            ImprimirPantalla.imprimirString(MENSAJETODOCORRECTO);

        } else {

            puntajePor = totalAciertos * 100 / preguntasParaHacer;
            puntajeDecimalDos = Math.round(puntajePor * 100.0) / 100.0;
            String

                    MENSAJE67Y99 = "\n" + "Has respondido el " + puntajeDecimalDos + "%  de preguntas " +
                    "correctamente, tienes buenos conocimientos sobre streamers" + "\n";
            String MENSAJE34Y66 = "\n" + "Has respondido el  " + puntajeDecimalDos + "% de preguntas " +
                                        "correctamente, conoces medianamente a los streamers" + "\n";
            String MENSAJE1Y33 = "\n" + "Has respondido " + puntajeDecimalDos + "% correctamente, " +
                                        "te falta mucha calle" + "\n";
            String MENSAJE0ACIERTOS = """
            
                                        No has respondido ni una pregunta bien, mejor suerte la proxima
                                        """;

            if (puntajeDecimalDos >= 67 && puntajeDecimalDos <= 99) {
                ImprimirPantalla.imprimirString(MENSAJE67Y99);
            } else if (puntajeDecimalDos >= 34 && puntajeDecimalDos <= 66) {
                ImprimirPantalla.imprimirString(MENSAJE34Y66);
            } else if (puntajeDecimalDos >= 1 && puntajeDecimalDos <= 33) {
                ImprimirPantalla.imprimirString(MENSAJE1Y33);
            } else if (puntajeDecimalDos <= 0) {
                ImprimirPantalla.imprimirString(MENSAJE0ACIERTOS);
            }

        }

        salir = SolicitudesAlUsuario.solicitarVueltaAlJuego();

return salir;

    }
}
