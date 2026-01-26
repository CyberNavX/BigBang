package Nivel_1;

import java.util.Scanner;

public class _06_EntradaDeDatos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;
        float numero2;
        char letra;
        // String cadena;

        System.out.println("Digite un numero entero: ");
        numero = entrada.nextInt();

        System.out.println("Digite un numero con decimal: "); // En el output hay que poner como [,] el punto (.) si no compila
        numero2 = entrada.nextFloat();

        System.out.println("Ingrese una cadena: ");
        letra = entrada.next().charAt(0);

        System.out.println("El numero es: " + numero);
        System.out.println("El numero es: " + numero2);
        System.out.println("La letra es: " + letra);




        // System.out.println("Ingrese su numbre y apellido: ");
        // cadena = entrada.nextLine();
            
            /*
                entrada.next(); - Solo toma la cadena de caracteres antes de un espacio.
                entrada.nextLine(); - Toma todas las cadenas de caracteres con o sin espacio.
            */
 
        // System.out.println("Nombre: " + cadena);

    }
    
}