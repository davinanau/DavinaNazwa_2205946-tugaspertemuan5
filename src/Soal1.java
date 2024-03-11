import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        repeatText(N);
        
        input.close();
    }
    
    public static void repeatText(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
}
