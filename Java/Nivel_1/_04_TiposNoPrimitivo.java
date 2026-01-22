package BigBang.Java.Nivel_1;

class _04_TiposNoPrimitivo {
    
    public static void main(final String[] args) {
     
        /*
            Los tipos de datos no primitivos pueden almacenar [null].
            Los tipos de datos no primitivos tienen metodos.
        */   
    
        //int numero3 = null;
        final Integer opcion = null;
        final String palabra = "Hola como estas?";

        //System.out.println("Usando [int] vemos que no se puede almacenar [null]: " + numero3);
        System.out.println("Usando [Intenger] vemos que si puede almacenar [null]: " + opcion);


        //  ### CADENAS ### 

        System.out.println("    ### Cadenas ###");
        System.out.println(palabra);

    
    
    }

}