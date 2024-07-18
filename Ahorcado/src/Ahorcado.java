import java.util.Scanner;

public class Ahorcado{
    public static void main(String[] args) throws Exception {

        //Clase scanner que permite el ingreso por teclado.
        Scanner in = new Scanner(System.in);

        //Declaraciones y Asignaciones.
        String palabrasecreta = "inteligencia";
        int intentosMaximos  = 10;
        int intentosActuales = 0;
        boolean palabraadivinada = false;

        //Arreglos.
        char[] letrasAdivinadas = new char[palabrasecreta.length()];

        //Estructura de control: iterativa (bucle).
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_' ;
        }

        //Estructura de control: iterativa (bucle).
        while (!palabraadivinada && intentosActuales < intentosMaximos) {
            
            //valueOf se utiliza para obtener el valor completo del array. Ejemplo: H|o|l|a = Hola
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas)+ " (" + palabrasecreta.length() + " letras) ");

            System.out.println("Introduce una letra, por favor: ");

            //Usamos la clase scanner para pedir una letra.
            char letra = Character.toLowerCase(in.next().charAt(0));


            boolean letraCorrecta = false;

            //Estructura de control: iterativa (bucle).
            for (int i = 0; i < palabrasecreta.length(); i++) {

                //Estructura de control: Condicional
                if (palabrasecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                } 
            }

            if(!letraCorrecta){
                intentosActuales++;
                System.out.println("Incorrecto! Te quedan " + (intentosMaximos-intentosActuales) + " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabrasecreta)){
                palabraadivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: " + palabrasecreta);
            }
            
        }

        if (!palabraadivinada) {

            System.out.println("Te has quedado sin intentos");
            
        }
        
        in.close();


    }
}
