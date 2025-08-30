public class OperadoresLogicos {
    public static void main(String[] args) {

        int numeroUno = 15;
        int numeroDos = 25;

        boolean resultadoAnd;
        boolean resultadoOr;
        boolean resultadoNot;
        //Evalua dos condiciones y devuelve true si ambas condiciones son verdaderas.
        resultadoAnd = (numeroUno <= numeroDos) && (numeroDos != numeroUno);
        //Evalua dos condiciones y devuelve true si almenos una condicion de las dos es verdadera.
        resultadoOr = (numeroUno >= numeroDos) || (numeroDos < numeroUno);
        //Si la expresión es true con ! la convierte en false.
        resultadoNot = !(numeroDos > numeroUno);

        System.out.println("El resultado es: " + resultadoAnd);
        System.out.println("El resultado es: " + resultadoOr);
        System.out.println("El resultado es: " + resultadoNot);

    }
}
