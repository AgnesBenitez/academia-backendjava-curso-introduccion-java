
package curso_introduccion_javase;
/**
 *
 * @author Joss
 */
public class ArrayS {
  public static void main(String[] args) {
       
        String[] android = new String[17];
        int days[] = new int[7];

        String[][] cities = new String[4][2]; //4 * 2 = 8

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        android[0] = "Apple Pie";
        android[1] = "Bannana Bread";
        android[2] = "Cupcake";
        android[3] = "Donut";
        android[4] = "ICE_CREAM";
         for (String androidVersion : android) {
            System.out.println(androidVersion);
        }
//Arreglo estilo matriz de paises
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";
System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
//ciclo para imprimir el arreglo
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for (String[] pair : cities) {
            for ( String name :pair) {
                System.out.println(name);
            }
        }

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);
//ciclo para imprimir matriz
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
    
}
