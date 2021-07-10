
package curso_introduccion_javase;

public class Operaciones_matematicas {
//uso de la clase math para realizar operaciones matematicas con calculos
  
    public static void main(String[] args) {
        // TODO code application logic here
       //definicion de variables
        double x = 2.1;
        double y = 3;

        //Retorna un valor entero hacia arriba
        System.out.println(Math.ceil(x));

        //Retorna un valor entero hacia abajo
        System.out.println(Math.floor(x));

        //Retorna un valor de potencia con respecto a otro
        System.out.println(Math.pow(x,y));

        //Retorna valor mayor
        System.out.println(Math.max(x,y));

        //Retorna la raíz cuadrada
        System.out.println(Math.sqrt(y));

      //Metodo que retorna el area de circulo
        System.out.println(Math.PI * Math.pow(y,2));

       //Metodo que retorna el area de la esfera
        //4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera
        //(4/3)*pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3)) ;
    }
    
}
