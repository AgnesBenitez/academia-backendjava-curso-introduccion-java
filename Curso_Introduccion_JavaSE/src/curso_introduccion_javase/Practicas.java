
package curso_introduccion_javase;

public class Practicas {

    public static void main(String[] args) {
       
    
 //Variables
//Ejercicio 1.
//Ponte creativo y preséntanos a tu familia con variables, utiliza todos los tipos y cantidad 
//de variables que puedas, no olvides las convenciones de nombres Camel Case
    
    int myAge = 23;
    int myHusbandAge = 25;
    double momAge = 42;
    float fatherAge = 52;
    short brotherAge = 26;
    long grandmotherAge = 70;
    
    String MY_NAME="Joshua Benitez Prudente";
    String MY_HUSBAND="Oswaldo Quintana";
    String MOM_NAME="Maria de Lourdes";
    String FATHER_NAME="Sergio Benitez";
    String Brother_NAME="Osiel Benitez Prudente";
    String GRANDMOTHER_NAME="Joshua Benitez Prudente";
    
 //Aqui imprimo
  
    System.out.println("Esta es mi familia");
    System.out.println("Esta soy yo :"+ MY_NAME + "y tengo " +  myAge);
    System.out.println("Este es mi novio :"+ MY_NAME + "y tengo " +  myHusbandAge);
    System.out.println("Ella es mi madre " + MOM_NAME + "y tiene" + momAge);
    System.out.println("El es mi padre " + FATHER_NAME + "y tiene"+ fatherAge);
    System.out.println("El es mi hermano " + Brother_NAME + "y tiene" + brotherAge);
    System.out.println("Ella es mi abuela " + GRANDMOTHER_NAME + "y tiene" + grandmotherAge);
    
    
    //Casting
//Ejercicio 2

//Usando los dos tipos de casting que aprendiste 
//(implícito y explícito), resuelve los siguientes 
//casteos indicando qué tipo es y si se está calculando estimación o exactitud.
/*
char c = ‘z’; conviertelo a int
int i = 250; conviertelo a long y luego de long a short
double d = 301.067; conviertelo a long
int i = 100; súmale 5000.66 y conviertelo a float
int i = 737; multiplícalo por 100 y conviertelo a byte
double d = 298.638; divídelo entre 25 y conviertelo a long
*/
//Conversion
   char c = 'z'; 
        int i = 250;
        double d = 301.067; 
        
        
        System.out.println("\t CONVERSION CHAR A INTEGER:\t");
        System.out.println("Tamaño var tipo CHAR bits :\t" + Character.SIZE+ "\tbits");
        System.out.println("Tamaño var tipo CHAR bytes:\t" + Character.BYTES + "\tbytes");
        
        int ci = (int) c; 
        System.out.println("Valor CHAR c:\t" + c);
        System.out.println("Char convertido a integer :\t" + ci + "\t-Valor Correspondiente a la tabla ASCII");

       
        long  iLong = i; 
        short iShort  = (short) iLong ; 
        System.out.println("Tamaño var tipo INTEGER bits :\t" + Integer.SIZE + "\tbits");
        System.out.println("Tamaño var tipo INTEGER bytes:\t" + Integer.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo INTEGER Valor MAX :\t" + Integer.MAX_VALUE);
        System.out.println("Tamaño var tipo INTEGER Valor MIN :\t" + Integer.MIN_VALUE);
        
        System.out.println("\t CONVERSION A LONGER\t");
        System.out.println("\"Tamaño var LONGER bits :\t" + Long.SIZE + "\tbits");
        System.out.println("\"Tamaño var LONGER bytes :\t" + Long.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo LONGER Valor MAX :\t" + Long.MAX_VALUE);
        System.out.println("Tamaño var tipo LONGER Valor MIN :\t" + Long.MIN_VALUE);
        System.out.println("Viendo la var iLong :\t" + iLong );
        
        System.out.println("\t CONVERSION A SHORT:\t");
        System.out.println("\"Tamaño var SHORT bits :\t" + Short.SIZE + "\tbits");
        System.out.println("\"Tamaño var SHORT bytes :\t" + Short.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo SHORT Valor MAX :\t" + Short.MAX_VALUE);
        System.out.println("Tamaño var tipo SHORT Valor MIN :\t" + Short.MIN_VALUE);
        System.out.println("Viendo la var iShort :\t" + iShort);
        
        System.out.println("\t CONVERSION DOUBLE a LONG:\t");
        long dLong = (long) d; // casting explicito debido a la perdida de memoria
        System.out.println("\"Tamaño var DOUBLE bits :\t" + Double.SIZE + "\tbits");
        System.out.println("\"Tamaño var DOUBLE bytes :\t" + Double.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo DOUBLE Valor MAX :\t" + Double.MAX_VALUE);
        System.out.println("Tamaño var tipo DOUBLE Valor MIN :\t" + Double.MIN_VALUE);
        System.out.println("Viendo la var dLong :\t" + dLong);
       
        System.out.println("\t CONVERSION INTEGER A FLOAT:\t");
        i = 100;
        float iFloat = (float) (i+5000.66);
        System.out.println("\"Tamaño var FLOAT bits :\t" + Float.SIZE + "\tbits");
        System.out.println("\"Tamaño var FLOAT bytes :\t" + Float.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo FLOAT Valor MAX :\t" + Float.MAX_VALUE);
        System.out.println("Tamaño var tipo FLOAT Valor MIN :\t" + Float.MIN_VALUE);
        System.out.println("resultado de i + 5000.66 :\t" + (i+5000.66) );
        System.out.println("Viendo la var iFloat :\t" + iFloat);
       
        i *= 737;
        byte iByte = (byte) i;
        System.out.println("\t CONVERSION INTEGER A BYTE:\t");
        System.out.println("\"Tamaño var BYTE bits :\t" + Byte.SIZE + "\tbits");
        System.out.println("\"Tamaño var BYTE bytes :\t" + Byte.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo BYTE Valor MAX :\t" + Byte.MAX_VALUE);
        System.out.println("Tamaño var tipo BYTE Valor MIN :\t" + Byte.MIN_VALUE);
        System.out.println("Resultado de i*737 :\t" + i);
        System.out.println("Viendo la var iByte :\t" + iByte);
        
        System.out.println("\t CONVERSION DOUBLE A LONG :\t");
        d = 298.638;
        long dLong2 = (long) (d/25);
        System.out.println("Resultado de d/25 :\t" + (d/25));
        System.out.println("Viendo la var dLong2 :\t" + dLong2);
}  
}
