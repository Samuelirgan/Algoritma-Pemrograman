import java.util.Scanner;
public class Percabangan{
    public static void main(String[]args){
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama = ");
        nama = scan.nextLine();
        System.out.print("Nilai = ");
        nilai = scan.nextInt();

        if( nilai>=60){
            System.out.println("Selamat " + nama + ", anda Lulus!");
        } else {
            System.out.println("Maaf" + nama + ", anda Tidak Lulus");
        }
    }
}