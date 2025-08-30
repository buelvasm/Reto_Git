public class OperadoresComparacion {
    public static void main(String[] args) {
        int numeroOne, numeroTwo;
        int numeroThree, numeroFour;

        boolean resultadoIgual;
        boolean resultadoDistinto;
        boolean resultadoMenor;
        boolean resultadoMayor;
        boolean resultadoMenorIgual;
        boolean resultadoMayorIgual;

        numeroOne = 12;
        numeroTwo = 16;
        numeroThree = 13;
        numeroFour = 17;

        resultadoIgual = numeroOne == numeroTwo;
        resultadoDistinto = numeroThree != numeroFour;
        resultadoMenor = numeroOne < numeroTwo;
        resultadoMayor = numeroThree > numeroFour;
        resultadoMenorIgual = numeroOne <= numeroTwo;
        resultadoMayorIgual = numeroThree >= numeroFour;

        System.out.println("El resultado de la comparación es: " + resultadoIgual);
        System.out.println("El resultado de la comparación es: " + resultadoDistinto);
        System.out.println("El resultado de la comparación es: " + resultadoMenor);
        System.out.println("El resultado de la comparación es: " + resultadoMayor);
        System.out.println("El resultado de la comparación es: " + resultadoMenorIgual);
        System.out.println("El resultado de la comparación es: " + resultadoMayorIgual);
    }
}
