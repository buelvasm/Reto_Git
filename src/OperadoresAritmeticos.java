public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numero1, numero2;
        int resultadoSuma;
        int resultadoResta;
        int resultadoMultiplicacion;
        int resultadoDivision;
        int resultadoResiduo;

        numero1 = 20;
        numero2 = 15;

        resultadoSuma = numero1 + numero2;
        resultadoResta = numero1 - numero2;
        resultadoMultiplicacion = numero1 * numero2;
        resultadoDivision = numero1 / numero2;
        resultadoResiduo = numero1 % numero2;

        System.out.println("La suma de los numeros es: " + resultadoSuma);
        System.out.println("La resta de los numeros es: " + resultadoResta);
        System.out.println("La multiplicacion de los numeros es: " + resultadoMultiplicacion);
        System.out.println("La division de los numeros es: " + resultadoDivision);
        System.out.println("El residuo de la division de los numeros es: " + resultadoResiduo);
    }
}
