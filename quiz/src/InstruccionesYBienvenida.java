public class InstruccionesYBienvenida {

    public static void instrucciones() {

        ImprimirPantalla.imprimirString(" 1- Juego rapido: Te permite entrar a una partida rapida la cual, solo tendras que" + "\n" +
                "seleccionar la cantidad de preguntas que quieres responder, estas podran ser de cualquier categoria" + "\n" +
                "aleatoriamente, como minimo seran 5 preguntas a seleccionar, y un maximo de de 19, el juego" + "\n" +
                "terminara en cuando contestes todas las preguntas y no te equivoques mas de 3 veces seguidas," + "\n" +
                "al final se mostrara el porcentaje de acierto que has tenido" + "\n" );

        ImprimirPantalla.imprimirString(" 2 - Juego por categoria: tendras varias categorias a elegir en cual quieres jugar, igualmente " + "\n" +
                "podras seleccionar el maximo de preguntas a realizar, nuevamente el minimo es de 5, pero el maximo sera de 9," + "\n" +
                "el juego terminara en cuando contestes todas las preguntas y no te equivoques mas de 3 veces seguidas,"+ "\n" +
                "al final se mostrara el porcentaje de aciertos que has tenido"+ "\n");

    }

    public static void bienvenida() {

        ImprimirPantalla.imprimirString("Bienvenido al Quiz de Streamers, veamos cuanto sabes sobre ellos");

    }

}
