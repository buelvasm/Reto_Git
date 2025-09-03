public class OperadorCondicional {
    public static void main(String[] args) {
        int edadUno = 20;
        int edadDos = 20;
        String resultadoDos = "";

        // Operador condicional (ternario)
        String resultadoUno = (edadUno >= 18) ? "Es mayor de edad" : "Es menor de edad";
        resultadoDos = (edadDos == 18) ? "Es mayor de edad" : "Es menor de edad";

        System.out.println(resultadoUno);
        System.out.println(resultadoDos);
    }
}
