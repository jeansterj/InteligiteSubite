public class EleccionPreguntas {

    public static int numeroAleatorio(){
        int eleccionAleatorea;
        eleccionAleatorea = (int) (Math.random() * 19);
        return eleccionAleatorea;

    }
    public static int numeroAleatorioCategorias(){

        int eleccionAleatorea, max = 9;

        eleccionAleatorea = (int) (Math.random() * max);
        return eleccionAleatorea;

    }
}
