import java.util.Scanner;

public class BienvenidoOscar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        //Lectura de variables
        System.out.println("Escribe el nombre del usuario");
        nombre = teclado.nextLine();
        System.out.println("Escribe el número de celular del usuario");
        int celular = Integer.parseInt(teclado.nextLine());
        System.out.println("Escribe la edad del usuario");
        int edad = Integer.parseInt(teclado.nextLine());
        System.out.println("Bienvenido señor " + nombre + ", " +
                "es un placer para nosotros contar con una persona de " + edad + "" +
                " años. \nPróximamente nos comunicaremos con usted al numero " + celular + ". \nFeliz día ");

    }
}

