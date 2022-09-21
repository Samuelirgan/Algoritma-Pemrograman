import java.util.Scanner;
public class Pattern{
    private static Scanner scan;
    public static void main(String[]args){
        scan = new Scanner(System.in);
        System.out.print("Masukan Nilai n = ");
        int pola = scan.nextInt();
        
        int k = pola;
        for (int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                if(j == i || i + j == k-1){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}