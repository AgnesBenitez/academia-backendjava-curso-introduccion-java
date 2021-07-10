
package curso_introduccion_javase;
//Practica de dowhile 

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // TODO code application logic here
        
 int response = 0;
//definicion del menu con switch
            do {
                System.out.println("Selecciona el número de la opción deseada");
                System.out.println("1. WANDA");
                System.out.println("2. AGNES");
                System.out.println("0. ERROR");
//objeto de la classe scanner para leer datos
                Scanner sc = new Scanner(System.in);
                response = Integer.valueOf(sc.nextLine());
//cases 
//break para salir del menu
                switch (response) {
                    case 0:
                        System.out.println("Gracias por visitarnos");
                        break;
                    case 1:
                        System.out.println("WANDA");
                        break;
                    case 2:
                        System.out.println("AGNES");
                        break;
                    default:
                        System.out.println("Selecciona una opción correcta");
                }
            } while (response != 0);

            System.out.println("Se terminó el programa");        
        
    }
    
}
