
package matriz_en_diagonal;

import java.util.Scanner;

public class Matriz_en_diagonal {

    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
       
       int m,n;
       
       System.out.print("Ingrese Filas: ");
       m= entrada.nextInt();
       System.out.print("Ingrese Columnas: ");
       n=entrada.nextInt();
       char Matriz [][] =new char [m][n];
       
       for (int i=0; i<n;i++){
           
           for(int j=0; j<m; j++){
               if (i+j<Matriz.length-1 || i+j>Matriz.length-1){
                   Matriz[i][j]= '*';
                    }
              
               
              else{  Matriz [i][j] = ' '; 
              
           } 
           
           System.out.print(Matriz[i][j]+" ");
       } 
           System.out.println("");
    }
    
  }
}