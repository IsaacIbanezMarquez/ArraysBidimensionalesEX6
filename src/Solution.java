




import java.util.Random;
import java.util.Scanner;


public class Solution
{
    public static void main(String[] args)
    {
        // 6. Donades dues taules quadrades numèriques enteres de dimensió n, calcula la seva suma. La suma de les taules s'efectua assignant a cada element de la nova taula la suma dels elements que ocupen la mateix fila i la mateixa columna.
        Scanner teclado = new Scanner (System.in);
        Random rand = new Random();

        System.out.println("Introduce numero de filas");
        int filas =teclado.nextInt();

        System.out.println("Introduce numero de columnas");
        int columnas =teclado.nextInt();

        int[][] a = new int [filas][columnas];
        int[][] b = new int [filas][columnas];
        int[][] suma = new int [filas][columnas];

        // Muestra la matriz a
        for (int i =0 ;i<filas;i++){
            for(int j=0;j<columnas;j++) {
                a[i][j]= rand.nextInt(10);
                System.out.print(" " + a[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("");
        // Muestra la matriz  b
        for (int i =0 ;i<filas;i++){
            for(int j=0;j<columnas;j++) {
                b[i][j]= rand.nextInt(10);
                System.out.print(" " + b[i][j] +" ");

            }
            System.out.println();
        }

        System.out.println();

        //Suma y muestra el resultado
        for (int i =0 ;i<filas;i++){
            for(int j=0;j<columnas;j++) {
                suma[i][j]=a[i][j]+b[i][j];
                System.out.print(" " + suma[i][j] +" ");

            }
            System.out.println();
        }
        teclado.close();

    }
}
