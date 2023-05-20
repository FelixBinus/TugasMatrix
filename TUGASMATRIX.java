import java.util.Scanner;

public class TUGASMATRIX {
     private static void NgeprintAr(int [][] datanya){
         
          
          for(int i = 0; i<3;i++){
               System.out.print("[");
               for(int j = 0; j<3;j++){
                    System.out.print(datanya[i][j]);

                    if(j < (3-1)){
                         System.out.print(", ");
                    }else{
                         System.out.print("]\n");
                    }
               }
          }System.out.println();
     }

     private static int[][] Jumlahan(int [][] trix1, int [][] trix2) {
          int[][] jumlahtrix = new int [3][3];
          
          for(int i = 0; i<3; i++){
               for(int j = 0; j <3; j++){
                    jumlahtrix [i][j] = trix1 [i][j] + trix2 [i][j];
               }
          }
          return jumlahtrix;
     }
     public static void main(String[] args) {
          Scanner mat = new Scanner(System.in);

          int [][] trix1 = new int[3][3];
          int [][] trix2 = new int[3][3];

          for(int i = 0; i<3; i++){
               for(int j = 0; j <3; j++){
                    System.out.println("Silahkan masukan angka anda untuk matrix pertama, baris "+ (i+1)+" kolom "+(j+1));
                    trix1[i][j] = mat.nextInt();
          }
     }
     System.out.println("\n");
     System.out.println("Matrix pertama anda adalah: ");
     NgeprintAr(trix1);


     for(int i = 0; i<3; i++){
          for(int j = 0; j <3; j++){
               System.out.println("Silahkan masukan angka anda untuk matrix kedua, baris "+ (i+1)+" kolom "+(j+1));
               trix2[i][j] = mat.nextInt();
     }
}
     System.out.println("\n");
     System.out.println("Matrix kedua anda adalah: ");
     NgeprintAr(trix2);

     System.out.println("\n");
     
     int [][] Nambah = Jumlahan(trix1, trix2);
     System.out.println("Penjumlahan kedua matrix anda yaitu: ");
     NgeprintAr(Nambah);

     }
     
     
}


     