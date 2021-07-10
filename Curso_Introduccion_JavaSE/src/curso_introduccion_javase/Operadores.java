
package curso_introduccion_javase;
//Practica para conocer el uso de operadores aritmeticos incrementales y decrementales
public class Operadores {

    public static void main(String[] args) {
      //se usan operadores aritmeticos para de terminar como se comporta el valor de una variable 
      //al aplicar incrementos y decrementos
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); 
//aplicar decremento
        lives--; 
        System.out.println(lives); 
//aplicar incremento
        lives++; 
        System.out.println(lives); 


 //uso de pre y post       
        int gift = 100 + ++lives; 
        System.out.println(gift);
        System.out.println(lives); 

    }
    
}
