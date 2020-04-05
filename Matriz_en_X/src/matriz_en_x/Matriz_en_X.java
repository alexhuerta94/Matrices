
package matriz_en_x;

import java.util.Scanner;

public class Matriz_en_X {

    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
          
          int m,n;
     System.out.print("Ingrese filas: ");
    m=entrada.nextInt();
    System.out.print("Ingrese columnas: ");
    n=entrada.nextInt();

char matriz[][] = new char [m][n];

    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if (i==j || i+j==matriz.length-1){
                matriz[i][j] = '*';
            }
                else{
                        matriz[i][j] = ' ';
                        }
            
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
    