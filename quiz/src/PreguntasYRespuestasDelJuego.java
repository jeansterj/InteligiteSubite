public class PreguntasYRespuestasDelJuego {


    static String[] inicializarPreguntas() {

        final int maximoDePreguntas = 19, maximoDePreguntasAuron = 9;

        String [] PreguntasSencillas = new String[maximoDePreguntas],
                PreguntasAuronplay= inicializarPreguntasAuron(),
                PreguntasRubius = inicializarPreguntasRubius();

        int i = 0;
        do {

            PreguntasSencillas[i] = PreguntasAuronplay[i];

            i++;
        } while (i < maximoDePreguntasAuron);

        int j=0;
        for (int k = 9; k < maximoDePreguntas; k++) {

            PreguntasSencillas[k]=PreguntasRubius[j];
            j = j + 1;
        }


        return PreguntasSencillas;
    }


    public static String[] inicializarPreguntasAuron(){

        String[] PreguntasAuronplay =

                {

                        "¿A donde fue Auronplay de vacaciones en 2022?", "¿Quien es fundador de Squid Craft Games?",
                        "¿Quien bailo cuando lo hackearon?", "¿De quien es el personaje de Tony Gambino?",
                        "¿Quien es moderador del canal de Auronplay?", "¿Cual de estos es un integrante de Los Panas, junto a Auronplay?",
                        "¿De quien es el proyecto de Minecraf extremo?", "¿Quien no a hecho un extensible?",
                        "¿El reto del palomo cojo es idea de?", "¿Las populares bromas telefonicas, eran realizadas por?"};




        return PreguntasAuronplay;
    }
    public static String[] inicializarPreguntasRubius(){

        String[] PreguntasRubius={
                "¿A quien se le da el nombre de rata noruega?", "¿La skin de minecraf de pedobear a quien le pertenece?",
                "¿La marca de ropa MadKat a que streamer esta relacionada?", "¿Quien no salio en el Rewind de Rubius?",
                "¿Rubius es amigo de?", "¿Quiene no es un personaje de Virtual Hero?",
                "¿Quien lidero la guerra de Reddith?", "¿Como se llama el gato del Rubius?",
                "¿La pareja actual de Rubius es?", "¿Cuanto duro el extensible de Rubius?"};



        return PreguntasRubius;
    }
    static String[] respuestasSegundoBloque() {

        String [] respuestaAuronplay= respuestasSegundoBloqueAuron(),
                respuestaRubius = respuestasSegundoBloqueRubius(),
                BloqueDeRespuestas = mezclaArray(respuestaRubius,respuestaAuronplay);

        return BloqueDeRespuestas;
    }
    static String[] respuestasSegundoBloqueAuron() {

        String[] BloqueDeRespuestas = {

                "Ibiza", "Ibai",            // 1 y 2
                "Auronplay", "Perxita",     // 3 4
                "Rivers", "Ocho",           // 5 6
                "Rubius", "Auronplay",      // 7 8
                "Wismichu", "Juan Guarnizo",   // 9 10


        };
        return BloqueDeRespuestas;
    }


    static String[] respuestasSegundoBloqueRubius() {

        String[] BloqueDeRespuestas = {

                "Rubius", "Lolito",    // 11  12
                "Willyrex", "Biyin",      //13 y 14
                "Tom Holland", "Zombirella",    //15 y 16
                "Rubius", "Don Gato",        // 17 y 18
                "Cristinini", "7 dias"    // 19 y 20

        };
        return BloqueDeRespuestas;
    }

    static String[] respuestasPrimerBloque() {

        String [] respuestaAuronplay= respuestasPrimerBloqueAuron(),
                respuestaRubius = respuestasPrimerBloqueRubius(),
                BloqueDeRespuestas = mezclaArray(respuestaRubius,respuestaAuronplay);

        return BloqueDeRespuestas;
    }
    static String[] respuestasPrimerBloqueAuron() {

        String[] BloqueDeRespuestas = {

                "Maldivas", "Komanche",     // 1 y 2
                "Ibai", "Reborn",           // 3 4
                "Nill Ojeda", "Karchez",    // 5 6
                "The Gregf", "Rubius",      // 7 8
                "Jordi Wild", "Wismichu"   // 9 10


        };
        return BloqueDeRespuestas;
    }


    static String[] respuestasPrimerBloqueRubius() {

        String[] BloqueDeRespuestas = {

                "Vegetta777", "Mangel",    // 11  12
                "Rubius", "Irina",      //13 y 14
                "Will Smith", "Mangel",    //15 y 16
                "El Ded", "Wilson",        // 17 y 18
                "Jen Herranz", "9 dias"    // 19 y 20

        };
        return BloqueDeRespuestas;
    }

    static String[] respuestasTercerBloque() {

        String [] respuestaAuronplay= respuestasTercerBloqueAuron(),
                respuestaRubius = respuestasTercerBloqueRubius(),
                BloqueDeRespuestas = mezclaArray(respuestaRubius,respuestaAuronplay);

        return BloqueDeRespuestas;
    }
    static String[] respuestasTercerBloqueAuron() {

        String[] BloqueDeRespuestas = {

                "Canarias", "Auronplay",     // 1 y 2
                "Komanche", "Auronplay",           // 3 4
                "Axozer", "Polispol",    // 5 6
                "Auronplay", "TheGregf",      // 7 8
                "Auronplay", "Auronplay",   // 9 10


        };
        return BloqueDeRespuestas;
    }


    static String[] respuestasTercerBloqueRubius() {

        String[] BloqueDeRespuestas = {

                "Mangel", "Rubius",    // 11  12
                "Imantado", "Alexby11",      //13 y 14
                "Mangel", "Trotuman",    //15 y 16
                "Ibai", "Alex",        // 17 y 18
                "Irina Isasia", "11 dias"    // 19 y 20

        };
        return BloqueDeRespuestas;
    }


    static int[] respuestaCorrectas() {

        final int maximoDePreguntas = 19, maximoDePreguntasAuron = 9;
        int i = 0;


        int [] BloqueDeRespuestas = new int[maximoDePreguntas],
                respuestaAuronplay= respuestasCorrectaAuron(),
                respuestaRubius = respuestasCorrectaRubius();


        do {

            BloqueDeRespuestas[i] = respuestaAuronplay[i];

            i++;
        } while (i < maximoDePreguntasAuron);

        int j=0;
        for (int k = 9; k < maximoDePreguntas; k++) {

            BloqueDeRespuestas[k]=respuestaRubius[j];
            j = j + 1;
        }

        return BloqueDeRespuestas;
    }
    static int[] respuestasCorrectaAuron() {

        int[] BloqueDeRespuestas = {

                2, 1,     // 1 y 2
                2, 3,     // 3 4
                3, 2,    // 5 6
                3, 2,     // 7 8
                3, 3,   // 9 10


        };
        return BloqueDeRespuestas;
    }


    static int[] respuestasCorrectaRubius() {

        int[] BloqueDeRespuestas = {

                2, 3,    // 11  12
                1, 2,      //13 y 14
                1, 3,    //15 y 16
                2, 1,        // 17 y 18
                3, 1        // 19 y 20

        };
        return BloqueDeRespuestas;
    }

    public static int[] inicializarIndicePreguntas(int preguntasParaHacer) {

        int[] indices = new int[preguntasParaHacer];

        for (int i = 0; i < preguntasParaHacer; i++) {
            indices[i] = -1;

        }

        for (int i = 0; i < preguntasParaHacer; i++) {

            int aux;
            boolean exist = false;

            do {
                exist = false;
                aux = EleccionPreguntas.numeroAleatorio();
                for (int j : indices) {
                    if (!exist)
                        if (j == aux) {
                            exist = true;
                        }
                }
            } while (exist);

            indices[i] = aux;

        }

        return indices;
    }
    public static int[] inicializarIndicePreguntasAuron(int preguntasParaHacerCategorias) {

        int[] indices = new int[preguntasParaHacerCategorias];

        for (int i = 0; i < preguntasParaHacerCategorias; i++) {
            indices[i] = -1;

        }

        for (int i = 0; i < preguntasParaHacerCategorias; i++) {

            int aux;
            boolean exist = false;

            do {
                exist = false;
                aux = EleccionPreguntas.numeroAleatorioCategorias();
                for (int j : indices) {
                    if (!exist)
                        if (j == aux) {
                            exist = true;
                        }
                }
            } while (exist);

            indices[i] = aux;

        }

        return indices;
    }

    private static String[] mezclaArray(String[] respuestaRubius, String[] respuestaAuronplay) {

        final int maximoDePreguntas = 19, maximoDePreguntasAuron = 9;
        int i = 0;

        String [] MezclaArray = new String[maximoDePreguntas];

        do {

            MezclaArray[i] = respuestaAuronplay[i];

            i++;
        } while (i < maximoDePreguntasAuron);

        int j=0;
        for (int k = 9; k < maximoDePreguntas; k++) {

            MezclaArray[k]=respuestaRubius[j];
            j = j + 1;
        }



     return MezclaArray;
    }


}