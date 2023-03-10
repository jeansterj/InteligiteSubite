public class JuegoCategoria {

    public static Boolean Categorias(String[] preguntas, String[] respuestasBloqueUno, String[] respuestasBloqueDos, String[] respuestasBloqueTres, int[] respuestaCorrecta, int preguntasParaHacerCategorias, int[] indiceCategoria) {

        int respuestaUsuario, incorrecto = 0;
        double puntajePor, totalAciertos = preguntasParaHacerCategorias, puntajeDecimalDos = 0;
        boolean salir = false;

        String

                MENSAJETODOCORRECTO = "Felicidades todo bien, todo correcto y yo que me alegro," + " Has respondido todas las preguntas correctamente" + "\n";

        int i = 0;

        do {

            ImprimirPantalla.imprimirString("\n" + preguntas[indiceCategoria[i]]);
            ImprimirPantalla.imprimirString("\n" + "1-" + respuestasBloqueUno[indiceCategoria[i]]);
            ImprimirPantalla.imprimirString("2-" + respuestasBloqueDos[indiceCategoria[i]]);
            ImprimirPantalla.imprimirString("3-" + respuestasBloqueTres[indiceCategoria[i]]);
            ImprimirPantalla.imprimirString("\n" + "Elige el numero de tu respuesta");


                respuestaUsuario = SolicitudesAlUsuario.pedirRespuestaUsuario();

                if (respuestaUsuario == respuestaCorrecta[indiceCategoria[i]]) {
                    ImprimirPantalla.imprimirString("\n" + "Correcto");
                    incorrecto = 0;


                } else {
                    ImprimirPantalla.imprimirString("\n" + "Incorrecto");
                    incorrecto += 1;

                    totalAciertos -= 1;

                }


            if (incorrecto == 3) {
                salir = true;
            }

            i++;


        } while (!salir && i < preguntasParaHacerCategorias);

        if (incorrecto == 3) {

            ImprimirPantalla.imprimirString("Game Over");

        } else if (totalAciertos == preguntasParaHacerCategorias) {

            ImprimirPantalla.imprimirString(MENSAJETODOCORRECTO);

        } else {

            puntajePor = totalAciertos * 100 / preguntasParaHacerCategorias;
            puntajeDecimalDos = Math.round(puntajePor * 100.0) / 100.0;

            String

                    mensaje67Y99 = "\n" + "Has respondido el " + puntajeDecimalDos + "%  de preguntas " + "correctamente, tienes buenos conocimientos" + "\n",

                    mensaje34Y66 = "\n" + "Has respondido el  " + puntajeDecimalDos + "% de preguntas " + "correctamente, tienes conocimientos medios" + "\n",

                    mensaje1Y33 = "\n" + "Has respondido " + puntajeDecimalDos + "% correctamente, " + "te falta mucha calle" + "\n", mensaje0ACIERTOS = """

                    No has respondido ni una pregunta bien, mejor suerte la proxima
                    """;

            if (puntajeDecimalDos >= 67 && puntajeDecimalDos <= 99) {
                ImprimirPantalla.imprimirString(mensaje67Y99);
            } else if (puntajeDecimalDos >= 34 && puntajeDecimalDos <= 66) {
                ImprimirPantalla.imprimirString(mensaje34Y66);
            } else if (puntajeDecimalDos >= 1 && puntajeDecimalDos <= 33) {
                ImprimirPantalla.imprimirString(mensaje1Y33);
            } else if (puntajeDecimalDos <= 0) {
                ImprimirPantalla.imprimirString(mensaje0ACIERTOS);
            }


        }

        salir = SolicitudesAlUsuario.solicitarVueltaAlJuego();


        return salir;
    }


}


