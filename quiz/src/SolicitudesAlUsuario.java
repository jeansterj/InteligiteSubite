public class SolicitudesAlUsuario {

    public static int pedirCantidadDePreguntas(){
        int cantidad= 0;
        boolean salir = false;
        String red="\033[31m",reset="\u001B[0m";
        do {
            try {
                ImprimirPantalla.imprimirString("Selecciona la cantidad de preguntas que quieres contestar (Minimo 5)(Maximo 19)");
                cantidad = Teclat.llegirInt();

                if (cantidad <= 4 || cantidad >= 20) {
                    ImprimirPantalla.imprimirString(red+"Ese dato no es valido"+reset);
                } else {
                    salir = true;
                }

            }catch (Exception error){
                ImprimirPantalla.imprimirString(red+"Ingresa un numero por favor"+reset);
            }
            } while (!salir); {




            return cantidad;
        }
    }

    public static int pedirCantidadDePreguntasCategorias(){
        int cantidad= 0;
        boolean salir = false;
        String red="\033[31m",reset="\u001B[0m";

        do {
            try {
                ImprimirPantalla.imprimirString("Selecciona la cantidad de preguntas que quieres contestar (Minimo 5)");
                cantidad = Teclat.llegirInt();

                if (cantidad <= 4 || cantidad >= 10) {
                    ImprimirPantalla.imprimirString(red+"Ese dato no es valido"+reset);
                } else {
                    salir = true;
                }

            }catch (Exception error){
                ImprimirPantalla.imprimirString(red+"Ingresa un numero por favor"+reset);
            }
        } while (!salir); {




            return cantidad;
        }
    }

    public static int opcionDeJuego (){
        int eleccion=0;
        boolean salir=false;
        String red="\033[31m",reset="\u001B[0m";
       do {
           try {

               eleccion = Teclat.llegirInt();
               if (eleccion <= 0 || eleccion >= 4) {
                   ImprimirPantalla.imprimirString(red +"Ese dato no es valido, ingresa un numero entre 1 a 3"+reset);
               } else {
                   salir = true;
               }

           }catch (Exception error){
               ImprimirPantalla.imprimirString(red + "Ingresa un numero por favor"+ reset);
           }
       }while (!salir);

        return eleccion;

    }

    public static int solicitarCategoria() {

        int eleccion=0;
        boolean salir=false;
        String red="\033[31m",reset="\u001B[0m";
        do {
            try {

                eleccion = Teclat.llegirInt();
                if (eleccion <= 0 || eleccion >= 4) {
                    ImprimirPantalla.imprimirString(red + "Ese dato no es valido, ingresa un numero entre 1 a 3" + reset);
                } else {
                    salir = true;
                }

            }catch (Exception error){
                ImprimirPantalla.imprimirString(red + "Ingresa un numero por favor"+ reset );
            }
        }while (!salir);

        return eleccion;

    }

    public static boolean solicitarVueltaAlJuego() {

        boolean salir = false, salirOpcion = false;
        char opcion;
        String red="\033[31m",reset="\u001B[0m",purple="\033[35m",blue="\033[34m";

        do {


            ImprimirPantalla.imprimirString("¿Deseas volver a jugar?");
            ImprimirPantalla.imprimirString("Si = y , No = n");
            try {
                opcion = Teclat.llegirChar();
                opcion = Character.toLowerCase(opcion);

                if (opcion != 'y' && opcion != 'n') {
                    ImprimirPantalla.imprimirString(red+ "Esa letra no es valida" + reset);
                } else if (opcion == 'y') {
                    salirOpcion = true;
                    salir = false;
                } else if (opcion == 'n') {
                    ImprimirPantalla.imprimirString(purple +"Hasta Luego");
                    salir = true;
                    salirOpcion = true;
                }
            } catch (Exception error) {
                ImprimirPantalla.imprimirString(blue + "Ingresa y o n por favor" + reset);
            }
        } while (!salirOpcion);


        return salir;
    }

    public static int pedirRespuestaUsuario() {
        int respuestaUsuario = 0;

        boolean salirCorrecto = false;
        String red="\033[31m",reset="\u001B[0m";


        do {
            try {

                respuestaUsuario = Teclat.llegirInt();

                if (respuestaUsuario <= 0 || respuestaUsuario >= 4) {

                    ImprimirPantalla.imprimirString(red +"La respuesta debe ser un valor entre 1 y 3"+ reset);

                } else {
                    salirCorrecto = true;
                }

            } catch (Exception error) {
                ImprimirPantalla.imprimirString(red + "Ingresa un numero por favor" + reset);
            }


        } while (!salirCorrecto);

        return  respuestaUsuario;

    }
}
