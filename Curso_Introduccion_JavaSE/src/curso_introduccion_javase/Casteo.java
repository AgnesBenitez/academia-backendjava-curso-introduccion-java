
package curso_introduccion_javase;

public class Casteo {
//practica para realizar casteo de los valores de variables
    public static void main(String[] args) {
       
        //definicion en double
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //casteo a entero
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

//casteo de int a double
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
        double c = (double) a/b;
        System.out.println(c);

  //al realizar un casteo de un tipo char a algun tipo tipo numerico nos devuelve su numero 
  //de notacion ASCCI
        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

       
    }
    
}
