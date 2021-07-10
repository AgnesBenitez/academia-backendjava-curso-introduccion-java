package curso_introduccion_javase;

//Practica para ver los tipos de datos disponibles en java ,asi como la resolucion de ejrcicios del tipo aritmetico
//
public class Hola_mundo {

    
    public static void main(String[] args) {
     System.out.println("Hola mundo") ;
    //declarando una variable
    int velocidad=10;
    String Nombre_E="Joshua Benitez P";
   
     //delimitacion de tipos de datos   
        int n = 1234567890;
        long nL = 12345678901L;
        double nD = 123.456;
        float nF = 123.456F;
        int salary = 1000; 
        double pension = salary*0.03; //double
        double totalSalary = salary - pension; //double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        String employeeName = "Joshua Benitez Prudente"; //string
       //operaciones
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);     
        
       
    }
    
}
