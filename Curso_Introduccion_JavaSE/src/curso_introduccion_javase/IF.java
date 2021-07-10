
package curso_introduccion_javase;
//uso de if

public class IF {

    public static void main(String[] args) {
          boolean isBluetoothEnabled = false;//definicion de booleanos
        int fileSended = 3;

        if (isBluetoothEnabled) {
           //validacion en IF
            fileSended++;
            System.out.println("Archivo enviado");

        }else{
            fileSended--;
            System.out.println("Por favor enciente tu Bluetooth, para iniciar la transferencia");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
       
    }
    
}
