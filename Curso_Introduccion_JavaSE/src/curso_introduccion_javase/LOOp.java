
package curso_introduccion_javase;
public class LOOp {
//practica para al presentacion de una linea de caracteres mediante el ciclo FOR
     static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        // TODO code application logic here
         turnOnOffLight();
        for (int i = 1; i <= 10; i++) {
            printSOS();
        }
    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
    }
    

