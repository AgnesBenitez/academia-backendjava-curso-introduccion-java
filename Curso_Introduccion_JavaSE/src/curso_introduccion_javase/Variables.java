
package curso_introduccion_javase;
public class Variables {
    //practica para ver los ejercicioos del uso de variables como asignacion de valores y nombres
    public static void main(String[] args) {
       //  variable speed de tipo int 
        int spped;

        
        spped = 10; 
        System.out.println(spped);

        //  variable y asignarle un valor:
        int salary = 1000;

        // variable de tipo String:
        String eployeeName = "Josh";
        System.out.println(eployeeName);
        
        ///////////////////////////////////////////////////
        //Nombres de variables
        int celphone = 33337777;
        int celPhone = 55553333;
        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName = "Spain";
        String _backgroundColor = "Green";

        String currency$ = "MXN";
        String background_color = "BLUE";

        //constantes
        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        //Lower Camel Case
        String fullName = "Josh";
        int sizeInCentimeters = 26;
    }
    
}
