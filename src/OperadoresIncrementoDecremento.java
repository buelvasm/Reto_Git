public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        int numeroUno, numeroDos;
        numeroUno = 0;
        numeroDos = 5;

        // Esta es una forma tradicional
        //numeroUno = numeroUno + 1;

        numeroUno++;
        numeroDos--;

        System.out.println("El incremento es:" + numeroUno);
        System.out.println("El decremento es:" + numeroDos);
    }
}
