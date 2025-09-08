import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int datoEdad;
        String datoNombre;

        System.out.print("Ingresa tu edad: ");
        datoEdad = entrada.nextInt();
        entrada.nextLine(); // Limpia el buffer

        System.out.print("Ingresa tu nombre: ");
        datoNombre = entrada.nextLine();

        System.out.println("La edad ingresada es: " + datoEdad);
        System.out.println("El nombre que ingresaste es: " + datoNombre);
    }
}
