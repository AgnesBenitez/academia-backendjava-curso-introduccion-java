
package curso_introduccion_javase;
public class Funcionae {
//Programacion Funcional JAVA
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);

   //se llaman las funciones y se le mandan parametros 
        sphereArea(y);
     sphereVolumena(y);
     System.out.println("Pesos a Dolares: "+converToDolar(1000, "COP"));

    }
//definicion de las funciones
    public static double circleArea(double r){//funcion area de circulo
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){//funcion area de esfera
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumena(double r){//funcion volumen esfera
        return (4/3) * Math.PI * Math.pow(r,3);
    }
   
    public static double converToDolar(double quantity, String currency){//funcion de conversion de dolares
        //MXN COP
        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
    
}
