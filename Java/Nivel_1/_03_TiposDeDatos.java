package BigBang.Java.Nivel_1;

public class _03_TiposDeDatos {
    
    public static void main(String[] args) {
        
    /*

    Los tipos de datos primitivos

        Son los bloques basicos y mas rapidos porque guardan el valor directamente 
        en la memoria (Stack). Existen 8 tipos:

        A. Enteros(Numeros sin decimales)

            [byte]  -   Su tamaño es de 8 bits y ahorra memoria en Arrays grandes.
            [short] -   Su tamaño es de 16 bits y es poco comun hoy en dia. 
            [int]   -   Su tamaño es de 32 bits y es el estandar para numeros enteros.
            [long]  -   Su tamaño es de 64 bits y se usa para IDs o tiempo en milisegundos.  
            
        B. Punto Flotante (Numero con decimales)

            [float] -   Su tamaño es de 32 bits y se usa para cifras con punto decimal.
            [double]-   Su tamaño es de 64 bits y es el estandar para decimales.

        C. Otros primitivos

            [boolean]-  Solo puede ser true o false (java no usa 0 o 1 como booleanos).
            [char]  -   Un solo caracter Unicode de 16 bits. Se escribe en comillas simples ('').
    
    */

        byte entero = 12;
        short numero1 = 12234;
        int numero2 = 235455433;
        long numero3 = 234232232;
        double decimal1 = 235.5f;
        float decimal2 = 32234.232f;
        char caracter = 'h';
        boolean decision = true;

        System.out.println("Numero con byte: " + entero);
        System.out.println("Numero con short: " + numero1);
        System.out.println("Numero con int: " + numero2);
        System.out.println("Numero con long: " + numero3);
        System.out.println("Numero con double: " + decimal1);
        System.out.println("Numero con float: " + decimal2);
        System.out.println("Caracter con char: " + caracter);
        System.out.println("Decicion con dato boolean: " + decision);

    }


}