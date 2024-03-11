import java.util.Scanner;

public class Soal3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan a: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan bilangan b: ");
        int b = input.nextInt();
        
        int gcd = hitungGCD(a, b);
        
        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + gcd);
        
        input.close();
    }
    
    public static int hitungGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hitungGCD(b, a % b);
    }
}
