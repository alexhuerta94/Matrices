
package matriz_cuadro;

 public class Matriz_cuadro {

    public static void main(String[] args) {
    
     int matriz[][]= new int [7][7];
       for (int i=0; i<7; i++){
           for (int j=0; j<7; j++){
               
               if((i==0) || (i==6)){
                   matriz[i][j]=1;
               }
               else
                   if((j==0) || (j==6)){
                       matriz[i][j]=1;
                   }
               System.out.print(matriz[i][j]+" ");
           }
        System.out.println(" ");
       }
    }   
 }