
package curso_introduccion_javase;
public class Operaciones_logicas {
    //practica para ver el uso de los operadores logicos en java 
public static void main(String[] args) {
       int a = 8;
        int b = 5;

        //ASIGNACION
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente a b? -> " + (a != b));

        //RELACION
        System.out.println("a es mayor a b? -> " + (a > b));
        System.out.println("a es menor a b? -> " + (a < b));
        System.out.println("a es mayor o igual a b? -> " + (a >= b));
        System.out.println("a es menor o igual a b? -> " + (a <= b));
//sentencias IF,ELSE IF
        if (a == b) {
            System.out.println("a es igual a b");

        }else if((a != b) && (a > b)){
            System.out.println("a es diferente a b");

        }else if(a > b){
            System.out.println("a es mayor a b");

        }else if(a < b){
            System.out.println("a es menor a b");

        }else if(a >= b){
            System.out.println("a es mayor o igual a b");

        }else if(a <= b){
            System.out.println("a es menor o igual a b");

        }

    }
    
}
