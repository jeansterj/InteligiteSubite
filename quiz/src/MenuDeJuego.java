public class MenuDeJuego {

    public static void menu(){
        String reset="\u001B[0m",cyan="\033[36m",purple="\033[35m",yellow="\033[33m";

        ImprimirPantalla.imprimirString("----------The Quiz Streamer----------");


        ImprimirPantalla.imprimirString("""


                1 - Juego Rapido""");
        ImprimirPantalla.imprimirString( cyan + "2 - Juego por categorias" + reset);
        ImprimirPantalla.imprimirString(purple + "3 - Instrucciones" + reset);
        ImprimirPantalla.imprimirString(yellow + "4 - Salir" + reset);
        ImprimirPantalla.imprimirString("""

                Selecciona como quieres jugar o si quieres consultar las instrucciones""");


    }
    public static void categorias(){

        String red="\033[31m" ,blue="\033[34m", cyan="\033[36m", reset="\u001B[0m";

        ImprimirPantalla.imprimirString("Seleciona la Categoria");


        ImprimirPantalla.imprimirString(cyan +"""
                1 - Auronplay"""+ reset);
        ImprimirPantalla.imprimirString(red +"2 - Rubius" + reset) ;
        ImprimirPantalla.imprimirString(blue + "3 - Volver" + reset);


    }



}
