
package curso_introduccion_javase;
public class WhileLOOP {

   static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        // TODO code application logic here
         turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }

    }
    public static void printSOS(){//impresion de caracteres
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
    
}
