public class Main {

    public static void main(String[] args) {

        int preguntasParaHacer,preguntasParaHacerCategorias;
        int eleccionDeJuego , eleccionCategoria;
        boolean salir = false, salirCategoria= false;
        String[] preguntas, respuestasBloqueUno, respuestasBloqueDos,respuestasBloqueTres,preguntasAuron,preguntasRubius,
        respuestaPrimera,respuestaSegundo,respuestaTercero;
        int[] indice, respuestasCorrectas, indiceCategoria,respuestaCorrecta;

        //un comentario para no cambiar mucho el archivo



        InstruccionesYBienvenida.bienvenida();
        preguntas = PreguntasYRespuestasDelJuego.inicializarPreguntas();
        respuestasBloqueUno = PreguntasYRespuestasDelJuego.respuestasPrimerBloque();
        respuestasBloqueDos = PreguntasYRespuestasDelJuego.respuestasSegundoBloque();
        respuestasBloqueTres = PreguntasYRespuestasDelJuego.respuestasTercerBloque();
        respuestasCorrectas = PreguntasYRespuestasDelJuego.respuestaCorrectas();
        preguntasAuron = PreguntasYRespuestasDelJuego.inicializarPreguntasAuron();
        preguntasRubius = PreguntasYRespuestasDelJuego.inicializarPreguntasRubius();

        do {

       MenuDeJuego.menu();
       eleccionDeJuego = SolicitudesAlUsuario.opcionDeJuego();
            switch (eleccionDeJuego) {
                case 1 -> {
                    preguntasParaHacer = SolicitudesAlUsuario.pedirCantidadDePreguntas();
                    indice = PreguntasYRespuestasDelJuego.inicializarIndicePreguntas(preguntasParaHacer);
                    salir=MostrarPreguntas.MostrarPreguntasRapidas(preguntasParaHacer, indice, preguntas, respuestasBloqueUno, respuestasBloqueDos,
                            respuestasBloqueTres, respuestasCorrectas);
                }
                case 2 -> {
                    do {


                    MenuDeJuego.categorias();
                    eleccionCategoria = SolicitudesAlUsuario.solicitarCategoria();

                    switch (eleccionCategoria) {
                        case 1 -> {
                            respuestaPrimera = PreguntasYRespuestasDelJuego.respuestasPrimerBloqueAuron();
                            respuestaSegundo = PreguntasYRespuestasDelJuego.respuestasSegundoBloqueAuron();
                            respuestaTercero = PreguntasYRespuestasDelJuego.respuestasTercerBloqueAuron();
                            respuestaCorrecta = PreguntasYRespuestasDelJuego.respuestasCorrectaAuron();
                            preguntasParaHacerCategorias = SolicitudesAlUsuario.pedirCantidadDePreguntasCategorias();
                            indiceCategoria = PreguntasYRespuestasDelJuego.inicializarIndicePreguntasAuron(preguntasParaHacerCategorias);
                            salir=JuegoCategoria.Categorias(preguntasAuron, respuestaPrimera, respuestaSegundo,
                                    respuestaTercero, respuestaCorrecta, preguntasParaHacerCategorias, indiceCategoria);
                            if (salir) {
                                salirCategoria = true;
                            }
                        }
                        case 2 -> {
                            respuestaPrimera = PreguntasYRespuestasDelJuego.respuestasPrimerBloqueRubius();
                            respuestaSegundo = PreguntasYRespuestasDelJuego.respuestasSegundoBloqueRubius();
                            respuestaTercero = PreguntasYRespuestasDelJuego.respuestasTercerBloqueRubius();
                            respuestaCorrecta = PreguntasYRespuestasDelJuego.respuestasCorrectaRubius();
                            preguntasParaHacerCategorias = SolicitudesAlUsuario.pedirCantidadDePreguntasCategorias();
                            indiceCategoria = PreguntasYRespuestasDelJuego.inicializarIndicePreguntasAuron(preguntasParaHacerCategorias);
                            salir=JuegoCategoria.Categorias(preguntasRubius, respuestaPrimera, respuestaSegundo,
                                    respuestaTercero, respuestaCorrecta, preguntasParaHacerCategorias, indiceCategoria);
                            if (!salir) {
                                salirCategoria = true;
                            }
                        }
                        case 3 -> salirCategoria = true;
                    }
                    }while (!salirCategoria);

                }
                case 3 -> InstruccionesYBienvenida.instrucciones();
                case 4 -> salir = true;
            }



    } while (!salir);



    }




}