
package matriz_en_x_dos;

import java.util.Scanner;

public class Matriz_en_x_dos {

    public static void main(String[] args) {
    int i,j;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese Filas(par): ");

        int m=teclado.nextInt();
        int y=m-1;
        System.out.print("Ingrese Columnas(par): ");

        int n=teclado.nextInt();

        String matriz [][]= new String [m][n];

        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    matriz[i][j]=" ";  
                }else{
                    matriz[i][j] = "*";
                }    
             }

            }
            for(j=0;j<n;j++){
                matriz[y][j]=" ";    
                y--;
           }

           for(i=0; i<m;i++){
            for(j=0;j<n;j++){
              System.out.print(matriz[i][j]);
            }
            System.out.println();
         }

        
    }
}