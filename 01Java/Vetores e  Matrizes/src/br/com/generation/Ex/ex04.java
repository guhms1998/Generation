
import java.util.Scanner;
public class ExercicioMatrize4 {
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int[][]m3 new int [3][3];
         int somatotal = 0;
         int somadiagonal =0;
                        
                            
         for(int 1 = 0; 1 < m3.length;1++) {
             for (int c = 0; c< m3[1].length;c++) {
                  System.out.println("Digite os valores da matriz");
                  m3[1][c] = input.nextInt();
                  somatotal = somatotal+m3[1][c];
              }System.out.println();
                           
         for (int i - 0;i<3;i++) {
             somadiagonal = somadiagonal+ n3[i][i];
         System.out.println("0 valor total da matriz é: " + somatotal);
         System.out.println("o valor da soma da diagonal é: + somadiagonal);
         input.close();
}